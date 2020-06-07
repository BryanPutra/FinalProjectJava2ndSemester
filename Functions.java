
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Functions {
    
    // this is a function i made to count data from my database
    // with the parameter being the name of the table made in mysql database
    public static int countData(String table){
        int total = 0;
        Connection con = Connection1.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select count(*) as 'total' from " + table); // executes the statement which it will return all rows from a given table to the resultset
            while(rs.next()){ 
                total = rs.getInt(1); // gets the number of rows from the query above
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
        
    }
            
}
