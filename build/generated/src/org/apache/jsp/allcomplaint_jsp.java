package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackages.Dao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import mypackages.Connectivity;

public final class allcomplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Complaints</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\">\n");
      out.write("        ");

        if( session.getAttribute("Name")==null)
          response.sendRedirect("login.jsp");
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse  navbar-fixed-top\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("        \t\t<span class=\"icon-bar\"></span> \n");
      out.write("                    </button>\n");
      out.write("                        <span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px;color: white;\">Complaint Management System</span>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                </ul>\t\n");
      out.write("            </div>\t\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("           <div  style=\"float: left;\">\n");
      out.write("            <h4 style=\"padding-left: 40px;\"><strong>categories</strong></h4>\n");
      out.write("\t\t<ul class=\" nav nav-pills nav-stacked flex-column\">\n");
      out.write("<!--\t\t\t<li><a href=\"newAdmin.jsp\">ADD</a></li>-->\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=ALL\" >ALL</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=FAST TRACK\" >FAST TRACK</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=NORMAL\" >NORMAL</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-9\" style=\"float:right;\">\n");
      out.write("            <div class=\"col-md-8\" style=\"float:right\">\n");
      out.write("                <h3 style=\"color:#0d47a1;\"><strong>Complaints list</strong></h3> \n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            <table class=\"table table-hover\" style=\"float: right;\">\n");
      out.write("                <thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                                <th>#</th>\n");
      out.write("\t\t\t        <th>Complaint_ID</th>\n");
      out.write("\t\t\t\t<th>Name</th>\n");
      out.write("                                <th>Number</th>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<th>Dep</th>\n");
      out.write("                                <th>Prob</th>\n");
      out.write("                               \n");
      out.write("\t\t\t\t<th>Message</th>\n");
      out.write("                                <th>Date</th>\n");
      out.write("                                <th>Type</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                   try{
                       String com= (String)request.getParameter("com");
                       Connectivity con = new Connectivity();
                       Connection cn = Connectivity.getConnection();
                       int n=0;
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       ResultSet rs;
                       
                       if(com.equals("ALL")){
                           String sql = "SELECT Com_id, name, number, dep, prob, msg, strDate, type FROM complainttable order by S_no desc";
                           PreparedStatement ps = cn.prepareStatement(sql);
                           rs = ps.executeQuery();
                       }else if(com.equals("FAST TRACK")) {
                           String sql1 = "SELECT Com_id, name, number, dep, prob, msg, strDate, type FROM complainttable WHERE type =  FAST TRACK";
                           PreparedStatement ps1 = cn.prepareStatement(sql1);
                           rs = ps1.executeQuery();
                       }else {
                           String sql2 = "SELECT Com_id, name, number, dep, prob, msg, strDate, type FROM complainttable WHERE type =  NORMAL";
                           PreparedStatement ps2 = cn.prepareStatement(sql2);
                           rs = ps2.executeQuery();
                       }
                       
                       while (rs.next()) {
                           n++;
                           String num = Integer.toString(n);
                           String ComId = (String) rs.getString("Com_id");
                           String Name = (String) rs.getString("name");
                           String Number = (String) rs.getString("number");
                           String Dep = (String) rs.getString("dep");
                           String Prob = (String) rs.getString("prob");
                           String Message = (String) rs.getString("msg");
                           String Date = (String) rs.getString("strDate");
                           String Type = (String) rs.getString("type");
                           
                           
      out.write("\n");
      out.write("                           <tr>\n");
      out.write("                            <td><strong>");
out.print(num);
      out.write("</strong></td>\n");
      out.write("                            <td>");
out.print(ComId);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Name);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Number);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Dep);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Prob);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Message);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Date);
      out.write("</td>\n");
      out.write("                            <td>");
out.print(Type);
      out.write("</td>\n");
      out.write("                        </tr>");

                       }
                       
                   } catch (Exception e) {}
                    
      out.write("\n");
      out.write("                \n");
      out.write("                        \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
