package Gbyf;
import java.sql.*;
  public class ConnectionClass
{

     private static Connection connect;
    public static Connection getConnection() 
     { 
         try { 
             Class.forName("oracle.jdbc.driver.OracleDriver"); 
             connect=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Serdar20" );
            return connect;
         }
         catch (Exception e) 
         { 
            return null; 
         }

    }
}
