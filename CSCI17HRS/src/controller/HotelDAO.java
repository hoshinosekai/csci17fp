package controller;

import entity.Guest;
import java.sql.*;
import java.util.ArrayList;


public class HotelDAO extends Connect{
    
    public HotelDAO(){
    }
    
   public void SaveData(String sql) throws Exception{
      // state = connection.createStatement();
       state.execute(sql);
   }
   
     public void deleteRes(String sql) throws SQLException{
       //String sql = "DELETE FROM flightdetails" + "WHERE flightno = id" + flightno;
        state.executeUpdate(sql);
       
   } 

   public ArrayList<Guest> getBookFlightInfos(String sql) throws Exception {
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
