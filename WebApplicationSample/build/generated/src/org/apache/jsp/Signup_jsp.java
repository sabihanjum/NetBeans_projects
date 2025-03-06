package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sign Up Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <form name =\"myForm\" onSubmit=\"return validdateForm()\" action=\"signupcontroller.jsp\">\n");
      out.write("                <input type=\"hidden\" name=\"page\" value=\"register\">\n");
      out.write("                <table> \n");
      out.write("                    <tr> \n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                               <center><h2>Sign Up</h2></center>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <label>First Name</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"fname\" class=\"text\" placeholder=\"First Name\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>Last Name</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                             <input type=\"text\" name=\"lname\" class=\"text\" placeholder=\"Last Name\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>Username</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                             <input type=\"text\" name=\"uname\" class=\"text\" placeholder=\"Username\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>Password</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                             <input type=\"password\" name=\"pass\" class=\"text\" placeholder=\"Password\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>Email</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                             <input type=\"email\" name=\"email\" class=\"text\" placeholder=\"Email\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>Contact No</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                             <input type=\"text\" name=\"contactno\" class=\"text\" placeholder=\"Contact No\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>City</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"city\" class=\"text\" placeholder=\"City\" required>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                           <label>Address</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                             <input type=\"text\" name=\"address\" class=\"text\" placeholder=\"Addresse\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <center>\n");
      out.write("                            <input type =\"submit\" value=\"Register Now\" class=\"button\">\n");
      out.write("                            </center>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                 </table>\n");
      out.write("            </form>\n");
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
