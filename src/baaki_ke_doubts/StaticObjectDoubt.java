package baaki_ke_doubts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StaticObjectDoubt {

    static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("", "", "");
        } catch (SQLException e) {
            System.out.println("chill");
        }
    }

    public static void main(String[] args) {
        Connection connection1 = StaticObjectDoubt.dbConnect();
    }

    static Connection dbConnect(){
        return connection;
    }
}
