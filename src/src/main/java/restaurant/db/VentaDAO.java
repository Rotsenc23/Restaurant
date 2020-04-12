/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.restaurant.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rotse
 */
public  class VentaDAO {
    
    public void saveVenta(Double monto, Integer valoracion, Integer menuId) {

        Connection con = MyConnection.getConnection();

        PreparedStatement ps;

        try {       
            ps = con.prepareStatement("INSERT INTO VENTA (FECHA,MONTO,VALORACION,MENU_ID) VALUES (?,?,?,?)");

            ps.setTimestamp(1, VentaDAO.getCurrentTimeStamp());
            ps.setDouble(2,monto );
            ps.setInt(3, (valoracion!=null)?valoracion:0);
            ps.setInt(4, menuId);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("VENTA GUARDADA");
            }

        } catch (SQLException ex) {
            System.out.println("FALLO " + ex);
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    private static java.sql.Timestamp getCurrentTimeStamp() {
    java.util.Date today = new java.util.Date();
    return new java.sql.Timestamp(today.getTime());
}
    
      public void getVentasOrderByTiempoEsperaMonto(JTable table,String dateInit, String dateEnd) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {

            String query = "select p.NOMBRE, m.PRECIO, m.TIEMPO_ESPERA  from menu m " +
                           "inner join plato p on m.id = p.menu_id " +
                           "inner join venta v on m.id = v.menu_id " +
                           "where  m.FECHA BETWEEN ? AND ? " +
                           "ORDER BY M.TIEMPO_ESPERA, M.PRECIO ASC limit 500";

            ps = con.prepareStatement(query);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            ps.setDate(1, java.sql.Date.valueOf(dateInit));
            ps.setDate(2, java.sql.Date.valueOf(dateEnd));
            ResultSet rs = ps.executeQuery();

            Object[] row;
            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getString(1);
                row[1] = rs.getDouble(2);
                row[2] = rs.getInt(3);
              model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
