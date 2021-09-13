package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"vn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>DonHang-LEO</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"icon_font/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Admin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"sidenav\">\r\n");
      out.write("    <img class=\"img\" src=\"img/logo2.png\" style=\"z-index: 1\">\r\n");
      out.write("    <div class=\"catory\">\r\n");
      out.write("        <a href=\"Admin.html\"><i class=\"fa fa-address-card fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Thông Tin Admin</a>\r\n");
      out.write("        <a href=\"Dashboard.html\"><i class=\"fa fa-home fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Tổng Quan</a>\r\n");
      out.write("        <a href=\"DonHang.html\"><i class=\"fa fa-cart-arrow-down fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Đơn Hàng</a>\r\n");
      out.write("        <a href=\"Danhsachsp.html\"><i class=\"fa fa-archive fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Danh Sách Sản Phẩm</a>\r\n");
      out.write("        <a href=\"#Report\"><i class=\"fa fa-bar-chart fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Doanh Thu</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a href=\"Login.html\"><i class=\"fa fa-sign-out fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Đăng Xuất</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("    <header>\r\n");
      out.write("       <div class=\"search-wrapper\">\r\n");
      out.write("            <span><i class=\"fa fa-search\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("            <input type=\"search\" placeholder=\"Search Here\">\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"user-admin\">\r\n");
      out.write("            <img src=\"img/Minh.jpg\" width=\"40px\" height=\"40px\" alt=\"\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <h4>Khánh Minh</h4>\r\n");
      out.write("                <small>Admin</small>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"cards\">\r\n");
      out.write("            <div class=\"cards-single\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>120</h1>\r\n");
      out.write("                    <span>Tổng đơn hàng</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <span><i class=\"fa fa-archive\" aria-hidden=\"true\" style=\"color: darkblue\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cards-single\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>20</h1>\r\n");
      out.write("                    <span>Đơn hàng mới</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <span><i class=\"fa fa-plus\" aria-hidden=\"true\" style=\"color: green\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cards-single\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>2</h1>\r\n");
      out.write("                    <span>Đơn hàng trả</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <span><i class=\"fa fa-reply\" aria-hidden=\"true\" style=\"color: black\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cards-single\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>0</h1>\r\n");
      out.write("                    <span>Đơn hàng hủy</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <span><i class=\"fa fa-ban\" aria-hidden=\"true\" style=\"color: red\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"total\">\r\n");
      out.write("            <button class=\"tablink\" onclick=\"openPage('revenue', this, 'green')\">Doanh thu bán hàng</button>\r\n");
      out.write("            <button class=\"tablink\" onclick=\"openPage('density', this, 'green')\" id=\"defaultOpen\">Tỷ trọng bán hàng</button>\r\n");
      out.write("            <div class=\"filter\">\r\n");
      out.write("                <button type=\"button\">Chi Nhánh</button>\r\n");
      out.write("                <button type=\"button\">Hôm Nay</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"revenue\" class=\"tabcontent\">\r\n");
      out.write("                <img src=\"img/chart.png\" style=\"height: 350px\";width=\"350px\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"density\" class=\"tabcontent\">\r\n");
      out.write("                <img src=\"img/notdothis.jpg\"style=\"height: 350px\";width=\"350px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <script>\r\n");
      out.write("                function openPage(pageName,elmnt,color) {\r\n");
      out.write("                 var i, tabcontent, tablinks;\r\n");
      out.write("                tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("                 for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("                    tabcontent[i].style.display = \"none\";\r\n");
      out.write("                }\r\n");
      out.write("                tablinks = document.getElementsByClassName(\"tablink\");\r\n");
      out.write("    for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("        tablinks[i].style.backgroundColor = \"\";\r\n");
      out.write("    }\r\n");
      out.write("    document.getElementById(pageName).style.display = \"block\";\r\n");
      out.write("    elmnt.style.backgroundColor = color;\r\n");
      out.write("    }\r\n");
      out.write("    document.getElementById(\"defaultOpen\").click();\r\n");
      out.write("            </script>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
