import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class TestInsert {
    public static void main(String[] args) throws Exception {
       String urloracle="jdbc:oracle:thin:@localhost:1521:orcl";
       String username="sys as sysdba";
       String password="Rohn_5011318";
       try{
       Connection conSQL=DriverManager.getConnection(urloracle,username,password);
       System.out.println("connection successfull");
       String n="\'Raj\'";
       int age=20;
       String address="\'idontknow\'";
       int course=3005;
    //    String query = "insert into student(name,age,address,course) values('MSD',50,'idontknow',3003)";
       String q = "insert into student(name,age,address,course) values("+n+","+age+","+address+","+course+")";
       java.sql.Statement stmt=conSQL.createStatement();
       System.out.println(q);
        ResultSet rs=stmt.executeQuery(q);
       System.out.println(rs+"record inserted");
       
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
