import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUpdate {
    public static void main(String[] args) throws Exception {
        String urloracle="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="sys as sysdba";
        String password="Rohn_5011318";
        try{
        Connection conSQL=DriverManager.getConnection(urloracle,username,password);
        System.out.println("connection successfull");
        String query = "update student set name='dhoni' where name='MSD'";
 
        java.sql.Statement stmt=conSQL.createStatement();
         ResultSet rs=stmt.executeQuery(query);
        System.out.println(rs+"record updated");
        
         }
         catch(SQLException e)
         {
             System.out.println(e.getMessage());
         }
     }
}
