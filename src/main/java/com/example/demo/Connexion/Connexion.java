package com.example.demo.Connexion;


import java.sql.DriverManager;

/**
 *
 * @author Cedrick
 */
public class Connexion {
     public java.sql.Connection con() throws Exception{
        Class.forName("org.postgresql.driver");
        return DriverManager.getConnection("jdbc:postgresql://containers-us-west-180.railway.app:6027/railway","postgres","WpZhHXX7Dl3KMFNqu9fu");
    }
    
}
