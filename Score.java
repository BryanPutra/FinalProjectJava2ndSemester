
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score {
    
    public void insertUpdateDeleteScore(char operation, Integer stdId, Integer crsId, Double score, String desc)
    {
        
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        
        // i for insert
        if(operation == 'i'){
            try {
                // the following statement is to insert data into the table
                // in the database, the table "scores" has 4 columns which are the attributes
                // the statement below inserts the given attributes by the user to a new made row in the database
                pst = con.prepareStatement("insert into score(student_id, course_id, student_score, description) values(?, ?, ?, ?)");
                // sets the attributes according to what the user inputted
                pst.setInt(1, stdId);
                pst.setInt(2, crsId);
                pst.setDouble(3, score);
                pst.setString(4, desc);
                
                if(pst.executeUpdate() > 0){
                    // if successfully done, shows a message date updated to confirm that the task has been done
                    JOptionPane.showMessageDialog(null, "Score Added");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // u for update
        if(operation == 'u'){
            try {
                // the following statement is to update the score table in the database according to the given parameters
                pst = con.prepareStatement("UPDATE score SET student_score = ?, description = ? WHERE student_id = ? and course_id = ?");
                // sets the parameters from the function to the parameters in the statement to update the database
                pst.setDouble(1, score);
                pst.setString(2, desc);
                pst.setInt(3, stdId);
                pst.setInt(4, crsId);
               
                if(pst.executeUpdate() > 0){
                    // the executeUpdate() returns 0 if the statement returns nothing (fails to execute)
                    // if it is successfully done, then it returns the row count 
                    // if successfully done, shows a message date updated to confirm that the task has been done
                    JOptionPane.showMessageDialog(null, "Data Updated");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//      d for delete
        if(operation == 'd'){
            try {
                // the delete from "table" statement deletes all the rows that are in the given table
                // but it can be specified by giving a condition by typing "where" in the query
                // in this case, we can find a row by giving it the id of the row that we want to delete
                pst = con.prepareStatement("delete from score where student_id = ? and course_id = ?");
                pst.setInt(1, stdId);
                pst.setInt(2, crsId);
                // sets the ids that we want to delete which is the parameter from the function
                
                if(pst.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Score Data Deleted");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updateScoreTable(JTable table){
        
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            // select elements from course table in the database
            // stores them in the ResultSet
            pst = con.prepareStatement("select * from score");
            ResultSet rs = pst.executeQuery();
            // make new model for the table in the window
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                // iterating through the contents/rows of the resultset (which is the selected table in the database) 
                row = new Object[4];// make a row with 4 columns which we will fill with attributes from the resultset
                row[0] = rs.getInt(1); 
                row[1] = rs.getInt(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getString(4);
                
                model.addRow(row);// give the table model a row every iteration
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showScoresList(JTable table){
        
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            // the INNER JOIN matches each row in one table with every row in other tables and allows you to query rows that contain columns from both tables.
            // the table will display student id, first and last name(which are from the student table in the database), course name ( i named in label in the course table)
            // , and score
            pst = con.prepareStatement("select student_id, first_name, last_name, label, student_score from score\n" +
                                        "inner join student as stab on stab.id = student_id\n" +
                                        "inner join course as ctab on ctab.id = course_id");
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                // iterating through the contents/rows of the resultset (which is the selected table in the database) 
                row = new Object[5];// make a row with 3 columns which we will fill with attributes from the resultset
                row[0] = rs.getInt(1); 
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getDouble(5);
                
                model.addRow(row); // give the table model a row every iteration
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
