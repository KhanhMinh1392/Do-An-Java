package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bag_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html lang=\"vn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Giỏ Hàng - LEO</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"icon_font/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Bag.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"sidenav\">\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Home.jsp\">\r\n");
      out.write("        <img class=\"img\" src=\"img/logo2.png\">\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"head\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products\" >SHOP</a>\r\n");
      out.write("       \r\n");
      out.write("        <a href=\"#\" >NEWS</a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Help.jsp\" >CONTACT</a>\r\n");
      out.write("        <a href=\"#\" >ABOUT</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"icon\">\r\n");
      out.write("        <a href=\"\"><i class=\"fa fa-search fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Login.jsp\"><i class=\"fa fa-user fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\r\n");
      out.write("        <a href=\"\"><i class=\"fa fa-shopping-basket fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <h1 class=\"h1\">Thông Tin Đơn Hàng</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-75\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <form action=\"/action_page.php\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-50\">\r\n");
      out.write("                        <h3>Thông Tin Đặt Hàng</h3>\r\n");
      out.write("                        <label for=\"fname\"><i class=\"fa fa-user\"></i> Họ Tên</label>\r\n");
      out.write("                        <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Họ và Tên\">\r\n");
      out.write("                        <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\r\n");
      out.write("                        <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"@gmail.com\">\r\n");
      out.write("                        <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Địa Chỉ</label>\r\n");
      out.write("                        <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"Địa Chỉ\">\r\n");
      out.write("                        <label for=\"city\"><i class=\"fa fa-institution\"></i> Thành Phố</label>\r\n");
      out.write("                        <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Thành Phố Hồ Chí Minh\">\r\n");
      out.write("                        <label for=\"city\"><i class=\"fa fa-phone\"></i> SĐT</label>\r\n");
      out.write("                        <input type=\"text\" id=\"phone\" name=\"phone\" placeholder=\"Số Điện Thoại\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-50\">\r\n");
      out.write("                        <h3>Vận Chuyển</h3>\r\n");
      out.write("                        <div class=\"deliver\">\r\n");
      out.write("                            <a>Vui lòng nhập thông tin giao hàng</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h3>Thanh Toán</h3>\r\n");
      out.write("                        <div class=\"table\">\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a style=\"margin-left: 10px\"><i class=\"fa fa-dot-circle-o\" aria-hidden=\"true\"></i>Thanh toán khi giao hàng (COD)<i class=\"fa fa-money\" aria-hidden=\"true\" style=\"color: #0b7dda;float: right\"></i></a>\r\n");
      out.write("                            <label>Bạn chỉ thanh toán khi nhận được hàng</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <label for=\"city\"><i class=\"fa fa-sticky-note-o\" aria-hidden=\"true\"></i> Ghi Chú</label>\r\n");
      out.write("                        <input type=\"text\" id=\"note\" name=\"phone\" placeholder=\"Ghi Chú Đơn Hàng\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\"> Đồng ý địa chỉ trên là đúng\r\n");
      out.write("                </label>\r\n");
      out.write("                <input type=\"submit\" value=\"Đặt Hàng\" class=\"btn\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-25\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h4>Sản Phẩm <span class=\"price\" style=\"color:black\"><i class=\"fa fa-shopping-cart\"></i> <b>4</b></span></h4>\r\n");
      out.write("            <p><a href=\"#\"><img src=\"img/jaket.jpg\" style=\"width: 60px\" height=\"60px\"></a> <span class=\"price\">790.000</span></p>\r\n");
      out.write("            <p><a href=\"#\"><img src=\"img/tshirt2.jpg\" style=\"width: 60px\" height=\"60px\"></a></a> <span class=\"price\">420.000</span></p>\r\n");
      out.write("            <p><a href=\"#\"><img src=\"img/backpack1.png\" style=\"width: 60px\" height=\"60px\"></a></a> <span class=\"price\">800.000</span></p>\r\n");
      out.write("            <p><a href=\"#\"><img src=\"img/Short1.png\" style=\"width: 60px\" height=\"60px\"></a></a> <span class=\"price\">350.000</span></p>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <p>Total <span class=\"price\" style=\"color:black\"><b>2.360.000</b></span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function tinh_tong(a, b)\r\n");
      out.write("    {\r\n");
      out.write("        return a + b;\r\n");
      out.write("    }\r\n");
      out.write("    // Lấy thông tin từ người dùng\r\n");
      out.write("    // Tính tổng\r\n");
      out.write("    var tong = tinh_tong(a, b);\r\n");
      out.write("\r\n");
      out.write("    // In ra màn hình\r\n");
      out.write("    document.write(\"Tổng hai số \" + a + \" + \" + b + \" là \" + tong);\r\n");
      out.write("</script>\r\n");
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
