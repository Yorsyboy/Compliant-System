package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Login</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\" >\n");
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
      out.write("                </ul>\t\n");
      out.write("            </div>\t\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("            <div class=\"col-md-10\"> \n");
      out.write("              <div class=\"col-md-offset-3 col-md-10\">\n");
      out.write("                <h2><strong>Admin Login</strong> </h2><br>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            <form action=\"AdminLogin\" method=\"post\" class=\"form-horizontal control-form col-md-12\"data-toggle=\"validator\" role=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"inputName\" class=\"control-label col-md-5\"> Admin ID:</label>\n");
      out.write("                    <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"username\" required ></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"intputPassword\" class=\"control-label col-md-5\"> Admin Password:</label>\n");
      out.write("                    <div class=\"col-md-6\"><input  id=\"Password\" type=\"Password\" class=\"form-control\" name=\"password\" required ></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"control-label col-md-7\"><a href=\"forgotpass.jsp\">Forgot Password</a></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success col-md-3\" style=\"background-color: #0d47a1;\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form> \n");
      out.write("            </div>  \n");
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
