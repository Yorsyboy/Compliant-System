/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "Complaint", urlPatterns = {"/Complaint"})
public class Complaint extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name = request.getParameter("name");
           String number= request.getParameter("number");
           String dep = request.getParameter("dep");
           String prob = request.getParameter("prob");
           String msg = request.getParameter("msg");
           String type =request.getParameter("type");
           
           Date date = new Date();  
           SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
           String strDate= formatter.format(date);
           
           String reply="Not Replied";
           String dreply="00/00/000";
           String comId=IDgenerate.NEWID(strDate,dep);
           
           
           Connection cn = Connectivity.getConnection();
           String sql = "INSERT INTO complainttable(Com_id, name, number, dep, prob, msg, strDate, reply, dreply, type) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
           
           
           PreparedStatement ps = cn.prepareStatement(sql);
           ps.setString(1, comId);
           ps.setString(2, name);
           ps.setString(3, number);
           ps.setString(4, dep);
           ps.setString(5, prob);
           ps.setString(6, msg);
           ps.setString(7, strDate);
           ps.setString(8, reply);
           ps.setString(9, dreply);
           ps.setString(10, type);
           
           
           if(type.equals("FAST TRACK")&& dep.equals("MMS") ){
             
                ps.executeUpdate();
                       
                request.setAttribute("comId", comId);
                request.setAttribute("success", "Complaint Registered");
                request.getRequestDispatcher("complaintRegister.jsp").forward(request, response);
             
            }else if(type.equals("NORMAL")){
                 ps.executeUpdate();
                       
                request.setAttribute("comId", comId);
                request.setAttribute("success", "Complaint Registered");
                request.getRequestDispatcher("complaintRegister.jsp").forward(request, response);
            }else{
            out.println("Complaint Not Resgistered");
            }
         
            
        } catch (SQLException ex) {
                Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
