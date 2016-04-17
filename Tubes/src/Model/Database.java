/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Baldo
 */
public class Database {
    private Connection conn = null;
    public Connection getConnection() throws SQLException{
        if(conn == null){
            try {
                String url = "jdbc:mysql://localhost/sisfogudang";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url, username, password);
                //load jdbc driver
                //Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex);
            }        
        }
        return conn;
    }
}