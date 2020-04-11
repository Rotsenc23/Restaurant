package src.main.java.restaurant.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PlatoDAO {

public void savePlato(String nombre,String receta, Integer menuId) {

        Connection con = MyConnection.getConnection();

        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO plato (nombre,receta,menu_id) VALUES (?,?,?)");

            ps.setString(1, nombre);
            ps.setString(2, receta);
            ps.setInt(3, menuId);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Se guardo");
            }

        } catch (SQLException ex) {
            System.out.println("FALLO " + ex);
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

  public int getMaxPlatoId(){
       
        int menuId = 0;
    
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT MAX(ID) as ID FROM `PLATO`");
 
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
              menuId = rs.getInt("ID");
            }
           
        } catch (SQLException ex) {
              System.out.println("FALLO " + ex);
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return menuId;
       
    }

}
