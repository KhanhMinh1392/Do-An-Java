package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.List;
import entity.SanPham;

public final class Products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>SHOP-LEO</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/icon_font/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/css/products.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Products.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"sidenav\">\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Home.jsp\">\n");
      out.write("        <img class=\"img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/logo2.png\">\n");
      out.write("    </a>\n");
      out.write("    <div class=\"head\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products\" >SHOP</a>\n");
      out.write("        \n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/News.jsp\" >NEWS</a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Help.jsp\" >CONTACT</a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/About.jsp\" >ABOUT</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"icon\">\n");
      out.write("        <a href=\"\"><i class=\"fa fa-search fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><i class=\"fa fa-user fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/Bag.jsp\"><i class=\"fa fa-shopping-basket fa-2x\" aria-hidden=\"true\" style=\"color: black\"></i></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("/*Hinh mo dau*/\n");
      out.write("<div class=\"container\">\n");
      out.write("    <img class=\"pic\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/slide-img5.jpg\" alt=\"Snow\" style=\"width:1100px\" height=\"300px\">\n");
      out.write("    <div class=\"centered\">SHOP</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("        <a><button class=\"dropbtn\" onclick=\"filterSelection('all')\"> Show All</button></a>\n");
      out.write("        <div id=\"myBtnContainer\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("        <a><button onclick=\"myFunction()\" class=\"dropbtn\">Lo???i <i class=\"fa fa-caret-down\" aria-hidden=\"true\" style=\"right: 100px\"></i></button></a>\n");
      out.write("        <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('t-shirt')\"> T-Shirt</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('shrt')\"> Shirt</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('backpack')\"> Backpack</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('shorts')\"> Short</button></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<div class=\"dropdown\">\n");
      out.write("        <a><button onclick=\"myFunction1()\" class=\"dropbtn\">Colour<i class=\"fa fa-caret-down\" aria-hidden=\"true\" ></i></button></a>\n");
      out.write("        <div id=\"myDropdown1\" class=\"dropdown-content\">\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('white')\"> White</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('black')\"> Black</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('beige')\"> Beige</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('sky')\">Sky</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('mint')\">Mint</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('tan')\">Tan</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('red')\">Red</button></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("        <a><button onclick=\"myFunction2()\" class=\"dropbtn\">Price<i class=\"fa fa-caret-down\" aria-hidden=\"true\" style=\"right: 100px\" ></i></button></a>\n");
      out.write("        <div id=\"myDropdown2\" class=\"dropdown-content\">\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('200')\"> 200.000??-300.000?? </button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('350')\"> 350.000??-600.000??</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('550')\"> 550.000??-800.000??</button></a>\n");
      out.write("            <a href=\"#\"><button class=\"btncon\" onclick=\"filterSelection('800')\"> 800.000??-1.500.000??</button></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <hr style=\"border: 2px solid black\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("        ");

            // th???y c??i products k, m k h??? set n?? ??? ????u c???, l??m sao g???i get n?? dc
            //l???i l?? do c??i listProducts b??? null v?? k h??? c??  getAttribute("products")
            // ??? ????u ???? m ph???i setAttribute("products", list c??c s???n ph???m); th?? m m???i g???i n?? ra 
            //view nhan data tu ben kia truyen sang
            List<SanPham> listProducts = (List)request.getAttribute("products");//doan nay lay data truyen sang ne
            Locale locale = new Locale("vi","VN");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            
            if(listProducts !=null){ //neu data k null thi in ra
            System.out.println(listProducts);
            for(SanPham sp : listProducts)
            {   
        
      out.write("\n");
      out.write("        <div class=\"column 350\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ProductDetail?masp=");
 out.print(sp.getMaSP()); 
      out.write("\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
 out.print(sp.getAnh());
      out.write("\" alt=\"\" style=\"width:100%\">\n");
      out.write("                    <h4 class=\"text-dark\">");
 out.print(sp.getTenSP()); 
      out.write("</h4>\n");
      out.write("                    <p class=\"text-dark\">");
 out.print(currencyFormatter.format(sp.getGiaSP()));
      out.write("</p>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"row justify-content-center\">\n");
      out.write("        <ul class=\"pagination pagination-sm\">\n");
      out.write("            ");

                int totalpage = (int) request.getAttribute("totalpage");
                int pagecurrent = (int) request.getAttribute("pagecurrent");
            
      out.write("\n");
      out.write("            <li class=\"page-item ");
 out.print((pagecurrent==1)?"disabled":""); 
      out.write("\">\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products?page=");
 out.print(pagecurrent-1); 
      out.write("\" class=\"page-link\"><<</a>\n");
      out.write("            </li>\n");
      out.write("            ");

                for(int i = 1; i<= totalpage; i++){
            
      out.write("\n");
      out.write("            <li class=\"page-item ");
 out.print((pagecurrent==i)?"disabled":""); 
      out.write("\">\n");
      out.write("                <a class=\"page-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products?page=");
 out.print(i); 
      out.write('"');
      out.write('>');
 out.print(i); 
      out.write("</a>\n");
      out.write("            </li>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <li class=\"page-item ");
 out.print((pagecurrent==totalpage)?"disabled":""); 
      out.write("\">\n");
      out.write("                <a class=\"page-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Products?page=");
 out.print(pagecurrent+1); 
      out.write("\">>></a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"end\">\n");
      out.write("    <hr style=\"border: 2px solid black\">\n");
      out.write("    <div>\n");
      out.write("        <a><i class=\"fa fa-phone-square\" aria-hidden=\"true\" style=\"margin-left: -30px\"></i> H??? Tr???/Mua H??ng: 0706166088</a>\n");
      out.write("    </div>\n");
      out.write("    <hr style=\"border: 2px solid black\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"info\">\n");
      out.write("    <div>\n");
      out.write("        <h4>Gi???i Thi???u</h4>\n");
      out.write("        <a>DirtyCoins xu???t hi???n tr??n th??? tr?????ng t??? ?????u n??m 2017, DirtyCoins mang s???c m???nh c???a m???t th????ng hi???u local brand ?????y c?? t??nh v???i nh???ng s???n ph???m th???i trang h??ng ?????u xu th???. DirtyCoins th???c ch???t l?? m???t c??ch l???ng gh??p kh??o l??o v??? s??? ra ?????i c???a th????ng hi???u. Ch??? Y tr??n ?????ng ti???n t?????ng tr??ng cho ti???n th??n c???a DirtyCoins, The Yars Shop. B???t ngu???n t??? Yars, DirtyCoins tr??n tr???ng gi?? tr??? c???a ?????ng ti???n x????ng m??u, th??nh qu??? lao ?????ng ?????y m??? h??i, b???i b???n v?? n?????c m???t. V???i s???c h??t c???a m??nh, Dirty Coins tr??? th??nh bi???u t?????ng cho phong c??ch th???i trang m???nh m???, t??o b???o, v?? ???????c ??a chu???ng r???ng r??i. DirtyCoins mang ?????n m???t c??i g??c ????? ?????c ????o kh??ng nh???ng v??? phong c??ch s???ng m?? c??n v??? gout ??n m???c hi???n ?????i. DirtyCoins nh???n th???c ???????c nhu c???u ??ang ph??t tri???n c???a th??? tr?????ng Streetwear Vi???t Nam. Nh???ng m???t h??ng th???i trang t???i DirtyCoins ???????c thi???t k??? v???i s??? k???t h???p v??n ho?? Ch??u ?? v?? Ch??u ??u, t???o ra phong c??ch ?????c ????o v?? m???i m???. B??n c???nh ???? ,v???i s??? ph?? c??ch t??? t??ng m??u tr???ng ??en, t??ng m??u ch??? ?????o c???a ??a s??? d??ng th???i trang Streetwear, c??c m???u th???i trang t???i Dirtycoins mang nhi???u m??u s???c phong ph??. ????y l?? c??ch DirtyCoins mang ?????n gi?? tr??? cho c???ng ?????ng tr??? y??u th??ch Streetwear, khuy???n kh??ch h??? m???o hi???m trong gu ??n m???c c???a m??nh. V???i t??nh c??ch m???o hi???m, kh??ng ng???i r???i ro, DirtyCoins d???n m??? r???ng th??? tr?????ng trong su???t qu?? tr??nh ph??t tri???n c??c chi nh??nh tr??n to??n qu???c, ??em t???i m???t n???n v??n ho?? r???t ri??ng c???a DirtyCoins.</a>\n");
      out.write("        <h4>M???ng X?? H???i</h4>\n");
      out.write("        <div class=\"mxh\">\n");
      out.write("            <a href=\"https://www.facebook.com\"><i class=\"fa fa-facebook fa-2x\" aria-hidden=\"true\" style=\"color: white;background: #0b7dda;width: 35px;height: 30px;border-radius: 30%\"></i></a>\n");
      out.write("            <a href=\"https://www.instagram.com\"><i class=\"fa fa-instagram fa-2x\" aria-hidden=\"true\" style=\"color: white;background:  #ffad1a;width: 35px;height: 30px;border-radius: 30%\"></i></a>\n");
      out.write("            <a href=\"https://www.youtube.com\"><i class=\"fa fa-youtube-play fa-2x\" aria-hidden=\"true\" style=\"color: red;border-radius: 30%\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    filterSelection(\"all\")\n");
      out.write("    function filterSelection(c) {\n");
      out.write("        var x, i;\n");
      out.write("        x = document.getElementsByClassName(\"column\");\n");
      out.write("        if (c == \"all\") c = \"\";\n");
      out.write("        for (i = 0; i < x.length; i++) {\n");
      out.write("            RemoveClass(x[i], \"show\");\n");
      out.write("            if (x[i].className.indexOf(c) > -1) AddClass(x[i], \"show\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function AddClass(element, name) {\n");
      out.write("        var i, arr1, arr2;\n");
      out.write("        arr1 = element.className.split(\" \");\n");
      out.write("        arr2 = name.split(\" \");\n");
      out.write("        for (i = 0; i < arr2.length; i++) {\n");
      out.write("            if (arr1.indexOf(arr2[i]) == -1) {element.className += \" \" + arr2[i];}\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function RemoveClass(element, name) {\n");
      out.write("        var i, arr1, arr2;\n");
      out.write("        arr1 = element.className.split(\" \");\n");
      out.write("        arr2 = name.split(\" \");\n");
      out.write("        for (i = 0; i < arr2.length; i++) {\n");
      out.write("            while (arr1.indexOf(arr2[i]) > -1) {\n");
      out.write("                arr1.splice(arr1.indexOf(arr2[i]), 1);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        element.className = arr1.join(\" \");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    var btnContainer = document.getElementById(\"myBtnContainer\");\n");
      out.write("    var btns = btnContainer.getElementsByClassName(\"btn\");\n");
      out.write("    for (var i = 0; i < btns.length; i++) {\n");
      out.write("        btns[i].addEventListener(\"click\", function(){\n");
      out.write("            var current = document.getElementsByClassName(\"active\");\n");
      out.write("            current[0].className = current[0].className.replace(\" active\", \"\");\n");
      out.write("            this.className += \" active\";\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function myFunction() {\n");
      out.write("        document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("    }\n");
      out.write("    function myFunction1() {\n");
      out.write("        document.getElementById(\"myDropdown1\").classList.toggle(\"show\");\n");
      out.write("    }\n");
      out.write("    function myFunction2() {\n");
      out.write("        document.getElementById(\"myDropdown2\").classList.toggle(\"show\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Close the dropdown if the user clicks outside of it\n");
      out.write("    window.onclick = function(event) {\n");
      out.write("        if (!event.target.matches('.dropbtn')) {\n");
      out.write("            var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("            var i;\n");
      out.write("            for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("                var openDropdown = dropdowns[i];\n");
      out.write("                if (openDropdown.classList.contains('show')) {\n");
      out.write("                    openDropdown.classList.remove('show');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
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
