package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class News_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vn\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>LEO- News</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"icon_font/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/News.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"sidenav\">\n");
      out.write("    <a href=\"Home.jsp\">\n");
      out.write("        <img class=\"img\" src=\"img/logo2.png\">\n");
      out.write("    </a>\n");
      out.write("    <div class=\"head\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products\" >SHOP</a>  \n");
      out.write("        <a href=\"News.jsp\" >NEWS</a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Help.jsp\" >CONTACT</a>\n");
      out.write("        <a href=\"About.jsp\" >ABOUT</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"icon\">\n");
      out.write("        <a href=\"\"><i class=\"fa fa-search fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\n");
      out.write("        <a href=\"Login.html\"><i class=\"fa fa-user fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\n");
      out.write("        <a href=\"Bag.html\"><i class=\"fa fa-shopping-basket fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"main\">\n");
      out.write("    <br><br><br><br>\n");
      out.write("    <h1>LEO-NEWS</h1>\n");
      out.write("    <hr>\n");
      out.write("    <h2>NEWS</h2>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/varsity.jpg\" alt=\"Varsity\" style=\"width:100%\">\n");
      out.write("                <h3>VARSITY JACKET: NGÔN NGỮ MỚI CỦA THỂ THAO HỌC ĐƯỜNG</h3>\n");
      out.write("                <p>Khi xu hướng thời trang Retro của những năm cuối thế kỷ XX quay trở lại hòa mình vào dòng chảy thời trang cũng là lúc phong cách cổ điển đương thời lên ngôi. Chiếc áo Varsity dù mang thiết kế trơn tru......</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/ybasic.jpg\" alt=\"Y basic\" style=\"width:100%\">\n");
      out.write("                <h3> BASIC TEE KẾT HỢP LÔNG - ITEM CŨ MANG HƠI THỞ ĐƯƠNG ĐẠI MỚI</h3>\n");
      out.write("                <p>Xu hướng thời trang ngày càng phát triển, mỗi giới tính và vóc dáng đều có những sản phẩm giúp họ trở nên đẹp hơn. Trong số những xu hướng đó, áo thun chính là kiểu trang phục phổ biến, được nhiều người ....</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/runnerwash.jpg\" alt=\"Runner Wash\" style=\"width:100%\">\n");
      out.write("                <h3>TÓM LƯỢC LỊCH SỬ RA ĐỜI ÁO THUN Y BASIC COLOUR</h3>\n");
      out.write("                <p>Thực chất áo thun có nguồn gốc từ chiếc áo lót của nam giới châu Âu vào thế kỉ XIX, thời đó đàn ông thường mặc một chiếc áo lót bên trong và áo sơ mi bên ngoài. Áo thun thường chỉ được sử dụng rộng rãi và dễ mặc, cảm thấy thoải mái khi mặc vào, không ...</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/16typheyes.jpg\" alt=\"Mountains\" style=\"width:100%\">\n");
      out.write("                <h3>CÁCH CHECK ÁO DIRTYCOINS X 16 TYPH FAKE REAL CHUẨN NHẤT</h3>\n");
      out.write("                <p>Sau sự thành công nằm ngoài dự đoán từ collection collab DirtyCoins x 16 Typh, team DirtyCoins muốn gửi lời cảm ơn chân thành đến tất cả những khách hàng đã yêu mến và ủng hộ nhiệt tình sản phẩm trong...</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/but.jpg\" alt=\"Mountains\" style=\"width:100%\">\n");
      out.write("                <h3>THE MONARCH COLLECTION</h3>\n");
      out.write("                <p>Với đam mê tạo ra dòng sản phẩm thời trang bao gồm quần áo và phụ kiện hằng-ngày phục vụ nhu cầu và lối sống giới trẻ, chúng tôi quan niệm rằng mặc-đẹp phải đi đôi với sự thoải-mái</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/DCx16.jpg\" alt=\"Mountains\" style=\"width:100%\">\n");
      out.write("                <h3>DIRTYCOINS X 16 TYPH</h3>\n");
      out.write("                <p>Xu hướng collab giữa thời trang và nghệ thuật từ lâu đã không còn là khái niệm xa lạ đối với giới mộ điệu tại Việt Nam. Những rapper với gu thời trang phá cách, chất chơi giờ đây là trendsetter</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/HDpurple.jpg\" alt=\"Mountains\" style=\"width:100%\">\n");
      out.write("                <h3>Graffiti Hoodie - Purple</h3>\n");
      out.write("                <p>Với đam mê tạo ra dòng sản phẩm thời trang bao gồm quần áo và phụ kiện hằng-ngày phục vụ nhu cầu và lối sống giới trẻ, chúng tôi quan niệm rằng mặc-đẹp phải đi đôi với sự thoải-mái</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <img src=\"img/sweatshirt.jpg\" alt=\"Mountains\" style=\"width:100%\">\n");
      out.write("                <h3>DirtyCoins Logo Sweatshirt</h3>\n");
      out.write("                <p>Với đam mê tạo ra dòng sản phẩm thời trang bao gồm quần áo và phụ kiện hằng-ngày phục vụ nhu cầu và lối sống giới trẻ, chúng tôi quan niệm rằng mặc-đẹp phải đi đôi với sự thoải-mái</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"end\">\n");
      out.write("    <hr style=\"border: 2px solid black\">\n");
      out.write("    <div>\n");
      out.write("        <a><i class=\"fa fa-phone-square\" aria-hidden=\"true\"></i>Hỗ Trợ/Mua Hàng: 0706166088</a>\n");
      out.write("    </div>\n");
      out.write("    <hr style=\"border: 2px solid black\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"info\">\n");
      out.write("    <div>\n");
      out.write("        <h4>Giới Thiệu</h4>\n");
      out.write("        <a>DirtyCoins xuất hiện trên thị trường từ đầu năm 2017, DirtyCoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế. DirtyCoins thực chất là một cách lồng ghép khéo léo về sự ra đời của thương hiệu. Chữ Y trên đồng tiền tượng trưng cho tiền thân của DirtyCoins, The Yars Shop. Bắt nguồn từ Yars, DirtyCoins trân trọng giá trị của đồng tiền xương máu, thành quả lao động đầy mồ hôi, bụi bẩn và nước mắt. Với sức hút của mình, Dirty Coins trở thành biểu tượng cho phong cách thời trang mạnh mẽ, táo bạo, và được ưa chuộng rộng rãi. DirtyCoins mang đến một cái góc độ độc đáo không những về phong cách sống mà còn về gout ăn mặc hiện đại. DirtyCoins nhận thức được nhu cầu đang phát triển của thị trường Streetwear Việt Nam. Những mặt hàng thời trang tại DirtyCoins được thiết kế với sự kết hợp văn hoá Châu Á và Châu Âu, tạo ra phong cách độc đáo và mới mẻ. Bên cạnh đó ,với sự phá cách từ tông màu trắng đen, tông màu chủ đạo của đa số dòng thời trang Streetwear, các mẫu thời trang tại Dirtycoins mang nhiều màu sắc phong phú. Đây là cách DirtyCoins mang đến giá trị cho cộng đồng trẻ yêu thích Streetwear, khuyến khích họ mạo hiểm trong gu ăn mặc của mình. Với tính cách mạo hiểm, không ngại rủi ro, DirtyCoins dần mở rộng thị trường trong suốt quá trình phát triển các chi nhánh trên toàn quốc, đem tới một nền văn hoá rất riêng của DirtyCoins.</a>\n");
      out.write("        <h4>Mạng Xã Hội</h4>\n");
      out.write("        <div class=\"mxh\">\n");
      out.write("            <a href=\"https://www.facebook.com\"><i class=\"fa fa-facebook fa-2x\" aria-hidden=\"true\" style=\"color: white;background: #0b7dda;width: 35px;height: 30px;border-radius: 30%\"></i></a>\n");
      out.write("            <a href=\"https://www.instagram.com\"><i class=\"fa fa-instagram fa-2x\" aria-hidden=\"true\" style=\"color: white;background:  #ffad1a;width: 35px;height: 30px;border-radius: 30%\"></i></a>\n");
      out.write("            <a href=\"https://www.youtube.com\"><i class=\"fa fa-youtube-play fa-2x\" aria-hidden=\"true\" style=\"color: red;border-radius: 30%\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
