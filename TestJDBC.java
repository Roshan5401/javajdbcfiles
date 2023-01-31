import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TestJDBC {
    public static void main(String[] args) throws Exception {
       String urloracle="jdbc:oracle:thin:@localhost:1521:orcl";
       String username="SYSTEM";
       String password="Rohn_5011318";
       try{
       Connection conSQL=DriverManager.getConnection(urloracle,username,password);
       System.out.println("connection successfull");
       }
       catch (SQLException e)
       {
        System.out.println(e.getMessage());
       }
    }
}
