/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis;

import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author HP
 */
public class PbtDbConn {
   public Statement stm; 
   public Connection con;
   public ResultSet rs;
  public PbtDbConn()
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pbtrtpsrs","root","");
          stm=con.createStatement();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
  }
      
 
    
}
