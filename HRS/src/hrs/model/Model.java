package hrs.model;

import hrs.entity.Guest;
import java.util.ArrayList;

public class Model {

    private Guest booker;
    private ArrayList<Guest> bookings;

    public Model() {
    
        booker = new Guest();
        bookings = new ArrayList<>();
    } 
    
    public Guest getBooker(){
        return booker;
    }
    public void setBooker(Guest booker){
        this.booker = booker;
    }
    
    public ArrayList<Guest> getBookings(){
        return bookings;
    }
    public void setBookings(ArrayList<Guest> bookings){
        this.bookings = bookings;
    }
}

