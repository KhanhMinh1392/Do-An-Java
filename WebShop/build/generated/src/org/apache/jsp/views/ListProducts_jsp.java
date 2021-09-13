package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.SanPham;

public final class ListProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8388608, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Danh Sách Sản Phẩm</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/icon_font/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/css/Admin.css\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"sidenav\">\r\n");
      out.write("    <img class=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/logo2.png\" style=\"z-index: 1\">\r\n");
      out.write("    <div class=\"catory\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin\"><i class=\"fa fa-address-card fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Thông Tin Admin</a>\r\n");
      out.write("        <a href=\"DonHang.html\"><i class=\"fa fa-cart-arrow-down fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Đơn Hàng</a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ListProducts\"><i class=\"fa fa-archive fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Danh Sách Sản Phẩm</a>\r\n");
      out.write("        <a href=\"#Report\"><i class=\"fa fa-bar-chart fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Doanh Thu</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Logout\"><i class=\"fa fa-sign-out fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i> Đăng Xuất</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("    <h4 class=\"h4\">Danh Sách Sản Phẩm</h4>\r\n");
      out.write("    \r\n");
      out.write("    <form class=\"search\">\r\n");
      out.write("        <input type=\"text\" name=\"search\" placeholder=\"Search..\">\r\n");
      out.write("    </form>\r\n");
      out.write("    <h4 class=\"h4\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddProducts\" class=\"\">Thêm</a></h4>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Mã sản phẩm</th>\r\n");
      out.write("                    <th>Tên sản phẩm</th>\r\n");
      out.write("                    <th>Mã loại</th>\r\n");
      out.write("                    <th>Nhãn hiệu</th>\r\n");
      out.write("                    <th>Giá sản phẩm(VNĐ)</th>\r\n");
      out.write("                    <th>Hành động</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                ");

                   List<SanPham> list = (List) request.getAttribute("products");
               
      out.write("\r\n");
      out.write("               ");

                   for(SanPham sp : list){
               
      out.write("\r\n");
      out.write("                <tr style=\"text-align: center;\">\r\n");
      out.write("                    <td>");
 out.print(sp.getMaSP()); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.print(sp.getTenSP()); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.print(sp.getMaLoai()); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.print(sp.getNhanHieu()); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.print(String.format("%.0f", sp.getGiaSP())); 
      out.write("</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UpdateProducts?masp=");
 out.print(sp.getMaSP());
      out.write("\" class=\"\">Sửa</a>\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/DeleteProducts?masp=");
 out.print(sp.getMaSP());
      out.write("\" class=\"\">Xoá</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"move\">\r\n");
      out.write("    <div class=\"w3-bar\">\r\n");
      out.write("        <a href=\"#\" class=\"w3-button w3-hover-purple\">«</a>\r\n");
      out.write("        <a href=\"#\" class=\"w3-button w3-hover-green\">1</a>\r\n");
      out.write("        <a href=\"#\" class=\"w3-button w3-hover-red\">2</a>\r\n");
      out.write("        <a href=\"#\" class=\"w3-button w3-hover-blue\">3</a>\r\n");
      out.write("        <a href=\"#\" class=\"w3-button w3-hover-black\">4</a>\r\n");
      out.write("        <a href=\"#\" class=\"w3-button w3-hover-orange\">»</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
