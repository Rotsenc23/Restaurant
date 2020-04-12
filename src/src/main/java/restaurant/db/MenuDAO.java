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
public class MenuDAO {

public void saveMenu(String date, String description, Double precio, Integer tiempoEspera) { //
        Connection con = MyConnection.getConnection();
        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO menu (fecha,descripcion,precio,tiempo_espera) VALUES (?,?,?,?)");
            ps.setDate(1, java.sql.Date.valueOf(date));
            ps.setString(2, description);
            ps.setDouble(3, precio);
            ps.setInt(4, tiempoEspera);

            if (ps.executeUpdate() > 0) {
                System.out.println("MENU GUARDADO");
            }
        } catch (SQLException ex) {
            System.out.println("FALLO " + ex);
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getMaxMenuId() {

        int menuId = 0;

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT MAX(ID) as ID FROM `menu`");

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                menuId = rs.getInt("ID");
            }

        } catch (SQLException ex) {
            System.out.println("FALLO " + ex);
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return menuId;

    }
    
    public void getMenu(JTable table,String date) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {

            String query = "select m.ID, m.FECHA, m.DESCRIPCION, m.PRECIO,m.TIEMPO_ESPERA,p.NOMBRE,p.RECETA,c.DESCRIPCION "
                    + " from menu m inner join plato p on m.id = p.menu_id inner join categoria c on p.id  = c.plato_id"
                    + " where m.fecha = ?";

            ps = con.prepareStatement(query);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            ps.setDate(1, java.sql.Date.valueOf(date));

            ResultSet rs = ps.executeQuery();

            Object[] row;
            while (rs.next()) {
                row = new Object[8];
                row[0] = rs.getInt(1);
                row[1] = rs.getDate(2);
                row[2] = rs.getString(3);
                row[3] = rs.getDouble(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
               model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
