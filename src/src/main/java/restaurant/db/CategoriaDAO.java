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
public class CategoriaDAO {
    
    public void saveCategoria(String descripcion,Integer menuId) {

        Connection con = MyConnection.getConnection();

        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO CATEGORIA (DESCRIPCION,PLATO_ID) VALUES (?,?)");

            ps.setString(1, descripcion);
            ps.setInt(2, menuId);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("CATEGORIA GUARDADA");
            }

        } catch (SQLException ex) {
            System.out.println("FALLO " + ex);
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
