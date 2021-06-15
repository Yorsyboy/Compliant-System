package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypackages.StudentLogin;

public final class complaintRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Complaint Register</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse  navbar-fixed-top\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        \t\t<span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("        \t\t<span class=\"icon-bar\"></span> \n");
      out.write("                    </button>\n");
      out.write("                        <span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px ;color: white;\">Complaint Management System</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("                        <li><a href=\"check_status.jsp\">CheckStatus</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\t\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("            \n");
      out.write("        <div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("            <div class=\"col-md-10\"> \n");
      out.write("                <div class=\"col-md-offset-3 col-md-10\">\n");
      out.write("                    <h1 style=\"text-align: center\"><strong>Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stulogged}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></h1>\n");
      out.write("                    <h2><strong>Let Us Know Your  Complaints</strong> </h2><br>\n");
      out.write("                </div>\n");
      out.write("   \n");
      out.write("        <form action=\"complaint.java\" method=\"post\" class=\"form-horizontal control-form col-md-12\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"Confrim Password\" class=\"control-label col-md-5\">Complaint type:</label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <select class=\"form-control\" name=\"type\" required  >\n");
      out.write("                        <option value=\"\">Select Complaint type</option>\n");
      out.write("                        <option>FAST TRACK</option>\n");
      out.write("                        <option>NORMAL</option>\n");
      out.write("                        </select>\n");
      out.write("                        <div class=\"help-block\">Only MMS Student complaint is Under Fast Track Categories.</div>\n");
      out.write("                    </div>\n");
      out.write("            </div>        \n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"inputName\" class=\"control-label col-md-5\"> Contact Number:</label>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <span class=\"input-group-addon\" id=\"sizing-addon1\">+234</span>\n");
      out.write("                            <input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"number\" placeholder=\"A Valid Contact Number\" required  >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"inputName\" class=\"control-label col-md-5\"> Student Name:</label>\n");
      out.write("                <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Student Name\" required  ></div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"Confrim Password\" class=\"control-label col-md-5\">Department:</label>\n");
      out.write("             <div class=\"col-md-6\">\n");
      out.write("                <select class=\"form-control\" name=\"dep\" required  >\n");
      out.write("                    <option value=\"\">Select Department</option>\n");
      out.write("                    <option>JAVA</option>\n");
      out.write("                    <option>PYTHON</option>\n");
      out.write("                    <option>C#</option>\n");
      out.write("                    <option>CCNA</option>\n");
      out.write("                    <option>ANGULAR</option>\n");
      out.write("                    <option>JAVASCRIPT</option>\n");
      out.write("                    <option>MMS</option>\n");
      out.write("                </select> \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"inputName\" class=\"control-label col-md-5\"> Problem Subject:</label>\n");
      out.write("          <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"prob\" placeholder=\"Problem Subject\" required  >\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"inputName\" class=\"control-label col-md-5\"> Complaint:</label>\n");
      out.write("            <textarea  id=\"inputName\"  class=\"form-control\" rows=\"10\" name=\"msg\" placeholder=\"Write your message here...\" required></textarea>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        <p style=\"margin-left:500px; \"  id=\"demo\"></p>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success col-md-3\" style=\"background-color: #0d47a1; \">Submit</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                                                \n");
      out.write("    </form>\n");
      out.write("    </div>  \n");
      out.write("  </div>\n");
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
