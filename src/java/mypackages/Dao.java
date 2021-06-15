/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dell
 */
public class Dao {
    public boolean Adminlogin(String username, String password){
        Connection cn = Connectivity.getConnection();
        
        boolean response = false;
        
        if (cn != null) {
          
            try {
                String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                    
                    response = true;
                }
            } 
            catch (Exception e) {
            }
        }
        return response;
    }
    
    public boolean Studentlogin(String student, String password){
        Connection cn = Connectivity.getConnection();
        
        boolean response = false;
        
        if (cn != null) {
          
            try {
                String sql = "SELECT * FROM student WHERE student_name = ? AND password = ?";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, student);
                ps.setString(2, password);
                
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                    
                    response = true;
                }
            } 
            catch (Exception e) {
            }
        }
        return response;
    }
    
    public boolean addStudent (String student, String password, String question, String answer) {
        Connection cn = Connectivity.getConnection();
        if (cn != null) {
            try {
                String sql = "INSERT INTO student(student_name, password, question, answer) VALUES(?, ?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, student);
                ps.setString(2, password);
                ps.setString(3, question);
                ps.setString(4, answer);
             
                return (ps.executeUpdate() != 0);
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    
}
