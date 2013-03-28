package hrs.controller;

import hrs.model.GuestModel;
import hrs.gui.Reservation;
import hrs.entity.Guest;

public class Controller 
{
 
    private Reservation reserve;
    private GuestModel model;
    
    public Controller(Reservation reserve,  GuestModel model){
        this.model = model;
        this.reserve = reserve;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Add a Booking">
    public void add(){
        
        model.getBooker().setDate(reserve.getFrmtxtDate().getText());
        model.getBooker().setAddress(reserve.getTxtAddress().getText());
        model.getBooker().setAge(Integer.parseInt(reserve.getTxtAge().getText()));
        model.getBooker().setCheckin(reserve.getTxtCheckIn().getText());
        model.getBooker().setCheckout(reserve.getTxtCheckOut().getText());
        model.getBooker().setContacts(reserve.getTxtContact().getText());
        model.getBooker().setEmail(reserve.getTxtEmail().getText());
        model.getBooker().setGender(reserve.getTxtGender().getText());
        model.getBooker().setName(reserve.getTxtName().getText());
        model.getBooker().setOccupynum(Integer.parseInt(reserve.getTxtOccupant().getText()));
        model.getBooker().setRoomnum(Integer.parseInt(reserve.getTxtRoomNum().getText()));
        model.getBooker().setRoomtype(reserve.getTxtRoomType().getText());
        
        model.setBooker(new Guest());
        reset();
    }
    //</editor-fold>
    
    public void view()
    {
        model.getBookings();
    }
    
    public void reset(){
        
        reserve.getFrmtxtDate().setText("");
        reserve.getTxtAddress().setText("");
        reserve.getTxtAge().setText("");
        reserve.getTxtCheckIn().setText("");
        reserve.getTxtCheckOut().setText("");
        reserve.getTxtContact().setText("");
        reserve.getTxtEmail().setText("");
        reserve.getTxtGender().setText("");
        reserve.getTxtName().setText("");
        reserve.getTxtOccupant().setText("");
        reserve.getTxtRoomNum().setText("");
        reserve.getTxtRoomType().setText("");
    }
}