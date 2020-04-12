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
    
    public void saveVenta(String fecha, Double monto, Integer valoracion, Integer menuId) {

        Connection con = MyConnection.getConnection();

        PreparedStatement ps;

        try {       
            ps = con.prepareStatement("INSERT INTO VENTA (FECHA,MONTO,VALORACION,MENU_ID) VALUES (?,?,?,?)");

            ps.setDate(1, java.sql.Date.valueOf(fecha));
            ps.setDouble(2,monto );
            ps.setInt(3, valoracion);
            ps.setInt(4, menuId);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("VENTA GUARDADA");
            }

        } catch (SQLException ex) {
            System.out.println("FALLO " + ex);
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
