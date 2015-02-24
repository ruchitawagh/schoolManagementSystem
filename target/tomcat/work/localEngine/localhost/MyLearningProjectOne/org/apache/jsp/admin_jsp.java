package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html ng-app=\"adminUI\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Zeal Tech</title>\r\n");
      out.write("\t<!-- The styles -->\r\n");
      out.write("\t<link id=\"bs-css\" href=\"app/styles/bootstrap-cerulean.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t  body {\r\n");
      out.write("\t\tpadding-bottom: 40px;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  .sidebar-nav {\r\n");
      out.write("\t\tpadding: 9px 0;\r\n");
      out.write("\t  }\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<link id=\"bs-css\" href=\"app/styles/bootstrap-cerulean.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"app/styles/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"app/styles/charisma-app.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"app/styles/jquery-ui-1.8.21.custom.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href='app/styles/fullcalendar.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/fullcalendar.print.css' rel='stylesheet'  media='print'>\r\n");
      out.write("\t<link href='app/styles/chosen.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/uniform.default.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/colorbox.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/jquery.cleditor.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/jquery.noty.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/noty_theme_default.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/elfinder.min.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/elfinder.theme.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/jquery.iphone.toggle.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/opa-icons.css' rel='stylesheet'>\r\n");
      out.write("\t<link href='app/styles/uploadify.css' rel='stylesheet'> \r\n");
      out.write("\t\r\n");
      out.write("\t<!-- load library files -->\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"app/vendor/angular.min.js\"></script>\r\n");
      out.write("\t<script src=\"app/vendor/angular-route.js\"></script>\r\n");
      out.write("\t<script src=\"app/vendor/ui-bootstrap-tpls-0.12.0.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- load javascript files -->\r\n");
      out.write("\t<script src=\"app/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- load controllers -->\r\n");
      out.write("\t<script src=\"app/admin/controllers/LoginController.js\"></script>\r\n");
      out.write("\t<script src=\"app/admin/controllers/RegistrationController.js\"></script>\r\n");
      out.write("\t<script src=\"app/admin/controllers/ClassDivisionController.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- load services -->\r\n");
      out.write("\t<script src=\"app/admin/services/LoginService.js\"></script>\r\n");
      out.write("\t<script src=\"app/admin/services/DivisionService.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\t\r\n");
      out.write("\t<div class=\"navbar\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".top-nav.nav-collapse,.sidebar-nav.nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"index.html\"> <img alt=\"Charisma Logo\" src=\"../img/logo20.png\" /> <span>ZealTech</span></a>\r\n");
      out.write("\t\t\t\t<!-- user dropdown starts -->\r\n");
      out.write("\t\t\t\t<div class=\"btn-group pull-right\" dropdown is-open=\"status.isopen\">\r\n");
      out.write("\t\t\t\t\t<!--<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-user\"></i><span class=\"hidden-phone\"> admin</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>-->\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn dropdown-toggle\" dropdown-toggle ng-disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\tButton dropdown <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- user dropdown ends -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- topbar ends -->\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row-fluid\">\t\t\t\r\n");
      out.write("\t\t\t<!-- left menu starts -->\r\n");
      out.write("\t\t\t<div class=\"span2 main-menu-span\">\r\n");
      out.write("\t\t\t\t<div class=\"well nav-collapse sidebar-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-tabs nav-stacked main-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"ajax-link\" href=\"index.html\"><i class=\"icon-home\"></i><span class=\"hidden-tablet\"> Dashboard</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"ajax-link\" href=\"ui.html\"><i class=\"icon-eye-open\"></i><span class=\"hidden-tablet\"> Student</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"ajax-link\" href=\"form.html\"><i class=\"icon-edit\"></i><span class=\"hidden-tablet\"> Staff</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"ajax-link\" href=\"chart.html\"><i class=\"icon-list-alt\"></i><span class=\"hidden-tablet\"> Fee</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"ajax-link\" href=\"typography.html\"><i class=\"icon-font\"></i><span class=\"hidden-tablet\"> Notification</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- left menu ends -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"content\" class=\"span10\">\r\n");
      out.write("\t\t\t<!-- content starts -->\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Home</a> <span class=\"divider\">/</span>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Dashboard</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>       \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<ng-view></ng-view>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div><!--/fluid-row-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p class=\"pull-left\">&copy; Zeal Technology</a> 2012</p>\r\n");
      out.write("\t\t\t<p class=\"pull-right\">Powered by: ZealTech</a></p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div><!--/.fluid-container-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
