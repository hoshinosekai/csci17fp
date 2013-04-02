package DAO;

import java.sql.*;

public class BaseDAO {
    protected  static Connection connection = null; 
    protected  static Statement state = null;
    protected  static ResultSet resset = null;
 
     public BaseDAO(){
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