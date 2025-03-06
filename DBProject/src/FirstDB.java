
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class FirstDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String user = "Ram";
//        String pw = "Manu@123";
//        String ph = "932185967";
//        String mail = "Man@gmail.com";
//        String pl = "OOty";
        
        //error sorround statement with try catch
        try {
            Database db = new Database();
            
            //String query = "insert into register values('"+user+"','"+pw+"','"+ph+"','"+mail+"','"+pl+"')";
            
            //db.executeUpdate(query);
            
            //System.out.println("Data inserted!!!");
            
            String q1 = "Select * from register where uname = '"+user+"'";
            
            ResultSet rs = db.executeQuery(q1);    //import java.sql.insertcell
             //initially initialze all dat
            
            String username = "";
            String pw = "";
            String ph = "";
            String emailid = "";
            String plac = "";
            //check query is executed r not use boolean operator
            if (rs.next())
            {
                username = rs.getString("uname");
                
                pw = rs.getString("pwd");
                
                ph = rs.getString("mob");
                
                emailid = rs.getString("email");
                
                plac = rs.getString("place");
                
                System.out.println("The Extracted values from the Query is: ");
                System.out.println(username);
                System.out.println(pw);
                System.out.println(ph);
                System.out.println(ph);
                System.out.println(plac);
                        
                
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FirstDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FirstDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
