package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<html ng-app=\"schoolUI\">\n");
      out.write("<head>\n");
      out.write("\t<title>Zeal Tech</title>\n");
      out.write("\t<!-- The styles -->\n");
      out.write("\t<link id=\"bs-css\" href=\"app/styles/bootstrap-cerulean.css\" rel=\"stylesheet\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t  body {\n");
      out.write("\t\tpadding-bottom: 40px;\n");
      out.write("\t  }\n");
      out.write("\t  .sidebar-nav {\n");
      out.write("\t\tpadding: 9px 0;\n");
      out.write("\t  }\n");
      out.write("\t</style>\n");
      out.write("\t<link id=\"bs-css\" href=\"app/styles/bootstrap-cerulean.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"app/styles/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"app/styles/charisma-app.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"app/styles/jquery-ui-1.8.21.custom.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href='app/styles/fullcalendar.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/fullcalendar.print.css' rel='stylesheet'  media='print'>\n");
      out.write("\t<link href='app/styles/chosen.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/uniform.default.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/colorbox.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/jquery.cleditor.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/jquery.noty.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/noty_theme_default.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/elfinder.min.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/elfinder.theme.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/jquery.iphone.toggle.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/opa-icons.css' rel='stylesheet'>\n");
      out.write("\t<link href='app/styles/uploadify.css' rel='stylesheet'> \n");
      out.write("\t\n");
      out.write("\t<!-- load library files -->\n");
      out.write("\t\n");
      out.write("\t<script src=\"app/vendor/angular.min.js\"></script>\n");
      out.write("\t<script src=\"app/vendor/angular-route.js\"></script>\n");
      out.write("\t<script src=\"app/vendor/ui-bootstrap-tpls-0.12.0.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\t<!-- load javascript files -->\n");
      out.write("\t<script src=\"app/app.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- load controllers -->\n");
      out.write("\t<script src=\"app/admin/controllers/MainController.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- load services -->\n");
      out.write("\t<script src=\"app/admin/services/LoginService.js\"></script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body ng-controller=\"MainController\">\t\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t<div class=\"span12 center login-header\">\n");
      out.write("\t\t\t\t\t<h2>Welcome to Royal Public School</h2>\n");
      out.write("\t\t\t\t</div><!--/span-->\n");
      out.write("\t\t\t</div><!--/row-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t<div class=\"well span5 center login-box\">\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-info\">\n");
      out.write("\t\t\t\t\t\tPlease login with your Username and Password.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-prepend\" title=\"Username\" data-rel=\"tooltip\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\"></i></span><input autofocus class=\"input-large span10\" ng-model=\"login.userName\" id=\"userName\" type=\"text\" placeholder=\"Username\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-prepend\" title=\"Password\" data-rel=\"tooltip\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\"></i></span><input class=\"input-large span10\" ng-model=\"login.password\" id=\"password\" type=\"password\" placeholder=\"Password\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"remember\" for=\"remember\"><input type=\"checkbox\" id=\"remember\" />Remember me</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p class=\"center span5\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" ng-click=\"doLogin(login);\">Login</button>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div><!--/span-->\n");
      out.write("\t\t\t</div><!--/row-->\n");
      out.write("\t\t\t\t</div><!--/fluid-row-->\n");
      out.write("\t\t\n");
      out.write("\t</div><!--/.fluid-container-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
