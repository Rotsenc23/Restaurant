/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.restaurant.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
