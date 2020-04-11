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
                System.out.println("Se guardo");
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
}
