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
      out.write("    <p class=\"p\"><i class=\"fa fa-phone fa-5x\" aria-hidden=\"true\" style=\"color: #363636\" ></i> Li??n H???</p>\r\n");
      out.write("    <div class=\"flip-card\">\r\n");
      out.write("    <div class=\"flip-card-inner\">\r\n");
      out.write("        <div class=\"flip-card-front\">\r\n");
      out.write("            <img src=\"img/Minh.jpg\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"flip-card-back\">\r\n");
      out.write("            <h1>????o Kh??nh Minh</h1>\r\n");
      out.write("            <p>Web Developer & Designer</p>\r\n");
      out.write("            <p>S??T: 0706166088</p>\r\n");
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
      out.write("            <h1>H???a V??? Nh??n</h1>\r\n");
      out.write("            <p>Design & Database</p>\r\n");
      out.write("            <p>S??T: 0946922737</p>\r\n");
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
      out.write("            <h1>Tr???n Phan Minh Tr?????ng</h1>\r\n");
      out.write("            <p>Database</p>\r\n");
      out.write("            <p>S??T: 0769713139</p>\r\n");
      out.write("            <a href=\"https://www.facebook.com/MinTruong08\" class=\"fa fa-facebook\" style=\"background: #3B5998;color: white;\"></a>\r\n");
      out.write("            <a href=\"#\" class=\"fa fa-instagram\" style=\"background: #F4A460;color: white\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"end\">\r\n");
      out.write("    <hr style=\"border: 2px solid black\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <a><i class=\"fa fa-phone-square\" aria-hidden=\"true\"></i>H??? Tr???/Mua H??ng: 0706166088</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr style=\"border: 2px solid black\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"info\">\r\n");
      out.write("    <div>\r\n");
      out.write("        <h4>Gi???i Thi???u</h4>\r\n");
      out.write("        <a>DirtyCoins xu???t hi???n tr??n th??? tr?????ng t??? ?????u n??m 2017, DirtyCoins mang s???c m???nh c???a m???t th????ng hi???u local brand ?????y c?? t??nh v???i nh???ng s???n ph???m th???i trang h??ng ?????u xu th???. DirtyCoins th???c ch???t l?? m???t c??ch l???ng gh??p kh??o l??o v??? s??? ra ?????i c???a th????ng hi???u. Ch??? Y tr??n ?????ng ti???n t?????ng tr??ng cho ti???n th??n c???a DirtyCoins, The Yars Shop. B???t ngu???n t??? Yars, DirtyCoins tr??n tr???ng gi?? tr??? c???a ?????ng ti???n x????ng m??u, th??nh qu??? lao ?????ng ?????y m??? h??i, b???i b???n v?? n?????c m???t. V???i s???c h??t c???a m??nh, Dirty Coins tr??? th??nh bi???u t?????ng cho phong c??ch th???i trang m???nh m???, t??o b???o, v?? ???????c ??a chu???ng r???ng r??i. DirtyCoins mang ?????n m???t c??i g??c ????? ?????c ????o kh??ng nh???ng v??? phong c??ch s???ng m?? c??n v??? gout ??n m???c hi???n ?????i. DirtyCoins nh???n th???c ???????c nhu c???u ??ang ph??t tri???n c???a th??? tr?????ng Streetwear Vi???t Nam. Nh???ng m???t h??ng th???i trang t???i DirtyCoins ???????c thi???t k??? v???i s??? k???t h???p v??n ho?? Ch??u ?? v?? Ch??u ??u, t???o ra phong c??ch ?????c ????o v?? m???i m???. B??n c???nh ???? ,v???i s??? ph?? c??ch t??? t??ng m??u tr???ng ??en, t??ng m??u ch??? ?????o c???a ??a s??? d??ng th???i trang Streetwear, c??c m???u th???i trang t???i Dirtycoins mang nhi???u m??u s???c phong ph??. ????y l?? c??ch DirtyCoins mang ?????n gi?? tr??? cho c???ng ?????ng tr??? y??u th??ch Streetwear, khuy???n kh??ch h??? m???o hi???m trong gu ??n m???c c???a m??nh. V???i t??nh c??ch m???o hi???m, kh??ng ng???i r???i ro, DirtyCoins d???n m??? r???ng th??? tr?????ng trong su???t qu?? tr??nh ph??t tri???n c??c chi nh??nh tr??n to??n qu???c, ??em t???i m???t n???n v??n ho?? r???t ri??ng c???a DirtyCoins.</a>\r\n");
      out.write("        <h4>M???ng X?? H???i</h4>\r\n");
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
