
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Course {
    public void insertUpdateDeleteCourse(char operation, Integer id, String label, Integer hours)
    {
        // function to insert,update or delete courses in the database from here
        // the parameters are the columns that we want to manipulate which are filled with the courses's attributes
        // the operation parameter however is to determine which operation we want to do
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        
        // i for insert
        if(operation == 'i'){
            try {
                // the following statement is to insert data into the table
                // in the database, the table "courses" has 3 columns which are the attributes
                // the statement below inserts the given attributes by the user to a new made row in the database
                pst = con.prepareStatement("insert into course(label, hours_number) values(?, ?)");
                // sets the attributes according to what the user inputted
                pst.setString(1, label);
                pst.setInt(2, hours);
                
                if(pst.executeUpdate() > 0){
                    // if successfully done, shows a message date updated to confirm that the task has been done
                    JOptionPane.showMessageDialog(null, "New Course Added");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // u for update
        if(operation == 'u'){
            try {
                // the following statement is to update the course table in the database according to the given parameters
                pst = con.prepareStatement("UPDATE course SET label = ?, hours_number = ? WHERE id = ?");
                // sets the parameters from the function to the parameters in the statement to update the database
                pst.setString(1, label);
                pst.setInt(2, hours);
                pst.setInt(3, id);
                
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
 
//        // d for delete
        if(operation == 'd'){
            // the showconfirmdialog returns an int indicating the option selected by the user
            // if the user selects the ok button it returns 0 if cancel i think it returns the int 2 if im not wrong
            int confirmation = JOptionPane.showConfirmDialog(null, "Deleting a course data will also delete their scores, Are you sure you want to continue?", "Delete Course", JOptionPane.OK_CANCEL_OPTION,0);

            if(confirmation == 0){
                
                try {
                    // the delete from "table" statement deletes all the rows that are in the given table
                    // but it can be specified by giving a condition by typing "where" in the query
                    // in this case, we can find a row by giving it the id of the row that we want to delete
                    pst = con.prepareStatement("delete from course where id = ?");
                    // sets the id that we want to delete which is the parameter from the function
                    pst.setInt(1, id);
                
                    if(pst.executeUpdate() > 0){
                        // if successfully done, shows a message date updated to confirm that the task has been done
                        JOptionPane.showMessageDialog(null, "Course Deleted");
                    }
                
                } catch (SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
            
        }
        
    }
    
    public boolean checkCourseAlreadyExist(String courseName){
        // this is a function to check whether a course is already registered in the database so that there are no doubles
        // the parameter for this function is the coursename we want to check
        boolean isPresent = false;
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            // checks from the database if the given course name is already present in the database or not if yes returns true if not returns false
            pst = con.prepareStatement("select * from course where label = ?");
            pst.setString(1, courseName);
            ResultSet rs = pst.executeQuery();
            
            // if the query is successfully executed which means the result set would exist 
            // meaning if the course we want to check is already in the result set / table and we can move through the row by using .next()
            // then we set it to true
            if(rs.next()){
                isPresent = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        // returns true or false within the isPresent variable
        return isPresent;
    }
    
    public void updateCourseTable(JTable table){
        // function to update the course table 
        // similar to the updateStudentTable function i made but this doesn't have the search feature in it
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            // select elements from course table in the database
            // stores them in the ResultSet
            pst = con.prepareStatement("select * from course");
            ResultSet rs = pst.executeQuery();
            // make new model for the table in the window
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row; 
            
            while(rs.next()){
                // iterating through the contents/rows of the resultset (which is the selected table in the database) 
                row = new Object[3]; // make a row with 3 columns which we will fill with attributes from the resultset
                row[0] = rs.getInt(1); 
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);
                
                model.addRow(row); // give the table model a row every iteration
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int getCourseId(String courseLabel){
        
        int courseId = 0;
        
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from course where label = ?");
            pst.setString(1, courseLabel);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                courseId = rs.getInt("Id");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return courseId;
    }
    
    public void fillCourseComboBox(JComboBox combocourseid){
        // a function to add items into the combobox which contains the names of the courses
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            // select elements from the course tabel 
            // puts in the ResultSet
            pst = con.prepareStatement("select * from course");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                // iterates through the elements in the resultset
                // we add items to the combobox with 2 being the column index in the table/result set which in my database is the label/name of the course
                combocourseid.addItem(rs.getString(2));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
