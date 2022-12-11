/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

import java.sql.*;



/**
 *
 * @author dheer
 */
public class DatabaseConnector {
    public static Connection getConnection() throws Exception{
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection cn= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/inneedapplicationdatabase","root","root");
        
        return cn;
    }
}
