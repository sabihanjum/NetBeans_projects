package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class border_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel =\"stylesheet\" href =\"mystyle.css\">\n");
      out.write("<style>\n");
      out.write("p.dotted {border-style: dotted; border-width: thick}\n");
      out.write("p.dashed {border-style: dashed;}\n");
      out.write("p.solid {border-style: solid; border-width: thick}\n");
      out.write("p.double {border-style: double;}\n");
      out.write("p.groove {border-style: groove;}\n");
      out.write("p.ridge {border-style: ridge;}\n");
      out.write("p.inset {border-style: inset;}\n");
      out.write("p.outset {border-style: outset;}\n");
      out.write("p.none {border-style: none;}\n");
      out.write("p.hidden {border-style: hidden;}\n");
      out.write("p.mix {border-style: dotted dashed solid double;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>The border-style Property</h2>\n");
      out.write("<p>This property specifies what kind of border to display:</p>\n");
      out.write("\n");
      out.write("<p class=\"dotted\">A dotted border.</p>\n");
      out.write("<p class=\"dashed\">A dashed border.</p>\n");
      out.write("<p class=\"solid\">A solid border.</p>\n");
      out.write("<p class=\"double\">A double border.</p>\n");
      out.write("<p class=\"groove\">A groove border.</p>\n");
      out.write("<p class=\"ridge\">A ridge border.</p>\n");
      out.write("<p class=\"inset\">An inset border.</p>\n");
      out.write("<p class=\"outset\">An outset border.</p>\n");
      out.write("<p class=\"none\">No border.</p>\n");
      out.write("<p class=\"hidden\">A hidden border.</p>\n");
      out.write("<p class=\"mix\">A mixed border.</p>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
