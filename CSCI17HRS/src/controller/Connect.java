package controller;

import java.sql.*;

public class Connect {
    static Connection connection = null; 
    static Statement state = null;
    static ResultSet resset = null;
 
     public Connect(){
         connection = getConnection();
     }
     
     public static Connection getConnection() {
                try {
                          Class.forName("com.mysql.jdbc.Driver").newInstance();
                          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hreserve", "root", "");
                          state = connection.createStatement();
                } catch (Exception ex) {
                          ex.printStackTrace();
                }
     
          return connection;
     }
}