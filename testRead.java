import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class testRead {
    public static void main(String[] args) throws Exception {
       String urloracle="jdbc:oracle:thin:@localhost:1521:orcl";
       String username="sys as sysdba";
       String password="Rohn_5011318";
       try{
       Connection conSQL=DriverManager.getConnection(urloracle,username,password);
       System.out.println("connection successfull");
       String query = "select first_name,last_name, email,phone_number,salary from employees";
       java.sql.Statement stmt=conSQL.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       while(rs.next())
       {
        String fName=rs.getString(1);
        String lName=rs.getString(2);
        String email=rs.getString(3);
        String phone=rs.getString(4);
        float salary=rs.getFloat(5);
        System.out.println(fName+" "+lName+" "+email+" "+phone+" "+salary);
       }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
