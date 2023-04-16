package baaki_ke_doubts;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    Connection con;
    Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software", "", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
