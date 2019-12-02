
package java_contact_app;

/**
 *
 * @author Aboubcar Doumbouya
 */
public class Contact {
    private Integer cid;
    private String fname;
    private String lname;
    private String groupc;
    private String phone;
    private String email;
    private String adress;
    private byte [] pic;
    private int userId;

    public Contact() {}

    public Contact(Integer cid, String fname, String lname, String groupc, String phone, String email, String adress, byte[] pic, int userId) {
        this.cid = cid;
        this.fname = fname;
        this.lname = lname;
        this.groupc = groupc;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
        this.pic = pic;
        this.userId = userId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGroupc() {
        return groupc;
    }

    public void setGroupc(String groupc) {
        this.groupc = groupc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
}
