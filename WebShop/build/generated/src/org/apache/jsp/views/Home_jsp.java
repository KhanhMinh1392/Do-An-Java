package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Category;
import dao.CategoryDAO;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

 CategoryDAO categoryDAO = new CategoryDAO();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>LEO</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/icon_font/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/home.css\">\r\n");
      out.write("    <!--  <script src=\"views/showSlides.js\"></script>\r\n");
      out.write("    <script src=\"views/script.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"javascript/JQuery3.3.1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"javascript/lightslider.js\"></script>   -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"sidenav\">\r\n");
      out.write("    <a href=\"Home.jsp\">\r\n");
      out.write("        <img class=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/logo2.png\">\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"head\">\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products\" >SHOP</a>  \r\n");
      out.write("        <a href=\"News.jsp\" >NEWS</a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Help.jsp\" >CONTACT</a>\r\n");
      out.write("        <a href=\"About.jsp\" >ABOUT</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"icon\">\r\n");
      out.write("        <a href=\"\"><i class=\"fa fa-search fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Login.jsp\"><i class=\"fa fa-user fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Bag.jsp\"><i class=\"fa fa-shopping-basket fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <div class=\"slideshow-container\">\r\n");
      out.write("        <div class=\"mySlides fade\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/LouisVuitton.jpg\" alt=\"Hình ảnh LV\" width=\"1580px\" height=\"600\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mySlides fade\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/FOG.png\" alt=\"Hình ảnh FOG\" width=1580px height=\"600\" >\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mySlides fade\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/17182757.jpg\"alt=\"Hình ảnh\" width=1580px height=\"600\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mySlides fade\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/Nike.png\" alt=\"Hình ảnh Nike\" width=1580px height=\"600\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"mySlides fade\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/slide.png\" alt=\"Slide\" width=1580px height=\"600\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n");
      out.write("        <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"text-align: center\">\r\n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(1)\"></span>\r\n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(2)\"></span>\r\n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(3)\"></span>\r\n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(4)\"></span>\r\n");
      out.write("        <span class=\"dot\" onclick=\"currentSlide(5)\"></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        var slideIndex = 0;\r\n");
      out.write("        showSlides();\r\n");
      out.write("\r\n");
      out.write("        function showSlides() {\r\n");
      out.write("            var i;\r\n");
      out.write("            var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("            var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("            for (i = 0; i < slides.length; i++) {\r\n");
      out.write("                slides[i].style.display = \"none\";\r\n");
      out.write("            }\r\n");
      out.write("            slideIndex++;\r\n");
      out.write("            if (slideIndex > slides.length) {slideIndex = 1}\r\n");
      out.write("            for (i = 0; i < dots.length; i++) {\r\n");
      out.write("                dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("            }\r\n");
      out.write("            slides[slideIndex-1].style.display = \"block\";\r\n");
      out.write("            dots[slideIndex-1].className += \" active\";\r\n");
      out.write("            setTimeout(showSlides, 3000); // thay Äá»i áº£nh trong 3s\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <div class=\"imgg\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/model.png\"width= auto height=\"600\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/16.png\" width=auto height=\"600\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/bag.jpg\" width=auto height=\"600\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"bsl\" href=\"#\">\r\n");
      out.write("        <p >BEST SELLER</p>\r\n");
      out.write("    </a>\r\n");
      out.write("    <hr style=\"border: 2px solid black\" width=\"900px\">\r\n");
      out.write("    <br>\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <a href=\"Backpack2.html\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/balo1.png\" alt=\"Beige-Backpack\" style=\"width:100%\" height= \"360px\">\r\n");
      out.write("                <h1 class=\"h1\">Backpack Beige</h1>\r\n");
      out.write("                <p class=\"price\">800.000Đ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card2\">\r\n");
      out.write("            <a href=\"Backpack1.html\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/balo2.png\" alt=\"Tan-Backpack\" style=\"width:100%\">\r\n");
      out.write("                <h1 class=\"h1\">Backpack Tan Limit</h1>\r\n");
      out.write("                <p class=\"price\">800.000Đ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card3\">\r\n");
      out.write("            <a href=\"16eyes.html\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/eyes.png\" alt=\"EyeT-Shirt\" style=\"width:100%\">\r\n");
      out.write("                <h1 class=\"h1\">Eyes T-Shirt</h1>\r\n");
      out.write("                <p class=\"price\">450.000Đ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products\">\r\n");
      out.write("            <button class=\"button\">Xem Tất Cả</button>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br> <br>\r\n");
      out.write("    <hr style=\"border: 2px solid black\" width=\"900px\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"imgg2\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/model.png\" width=auto height=\"600\">\r\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/model2.png\" width=auto height=\"600\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <a class=\"bsl\" href=\"#\">\r\n");
      out.write("        <p>New Arrival</p>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <hr style=\"border: 2px solid black\" width=\"900px\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <a href=\"Jacket.html\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/jaket.jpg\" alt=\"jacket\" style=\"width:100%\" height=\"260px\">\r\n");
      out.write("            <h1 class=\"h1\">16Typh Jacket</h1>\r\n");
      out.write("            <p class=\"price\">850.000Đ</p>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"card2\">\r\n");
      out.write("        <a href=\"16TyphRapper.html\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/tshirt.jpg\" alt=\"16TyphRapper\" style=\"width:100%\">\r\n");
      out.write("            <h1 class=\"h1\">16Typh Rapper</h1>\r\n");
      out.write("            <p class=\"price\">420.000Đ</p>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"card3\">\r\n");
      out.write("        <a href=\"16eyes.html\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/tshirt2.jpg\" alt=\"EyeT-Shirt\" style=\"width:100%\">\r\n");
      out.write("            <h1 class=\"h1\">16Typh Eyes T-Shirt</h1>\r\n");
      out.write("            <p class=\"price\">420.000Đ</p>\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"part2\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("            <a href=\"T%20V4.html\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/1tshirt.jpg\" alt=\"jacket\" style=\"width:100%\">\r\n");
      out.write("                <h1 class=\"h1\">Basic Tee V4</h1>\r\n");
      out.write("                <p class=\"price\">390.000Đ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card2\">\r\n");
      out.write("            <a href=\"Tv3.html\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/2tshirt.jpg\" alt=\"Tan-Backpack\" style=\"width:100%\">\r\n");
      out.write("                <h1 class=\"h1\">Basic Tee V3</h1>\r\n");
      out.write("                <p class=\"price\">390.000Đ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card3\">\r\n");
      out.write("            <a href=\"Uni.html\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/3tshirt.jpg\" alt=\"EyeT-Shirt\" style=\"width:100%\">\r\n");
      out.write("                <h1 class=\"h1\">Basic Uni Tee </h1>\r\n");
      out.write("                <p class=\"price\">390.000Đ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
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
      out.write("            <a href=\"https://www.facebook.com\"><i class=\"fa fa-facebook fa-2x\" aria-hidden=\"true\" style=\"color: white;background: #0b7dda;width: 35px;height: 30px;border-radius: 30%\"></i></a>\r\n");
      out.write("            <a href=\"https://www.instagram.com\"><i class=\"fa fa-instagram fa-2x\" aria-hidden=\"true\" style=\"color: white;background:  #ffad1a;width: 35px;height: 30px;border-radius: 30%\"></i></a>\r\n");
      out.write("            <a href=\"https://www.youtube.com\"><i class=\"fa fa-youtube-play fa-2x\" aria-hidden=\"true\" style=\"color: red;border-radius: 30%\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
