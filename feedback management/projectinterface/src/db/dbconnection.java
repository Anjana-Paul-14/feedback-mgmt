
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author new
 */
public class dbconnection {
    public static Connection getConnection(){
        Connection c=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/feedbackmgmt","root","");
            } catch (SQLException ex) {
                Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }return c;

    } 
    
    
}
