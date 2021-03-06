<%-- 
    Document   : Products
    Created on : May 21, 2021, 6:50:37 AM
    Author     : HELLO
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.List"%>
<%@page import="entity.SanPham"%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SHOP-LEO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/products.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/Products.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="sidenav">
    <a href="${pageContext.request.contextPath}/views/Home.jsp">
        <img class="img" src="${pageContext.request.contextPath}/views/img/logo2.png">
    </a>
    <div class="head">
        <a href="${pageContext.request.contextPath}/Products" >SHOP</a>
        
        <a href="${pageContext.request.contextPath}/views/News.jsp" >NEWS</a>
        <a href="${pageContext.request.contextPath}/views/Help.jsp" >CONTACT</a>
        <a href="${pageContext.request.contextPath}/views/About.jsp" >ABOUT</a>
    </div>
    <div class="icon">
        <a href=""><i class="fa fa-search fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="${pageContext.request.contextPath}/${action}"><i class="fa fa-user fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="${pageContext.request.contextPath}/views/Bag.jsp"><i class="fa fa-shopping-basket fa-2x" aria-hidden="true" style="color: black"></i></a>
    </div>
</div>
<br>
<br>
/*Hinh mo dau*/
<div class="container">
    <img class="pic" src="${pageContext.request.contextPath}/views/img/slide-img5.jpg" alt="Snow" style="width:1100px" height="300px">
    <div class="centered">SHOP</div>
</div>

<br>


<div class="main">
    <div class="dropdown">
        <a><button class="dropbtn" onclick="filterSelection('all')"> Show All</button></a>
        <div id="myBtnContainer">

        </div>
    </div>

    <div class="dropdown">
        <a><button onclick="myFunction()" class="dropbtn">Lo???i <i class="fa fa-caret-down" aria-hidden="true" style="right: 100px"></i></button></a>
        <div id="myDropdown" class="dropdown-content">
            <a href="#"><button class="btncon" onclick="filterSelection('t-shirt')"> T-Shirt</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('shrt')"> Shirt</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('backpack')"> Backpack</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('shorts')"> Short</button></a>
        </div>
    </div>
    
<div class="dropdown">
        <a><button onclick="myFunction1()" class="dropbtn">Colour<i class="fa fa-caret-down" aria-hidden="true" ></i></button></a>
        <div id="myDropdown1" class="dropdown-content">
            <a href="#"><button class="btncon" onclick="filterSelection('white')"> White</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('black')"> Black</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('beige')"> Beige</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('sky')">Sky</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('mint')">Mint</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('tan')">Tan</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('red')">Red</button></a>
        </div>
    </div>
    
    <div class="dropdown">
        <a><button onclick="myFunction2()" class="dropbtn">Price<i class="fa fa-caret-down" aria-hidden="true" style="right: 100px" ></i></button></a>
        <div id="myDropdown2" class="dropdown-content">
            <a href="#"><button class="btncon" onclick="filterSelection('200')"> 200.000??-300.000?? </button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('350')"> 350.000??-600.000??</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('550')"> 550.000??-800.000??</button></a>
            <a href="#"><button class="btncon" onclick="filterSelection('800')"> 800.000??-1.500.000??</button></a>
        </div>
    </div>
    <br>
    <hr style="border: 2px solid black">
    <div class="row">

        <%
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
        %>
        <div class="column 350">
            <div class="content">
                <a href="${pageContext.request.contextPath}/ProductDetail?masp=<% out.print(sp.getMaSP()); %>">
                    <img src="${pageContext.request.contextPath}<% out.print(sp.getAnh());%>" alt="" style="width:100%">
                    <h4 class="text-dark"><% out.print(sp.getTenSP()); %></h4>
                    <p class="text-dark"><% out.print(currencyFormatter.format(sp.getGiaSP()));%></p>
                </a>
            </div>
        </div>
        <%}
            }
        %>
        
    </div>
    <div class="row justify-content-center">
        <ul class="pagination pagination-sm">
            <%
                int totalpage = (int) request.getAttribute("totalpage");
                int pagecurrent = (int) request.getAttribute("pagecurrent");
            %>
            <li class="page-item <% out.print((pagecurrent==1)?"disabled":""); %>">
                <a href="${pageContext.request.contextPath}/Products?page=<% out.print(pagecurrent-1); %>" class="page-link"><<</a>
            </li>
            <%
                for(int i = 1; i<= totalpage; i++){
            %>
            <li class="page-item <% out.print((pagecurrent==i)?"disabled":""); %>">
                <a class="page-link" href="${pageContext.request.contextPath}/Products?page=<% out.print(i); %>"><% out.print(i); %></a>
            </li>
            <%
                }
            %>
            <li class="page-item <% out.print((pagecurrent==totalpage)?"disabled":""); %>">
                <a class="page-link" href="${pageContext.request.contextPath}/Products?page=<% out.print(pagecurrent+1); %>">>></a>
            </li>
        </ul>
    </div>
</div>

<div class="end">
    <hr style="border: 2px solid black">
    <div>
        <a><i class="fa fa-phone-square" aria-hidden="true" style="margin-left: -30px"></i> H??? Tr???/Mua H??ng: 0706166088</a>
    </div>
    <hr style="border: 2px solid black">
</div>

<div class="info">
    <div>
        <h4>Gi???i Thi???u</h4>
        <a>DirtyCoins xu???t hi???n tr??n th??? tr?????ng t??? ?????u n??m 2017, DirtyCoins mang s???c m???nh c???a m???t th????ng hi???u local brand ?????y c?? t??nh v???i nh???ng s???n ph???m th???i trang h??ng ?????u xu th???. DirtyCoins th???c ch???t l?? m???t c??ch l???ng gh??p kh??o l??o v??? s??? ra ?????i c???a th????ng hi???u. Ch??? Y tr??n ?????ng ti???n t?????ng tr??ng cho ti???n th??n c???a DirtyCoins, The Yars Shop. B???t ngu???n t??? Yars, DirtyCoins tr??n tr???ng gi?? tr??? c???a ?????ng ti???n x????ng m??u, th??nh qu??? lao ?????ng ?????y m??? h??i, b???i b???n v?? n?????c m???t. V???i s???c h??t c???a m??nh, Dirty Coins tr??? th??nh bi???u t?????ng cho phong c??ch th???i trang m???nh m???, t??o b???o, v?? ???????c ??a chu???ng r???ng r??i. DirtyCoins mang ?????n m???t c??i g??c ????? ?????c ????o kh??ng nh???ng v??? phong c??ch s???ng m?? c??n v??? gout ??n m???c hi???n ?????i. DirtyCoins nh???n th???c ???????c nhu c???u ??ang ph??t tri???n c???a th??? tr?????ng Streetwear Vi???t Nam. Nh???ng m???t h??ng th???i trang t???i DirtyCoins ???????c thi???t k??? v???i s??? k???t h???p v??n ho?? Ch??u ?? v?? Ch??u ??u, t???o ra phong c??ch ?????c ????o v?? m???i m???. B??n c???nh ???? ,v???i s??? ph?? c??ch t??? t??ng m??u tr???ng ??en, t??ng m??u ch??? ?????o c???a ??a s??? d??ng th???i trang Streetwear, c??c m???u th???i trang t???i Dirtycoins mang nhi???u m??u s???c phong ph??. ????y l?? c??ch DirtyCoins mang ?????n gi?? tr??? cho c???ng ?????ng tr??? y??u th??ch Streetwear, khuy???n kh??ch h??? m???o hi???m trong gu ??n m???c c???a m??nh. V???i t??nh c??ch m???o hi???m, kh??ng ng???i r???i ro, DirtyCoins d???n m??? r???ng th??? tr?????ng trong su???t qu?? tr??nh ph??t tri???n c??c chi nh??nh tr??n to??n qu???c, ??em t???i m???t n???n v??n ho?? r???t ri??ng c???a DirtyCoins.</a>
        <h4>M???ng X?? H???i</h4>
        <div class="mxh">
            <a href="https://www.facebook.com"><i class="fa fa-facebook fa-2x" aria-hidden="true" style="color: white;background: #0b7dda;width: 35px;height: 30px;border-radius: 30%"></i></a>
            <a href="https://www.instagram.com"><i class="fa fa-instagram fa-2x" aria-hidden="true" style="color: white;background:  #ffad1a;width: 35px;height: 30px;border-radius: 30%"></i></a>
            <a href="https://www.youtube.com"><i class="fa fa-youtube-play fa-2x" aria-hidden="true" style="color: red;border-radius: 30%"></i></a>
        </div>

    </div>
</div>


<script>
    filterSelection("all")
    function filterSelection(c) {
        var x, i;
        x = document.getElementsByClassName("column");
        if (c == "all") c = "";
        for (i = 0; i < x.length; i++) {
            RemoveClass(x[i], "show");
            if (x[i].className.indexOf(c) > -1) AddClass(x[i], "show");
        }
    }

    function AddClass(element, name) {
        var i, arr1, arr2;
        arr1 = element.className.split(" ");
        arr2 = name.split(" ");
        for (i = 0; i < arr2.length; i++) {
            if (arr1.indexOf(arr2[i]) == -1) {element.className += " " + arr2[i];}
        }
    }

    function RemoveClass(element, name) {
        var i, arr1, arr2;
        arr1 = element.className.split(" ");
        arr2 = name.split(" ");
        for (i = 0; i < arr2.length; i++) {
            while (arr1.indexOf(arr2[i]) > -1) {
                arr1.splice(arr1.indexOf(arr2[i]), 1);
            }
        }
        element.className = arr1.join(" ");
    }


    var btnContainer = document.getElementById("myBtnContainer");
    var btns = btnContainer.getElementsByClassName("btn");
    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function(){
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
    }
</script>

<script>
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }
    function myFunction1() {
        document.getElementById("myDropdown1").classList.toggle("show");
    }
    function myFunction2() {
        document.getElementById("myDropdown2").classList.toggle("show");
    }

    // Close the dropdown if the user clicks outside of it
    window.onclick = function(event) {
        if (!event.target.matches('.dropbtn')) {
            var dropdowns = document.getElementsByClassName("dropdown-content");
            var i;
            for (i = 0; i < dropdowns.length; i++) {
                var openDropdown = dropdowns[i];
                if (openDropdown.classList.contains('show')) {
                    openDropdown.classList.remove('show');
                }
            }
        }
    }
</script>

</body>
</html>