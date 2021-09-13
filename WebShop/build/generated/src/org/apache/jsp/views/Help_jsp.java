package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Help_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>CONTACT-LEO</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"icon_font/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"help.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"sidenav\">\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Home.jsp\">\r\n");
      out.write("        <img class=\"img\" src=\"img/logo2.png\">\r\n");
      out.write("    </a>\r\n");
      out.write("<div class=\"head\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products\" >SHOP</a>  \r\n");
      out.write("        <a href=\"News.jsp\" >NEWS</a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Help.jsp\" >CONTACT</a>\r\n");
      out.write("        <a href=\"About.jsp\" >ABOUT</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <p class=\"p\"><i class=\"fa fa-phone fa-5x\" aria-hidden=\"true\" style=\"color: #363636\" ></i> Liên Hệ</p>\r\n");
      out.write("    <div class=\"flip-card\">\r\n");
      out.write("    <div class=\"flip-card-inner\">\r\n");
      out.write("        <div class=\"flip-card-front\">\r\n");
      out.write("            <img src=\"img/Minh.jpg\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flip-card-back\">\r\n");
      out.write("            <h1>Đào Khánh Minh</h1>\r\n");
      out.write("            <p>Web Developer & Designer</p>\r\n");
      out.write("            <p>SĐT: 0706166088</p>\r\n");
      out.write("            <p>Mail: minhdao933@gmail.com</p>\r\n");
      out.write("            <a href=\"https://www.facebook.com/kminhDan\" class=\"fa fa-facebook\" style=background:#3B5998;color:white></a>\r\n");
      out.write("            <a href=\"#\" class=\"fa fa-instagram\" style=\"background: #F4A460;color: white\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"flip-card1\">\r\n");
      out.write("    <div class=\"flip-card-inner1\">\r\n");
      out.write("        <div class=\"flip-card-front1\">\r\n");
      out.write("            <img src=\"img/NhanHua.jpg\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flip-card-back1\">\r\n");
      out.write("            <h1>Hứa Vỹ Nhân</h1>\r\n");
      out.write("            <p>Design & Database</p>\r\n");
      out.write("            <p>SĐT: 0946922737</p>\r\n");
      out.write("            <p>Mail: nhanhua0@gmail.com</p>\r\n");
      out.write("            <a href=\"https://www.facebook.com/hua.nhan.3348\" class=\"fa fa-facebook\" style=background:#3B5998;color:white></a>\r\n");
      out.write("            <a href=\"#\" class=\"fa fa-instagram\" style=\"background: #F4A460;color: white\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"flip-card2\">\r\n");
      out.write("    <div class=\"flip-card-inner2\">\r\n");
      out.write("        <div class=\"flip-card-front2\">\r\n");
      out.write("            <img src=\"img/minhtruong.png\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flip-card-back2\">\r\n");
      out.write("            <h1>Trần Phan Minh Trường</h1>\r\n");
      out.write("            <p>Database</p>\r\n");
      out.write("            <p>SĐT: 0769713139</p>\r\n");
      out.write("            <a href=\"https://www.facebook.com/MinTruong08\" class=\"fa fa-facebook\" style=\"background: #3B5998;color: white;\"></a>\r\n");
      out.write("            <a href=\"#\" class=\"fa fa-instagram\" style=\"background: #F4A460;color: white\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"end\">\r\n");
      out.write("    <hr style=\"border: 2px solid black\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <a><i class=\"fa fa-phone-square\" aria-hidden=\"true\"></i>Hỗ Trợ/Mua Hàng: 0706166088</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr style=\"border: 2px solid black\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"info\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <h4>Giới Thiệu</h4>\r\n");
      out.write("        <a>DirtyCoins xuất hiện trên thị trường từ đầu năm 2017, DirtyCoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế. DirtyCoins thực chất là một cách lồng ghép khéo léo về sự ra đời của thương hiệu. Chữ Y trên đồng tiền tượng trưng cho tiền thân của DirtyCoins, The Yars Shop. Bắt nguồn từ Yars, DirtyCoins trân trọng giá trị của đồng tiền xương máu, thành quả lao động đầy mồ hôi, bụi bẩn và nước mắt. Với sức hút của mình, Dirty Coins trở thành biểu tượng cho phong cách thời trang mạnh mẽ, táo bạo, và được ưa chuộng rộng rãi. DirtyCoins mang đến một cái góc độ độc đáo không những về phong cách sống mà còn về gout ăn mặc hiện đại. DirtyCoins nhận thức được nhu cầu đang phát triển của thị trường Streetwear Việt Nam. Những mặt hàng thời trang tại DirtyCoins được thiết kế với sự kết hợp văn hoá Châu Á và Châu Âu, tạo ra phong cách độc đáo và mới mẻ. Bên cạnh đó ,với sự phá cách từ tông màu trắng đen, tông màu chủ đạo của đa số dòng thời trang Streetwear, các mẫu thời trang tại Dirtycoins mang nhiều màu sắc phong phú. Đây là cách DirtyCoins mang đến giá trị cho cộng đồng trẻ yêu thích Streetwear, khuyến khích họ mạo hiểm trong gu ăn mặc của mình. Với tính cách mạo hiểm, không ngại rủi ro, DirtyCoins dần mở rộng thị trường trong suốt quá trình phát triển các chi nhánh trên toàn quốc, đem tới một nền văn hoá rất riêng của DirtyCoins.</a>\r\n");
      out.write("        <h4>Mạng Xã Hội</h4>\r\n");
      out.write("        <div class=\"mxh\">\r\n");
      out.write("            <a href=\"https://www.facebook.com\"><i class=\"fa fa-facebook fa-2x\" aria-hidden=\"true\" style=\"color: #0b7dda;border-radius: 30%;vertical-align: middle;\"></i></a>\r\n");
      out.write("            <a href=\"https://www.instagram.com\"><i class=\"fa fa-instagram fa-2x\" aria-hidden=\"true\" style=\"color: orange;border-radius: 30%;vertical-align: middle\"></i></a>\r\n");
      out.write("            <a href=\"https://www.youtube.com\"><i class=\"fa fa-youtube-play fa-2x\" aria-hidden=\"true\" style=\"color: red;border-radius: 30%;vertical-align: middle\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
