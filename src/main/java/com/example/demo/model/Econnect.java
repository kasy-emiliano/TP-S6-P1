
package com.example.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Econnect {
      public static Connection connexion() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.driver");
            con = (Connection) DriverManager.getConnection("jdbc:postgresql://containers-us-west-180.railway.app:6027/railway", "postgres", "WpZhHXX7Dl3KMFNqu9fu");
           con.setAutoCommit(false);
            System.out.println("Connectee ahn");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Tsy mety mi-connecte❌");
        }
        return con;
    }

    // Close Connection 
    public static void closeConnection(Connection con) throws Exception {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
