
package entity;


public class Room {
    private String rId;
    private String rcapacity;
    private String rtype;
    private String rIsavail;
    
    public Room (){
    }

    public Room(String rId, String rcapacity, String rtype, String rIsavail) {
        this.rId = rId;
        this.rcapacity = rcapacity;
        this.rtype = rtype;
        this.rIsavail = rIsavail;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public String getrIsavail() {
        return rIsavail;
    }

    public void setrIsavail(String rIsavail) {
        this.rIsavail = rIsavail;
    }

    public String getRcapacity() {
        return rcapacity;
    }

    public void setRcapacity(String rcapacity) {
        this.rcapacity = rcapacity;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }
    
    
    
}
