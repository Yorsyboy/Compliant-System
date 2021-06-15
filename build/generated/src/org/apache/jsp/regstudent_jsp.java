package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Student Registration</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\">\n");
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
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("            <div  style=\"float: left;\">\n");
      out.write("\t\t<ul class=\" nav nav-pills nav-stacked flex-column\">\n");
      out.write("                    <li><a href=\"regstudent.jsp\">Register New Student </a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp\">All Complains</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\" style=\"float:right;\">\n");
      out.write("      \t\t<div class=\"col-md-9\">\n");
      out.write("   \t\t   <h2 style=\"float: right;\"><strong>Add New User</strong> </h2><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" action=\"AddStudent\" method=\"post\"data-toggle=\"validator\" role=\"form\">\n");
      out.write("                <div class=\"form-group \">\n");
      out.write("                    <label for=\"inputName\" class=\"control-label col-md-5\">Student Name:</label>\n");
      out.write("\t\t\t<div class=\"col-md-5\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"student_id\" required ></div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("                    <label for=\"inputPassword\" class=\"control-label col-md-5\">Password:</label>\n");
      out.write("\t\t\t<div class=\"col-md-5\"><input  id=\"inputPassword\" type=\"Password\" class=\"form-control\" name=\"pass\" required></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"intputPassword\" class=\"control-label col-md-5\"> Questions:</label>\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <select class=\"form-control\" name=\"question\" required >\n");
      out.write("                                        <option value=\"\">Select Question</option>    \n");
      out.write("                                        <option>What is your mother tonuge</option>\n");
      out.write("                                        <option>What is you pet name</option>\n");
      out.write("                                        <option>Your frist school name</option>\n");
      out.write("                                        <option>Your favourite colour </option>\n");
      out.write("                            </select> \n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"intputPassword\" class=\"control-label col-md-5\"> Your Answer:</label>\n");
      out.write("                        <div class=\"col-md-5\"><input  id=\"Password\" type=\"\" class=\"form-control\" name=\"answer\" required></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success col-md-3\" style=\"background-color: #0d47a1; \">Submit</button></div>\n");
      out.write("\t\t</div> \n");
      out.write("\t\t\t         \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
