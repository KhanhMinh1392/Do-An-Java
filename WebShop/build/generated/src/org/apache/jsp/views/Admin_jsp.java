package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"vn\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Admin-LEO</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/icon_font/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/css/Admin.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"sidenav\">\n");
      out.write("    <img class=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/logo2.png\" style=\"z-index: 1\">\n");
      out.write("    <div class=\"catory\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin\"><i class=\"fa fa-address-card fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Th??ng Tin Admin</a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Dashboard.jsp\"><i class=\"fa fa-home fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> T???ng Quan</a>\n");
      out.write("        <a href=\"DonHang.html\"><i class=\"fa fa-cart-arrow-down fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> ????n H??ng</a>\n");
      out.write("        \n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ListProducts\"><i class=\"fa fa-archive fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Danh S??ch S???n Ph???m</a>\n");
      out.write("        <a href=\"#Report\"><i class=\"fa fa-bar-chart fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Doanh Thu</a>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Logout\"><i class=\"fa fa-sign-out fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> ????ng Xu???t</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"avaadmin\">\n");
      out.write("    <h4 class=\"infoadmin\">Th??ng Tin Admin</h4>\n");
      out.write("    <hr>\n");
      out.write("    <div class=\"Thongtintaikhoan\" >\n");
      out.write("        <a style=\"font-weight: bold\">Th??ng tin t??i kho???n</a>\n");
      out.write("        <br><hr>\n");
      out.write("        <a>C??c th??ng tin c?? b???n t??i kho???n ??ang ????ng nh???p h??? th???ng</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"infomation\">\n");
      out.write("        <div class=\"first\">\n");
      out.write("            <p>T??n Admin</p>\n");
      out.write("            <input type=\"text\" name=\"adminName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.getTenNV()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"T??n Admin\">\n");
      out.write("            <p>M???t Kh???u</p>\n");
      out.write("            <input type=\"text\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.getMatkhau()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"M???t kh???u\">\n");
      out.write("            <p>S??? ??i???n tho???i</p>\n");
      out.write("            <input type=\"text\" name=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.getSDTNV()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"S??? ??i???n tho???i\">\n");
      out.write("            <p>Ghi Ch??</p>\n");
      out.write("            <input type=\"text\" name=\"note\" placeholder=\"\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"half-past\">\n");
      out.write("            <p>Email</p>\n");
      out.write("            <input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"@gmail.com\">\n");
      out.write("            <p>?????a Ch???</p>\n");
      out.write("            <input type=\"text\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.getDiaChiNV()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"?????a ch???\">\n");
      out.write("            <p>Ng??y Sinh</p>\n");
      out.write("            <input type=\"date\" name=\"birthday\"  placeholder=\"Ng??y sinh\">\n");
      out.write("            <p>Tr???ng Th??i L??m Vi???c</p>\n");
      out.write("            <input type=\"text\" name=\"txtTTL\" placeholder=\"??ang L??m Vi???c\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"\"><button class=\"btn\" type=\"submit\">L??u</button></a>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
