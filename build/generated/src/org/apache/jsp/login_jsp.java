package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            @media only screen and (max-width: 767px){\n");
      out.write("                .design {\n");
      out.write("                    background-image: url(image2.jpeg);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-image: url(image2.jpeg);background-size: cover;background-repeat: no-repeat;background-position: center;background-attachment: fixed;min-height: 100%\">\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        \t\t<span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("        \t\t<span class=\"icon-bar\"></span> \n");
      out.write("                    </button>\n");
      out.write("                        <span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px;color: white;\">Complaint Management System</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("\t\t\t<li><a href=\"adminlogin.jsp\">Admin Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"padding-top: 100px;\">\n");
      out.write("            <div class=\"col-md-6\" style=\"float: right;\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\" style=\"text-align: center; background-color: #0d47a1;\">\n");
      out.write("                        <h3 style=\"color: white;\"><strong> Student Login</strong></h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"panel-body panel-height\" style=\"background-color: #eeeeee; height: 350px;\">\n");
      out.write("                        <form action=\"complaintRegister.jsp\" method=\"GET\" class=\"form-horizontal\" data-toggle=\"validator\" role=\"form\" >\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputName\" class=\"control-label col-md-1\"><h4><strong> Name</strong></h4></label>\n");
      out.write("                                <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" id=\"inputName\" name=\"stu\" placeholder=\"student name\" required></div>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword\" class=\"control-label col-md-1\"><h4><strong>Password</strong></h4></label>\n");
      out.write("                                <div class=\"col-md-12\"><input type=\"Password\" class=\"form-control\" id=\"inputPassword\" name=\"pass\" placeholder=\"password\" required></div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-success col-md-5\" style=\"background-color: #0d47a1; \">Login</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("            <footer class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("  \t\t<p class=\"text-center\" style=\"padding: 10px\">@ 2021 Copyright: Yorsyboy</p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
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
