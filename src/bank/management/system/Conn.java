
package bank.management.system;
import java.sql.*;
public class Conn {
        Connection c;
        Statement s;
    public Conn() {
        
        try {
            //handle errors for runtime error due to external mysql application
//            Class.forName("com.mysql.cj.jdbc.Driver");
              c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","Niladri*98");
              s=c.createStatement();
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
