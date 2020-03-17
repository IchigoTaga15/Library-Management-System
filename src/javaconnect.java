
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryms", "root", "");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane .showMessageDialog(null, ex);
            return null;
        }
    }
}
