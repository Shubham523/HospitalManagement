
import java.sql.*;
public class DBConnect {
    
Connection Connect()
{        
    Connection con=null;
    try
       {
           
       String URL="jdbc:mysql://localhost:3306/";
       String DATABASE="hospitalmanagement";
       String USER="root";
       String PASSWORD="";
       con = (Connection) DriverManager.getConnection(URL+DATABASE,USER,PASSWORD);        
       System.out.println("Database connection successful");
           
       }
    catch(Exception e) {System.out.println("MySQL Server is not RUNNING:"+e);}

    return con;
}

}