package src.main.java.restaurant.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restore_restaurant", "root", "admin");

        } catch (Exception ex) {
            System.out.println("No se pudo conectar a la base de datos:  "+ex.getMessage());
        }

        return con;

    }
}
