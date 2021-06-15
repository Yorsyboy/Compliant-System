package mypackages;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Connectivity {
  static final String username = "root";
  static final String password = "";
  static final String url = "jdbc:mysql://localhost:3306/complaint_system";

  
  public static Connection getConnection(){
      
     Connection cn = null;
      
      try {
          Class.forName("com.mysql.jdbc.Driver");
          cn = DriverManager.getConnection(url,username,password);
      } catch (Exception ex) {
          Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
      }
      return cn;
  }
  
}
