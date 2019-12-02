package java_contact_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aboubcar Doumbouya
 */
public class ContactQuery {

    public boolean inserContact(Contact cont) {
        
        boolean contactIsCreated = true;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("INSERT INTO `mycontacts`(`fname`, `lname`, `groupc`, `phone`, `email`, `adress`, `pic`, `userId`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroupc());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdress());
            ps.setBytes(7, cont.getPic());
            ps.setInt(8, cont.getUserId());
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "New Contact added");
                contactIsCreated = true;
            } else {
                JOptionPane.showMessageDialog(null, "Something Wrong");
                contactIsCreated = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contactIsCreated;
    }
    
    //Créer une liste de contacts
    
    public ArrayList<Contact> contatctList(int userId){
        
        ArrayList<Contact> clist = new ArrayList<>();
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `fname`, `lname`, `groupc`, `phone`, `email`, `adress`, `pic` FROM `mycontacts` WHERE userId="+userId);
            
               Contact ct;
        
        while(rs.next()){
            ct = new Contact(rs.getInt("id"), 
                    rs.getString("fname"), 
                    rs.getString("lname"), 
                    rs.getString("groupc"), 
                    rs.getString("phone"), 
                    rs.getString("email"), 
                    rs.getString("adress"), 
                    rs.getBytes("pic"),
                    0);
            
            clist.add(ct);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clist;
        
    }
}
