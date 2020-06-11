
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Student {
    public void insertUpdateDeleteStudent(char operation, Integer id, String firstName,
                                          String lastName, String gender, String birthdate,
                                          String phone, String address)
    {
        // function to insert,update or delete students in the database from here
        // the parameters are the columns that we want to manipulate which are filled with the students's attributes
        // the operation parameter however is to determine which operation we want to do
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        
        // u for update
        if(operation == 'u'){
            try {
                // the following statement is to update the student table in the database according to the given parameters
                pst = con.prepareStatement("UPDATE student SET first_name = ?, last_name = ?, gender = ?, birthdate = ?, phone = ?, address = ? WHERE id = ?");
                // sets the parameters from the function to the parameters in the statement to update the database
                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setString(3, gender);
                pst.setString(4, birthdate);
                pst.setString(5, phone);
                pst.setString(6, address);
                pst.setInt(7, id);
                
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
        // i for insert
        if(operation == 'i'){
            try {
                // the following statement is to insert data into the table
                // in the database, the table "student" has 6 columns which are the attributes
                // the statement below inserts the given attributes by the user to a new made row in the database
                pst = con.prepareStatement("insert into student(first_name, last_name, gender, birthdate, phone, address) values(?, ?, ?, ?, ?, ?)");
                // sets the attributes according to what the user inputted
                pst.setString(1, firstName);
                pst.setString(2, lastName);
                pst.setString(3, gender);
                pst.setString(4, birthdate);
                pst.setString(5, phone);
                pst.setString(6, address);
                
                if(pst.executeUpdate() > 0){
                    // if successfully done, shows a message date updated to confirm that the task has been done
                    JOptionPane.showMessageDialog(null, "New Student Added");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // d for delete
        if(operation == 'd'){
           
            int confirmation = JOptionPane.showConfirmDialog(null, "Deleting a student data will also delete their scores, Are you sure you want to continue?", "Delete Student", JOptionPane.OK_CANCEL_OPTION,0);
            // the showconfirmdialog returns an int indicating the option selected by the user
            // if the user selects the ok button it returns 0 if cancel i think it returns the int 2 if im not wrong
            
            if(confirmation == 0){ 
                
                try {
                    // the delete from "table" statement deletes all the rows that are in the given table
                    // but it can be specified by giving a condition by typing "where" in the query
                    // in this case, we can find a row by giving it the id of the row that we want to delete
                    pst = con.prepareStatement("delete from student where id = ?");
                    // sets the id that we want to delete which is the parameter from the function
                    pst.setInt(1, id);
                
                    if(pst.executeUpdate() > 0){
                        // if successfully done, shows a message date updated to confirm that the task has been done
                        JOptionPane.showMessageDialog(null, "Student Data Deleted");
                    }
                
                } catch (SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
        
    }
    
    public void updateStudentTable(JTable table, String valueToSearch){
        // a function to update/fill the student table in the window with parameter being the name of the table's variable
        // and value to search which is the String value that the user types in the search textfield
        Connection con = Connection1.getConnection();
        PreparedStatement pst;
        try {
            // the statement below selects from the student table where concat(concatenates) the selected columns which is first_name dll
            // it will look like bryanputra087127231indonesia and the "like" is to check whether if the pattern of the bryanputra......... is the same as the value that we want to search
            // basically these will give us the ability to search by typing in a textfield and the table will update according to the text that the user types in the textfield
            
            pst = con.prepareStatement("select * from student where concat(first_name, last_name, phone, address)like ?");
            pst.setString(1, "%" + valueToSearch + "%"); // the %valuetosearch% finds any values that have "value to search" in any position
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel(); // make a new table model 
            
            Object [] row; // making an empty row
            
            while(rs.next()){
                // iterating through the contents/rows of the resultset (which is the selected table in the database) 
                row = new Object[7]; // make a row with 7 columns which we will fill with attributes from the resultset
                row[0] = rs.getInt(1); 
                for(int i = 1; i < 7; i++){
                    row[i] = rs.getString(i + 1);
                }
                
                model.addRow(row); // give the table model a row every iteration
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
