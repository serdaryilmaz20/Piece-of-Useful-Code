package Gbyf;
import java.sql.*;
  public class ConnectionClass
{

     private static Connection connect;
    public static Connection getConnection() 
    { 
       try { 
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
             connect=DriverManager.getConnection("jdbc:sqlserver://localhost; DatabaseName=deneme;","serdar","123456" );
            return connect;
            }
            catch (Exception e) 
            { 
               return null; 
            }

    }
}
