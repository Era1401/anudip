package collection;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection  {
    static final String url = "jdbc:mysql://localhost:3306/college";
    static final String username = "root";
    static final String password = "root123";

    public static Connection getConnection(){
        Connection con = null;

        try{
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connectin done.");
        }catch(Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
