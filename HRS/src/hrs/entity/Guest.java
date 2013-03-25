package hrs.entity;

public class Guest {

    private String date;
    private String name;
    private String address;
    private String gender;
    private int age;
    private String contacts;
    private String email;
    
    private String roomtype;
    private int roomnum;
    private String checkin;
    private String checkout;
    private int occupynum;

    public Guest(String date, String name, String address, String gender, int age, String contacts, String email, String roomtype, int roomnum, String checkin, String checkout, int occupynum) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOccupynum() {
        return occupynum;
    }

    public void setOccupynum(int occupynum) {
        this.occupynum = occupynum;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
    
    
}