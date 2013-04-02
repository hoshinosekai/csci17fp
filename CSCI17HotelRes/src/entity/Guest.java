package entity;

public class Guest {

    private String name;
    private String address;
    private String date;
    private String gender;
    private String age;
    private String contacts;
    private String email;
    
    private String roomtype;
    private String roomnum;
    private String checkin;
    private String checkout;
    private String occupynum;

    public Guest(String name, String address, String date, String gender, String age, String contacts, String email, String roomtype, String roomnum, String checkin, String checkout, String occupynum) {
        this.date = date;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.contacts = contacts;
        this.email = email;
        this.roomtype = roomtype;
        this.roomnum = roomnum;
        this.checkin = checkin;
        this.checkout = checkout;
        this.occupynum = occupynum;
    }

    public Guest() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getOccupynum() {
        return occupynum;
    }

    public void setOccupynum(String occupynum) {
        this.occupynum = occupynum;
    }

}