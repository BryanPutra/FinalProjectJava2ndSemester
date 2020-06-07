
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connection1 {
    
    // function made to connect to the database
    public static Connection getConnection()
    {
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //studentmanagementdb2 is the name of the database that i made in MySQL Workbench
            // the syntax is as follows but the autoReconnect=true&useSSL=false" is not a must, i used it because i had an error
            // then the root and ... is the username and password for the database itself
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementdb2?autoReconnect=true&useSSL=false","root","exc4libur");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
        
    }
}
