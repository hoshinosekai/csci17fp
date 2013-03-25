/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
/**
 *
 * @author Chan 'n' Villanueva
 */
public class BookerModel {

    private BookerEntry booker;
    private ArrayList<BookerEntry> bookings;

    public BookerModel() {
    
        booker = new BookerEntry();
        bookings = new ArrayList<BookerEntry>();
    } 
    
    public BookerEntry getBooker(){
        return booker;
    }
    public void setBooker(BookerEntry booker){
        this.booker = booker;
    }
    
    public ArrayList<BookerEntry> getBookings(){
        return bookings;
    }
    public void setBookings(ArrayList<BookerEntry> bookings){
        this.bookings = bookings;
    }
}
