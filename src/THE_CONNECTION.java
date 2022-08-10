
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Family
 */
public class THE_CONNECTION { 
    
    private static String servername = "localhost";
    private static String dbname = " real_estate";
    private static String username = "root";
    private static Integer Portnumber = 3306;
    private static  String password = "";// no password
    
    //create  a function  to get the  connection   public static Connection getTheconnection()
    public static  Connection getTheConnection()
    {
        Connection connection =null;
        
        MysqlDataSource datasource =new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(Portnumber);
        datasource.setPassword(password);
        
        
       
        
        try {
            connection =datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
       return connection;
        
        
        
        
    }
    
    
            
    
}
