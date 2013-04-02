package DAO;

import entity.Guest;
import java.sql.*;
import java.util.ArrayList;


public class HotelDAO extends BaseDAO{
    
    public HotelDAO(){
    }
    
   public void SaveData(String sql) throws Exception{
       state.execute(sql);
   }
   
     public void deleteRes(String sql) throws SQLException{
       //String sql = "DELETE FROM flightdetails" + "WHERE flightno = id" + flightno;
        state.executeUpdate(sql);
       
   } 

   public ArrayList<Guest> getHotelRes(String sql) throws Exception {
       ArrayList<Guest> list = new ArrayList<>();
       Guest info = null;
       state = connection.createStatement();
       resset = state.executeQuery(sql);
       
       while(resset.next()) {
           info = new Guest(resset.getString("name"), resset.getString("address"),
                   resset.getString("date"), resset.getString("gender"), resset.getString("age"),
                   resset.getString("contacts"), resset.getString("email"), resset.getString("roomtype"),
                   resset.getString("roomnum"), resset.getString("checkin"), resset.getString("checkout"),
                   resset.getString("occupynum"));
           
           list.add(info);
       }
       return list;
       }
   }
