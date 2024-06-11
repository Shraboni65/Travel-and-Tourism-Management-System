
package travelandtour;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JConnection {
    public static Connection connectDb(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.sqlite.JDBC");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/Java/Database/tour.db","root","");
            //System.out.println("Connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}