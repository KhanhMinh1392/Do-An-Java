<%-- 
    Document   : CTSP
    Created on : May 31, 2021, 7:11:15 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>${product.getTenSP()}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/ProductDetail.css">
</head>
<body>
<div class="sidenav">
    <a href="${pageContext.request.contextPath}/Home">
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
        <a href=""><i class="fa fa-shopping-basket fa-2x" aria-hidden="true" style="color: black"></i></a>
    </div>
</div>

<div class="img-magnifier-container">
    <img id="myimage" src="${pageContext.request.contextPath}/${product.getAnh()}" width="700" height="700">
</div>

<div class="main">
    <h3>${product.getTenSP()}</h3>
    <p>${String.format("%.0f", product.getGiaSP())}VNĐ</p>
    <div class="btn">
        <button type="button" class="btnM">Size M</button>
        <button type="button" class="btnL">Size L</button>
        <button type="button" class="btnXL">Size XL</button>
        <div class="btnTGMN">
            <button type="button" class="btnTG"> THÊM VÀO GIỎ</button>
            <br>
            <button type="button" class="btnMN"> MUA NGAY</button>
        </div>
    </div>
     <p>Chi tiết sản phẩm</p>
    <div class="ctsp">
        <p1>* 100% Cotton</p1>
        <br>
        <p1>* Logo Y nỉ lông</p1>
        <br>
        <p1>* Size: M, L, XL (dáng áo fit oversize) </p1>
        <br>
        <p1>* Kỹ thuật in decal</p1>
        <br>
        <p1>* Giặt máy không bay màu, chất liệu cao cấp </p1>
    </div> 

</div>


<script>
    function magnify(imgID, zoom) {
        var img, glass, w, h, bw;
        img = document.getElementById(imgID);
        /*tạo kính lúp:*/
        glass = document.createElement("DIV");
        glass.setAttribute("class", "img-magnifier-glass");
        /*chèn kính lúp:*/
        img.parentElement.insertBefore(glass, img);
        /*đặt thuộc tính cho kính lúp*/
        glass.style.backgroundImage = "url('" + img.src + "')";
        glass.style.backgroundRepeat = "no-repeat";
        glass.style.backgroundSize = (img.width * zoom) + "px " + (img.height * zoom) + "px";
        bw = 3;
        w = glass.offsetWidth / 2;
        h = glass.offsetHeight / 2;
        /*Thực thi chức năng kính lúp trên màn ảnh*/
        glass.addEventListener("mousemove", moveMagnifier);
        img.addEventListener("mousemove", moveMagnifier);
        /*màn hình cảm ứng*/
        glass.addEventListener("touchmove", moveMagnifier);
        img.addEventListener("touchmove", moveMagnifier);
        function moveMagnifier(e) {
            var pos, x, y;
            /*ngăn chặn các hoạt động khi duy chuyển qua ảnh*/
            e.preventDefault();
            /*Lấy vị trí x,y của con trỏ*/
            pos = getCursorPos(e);
            x = pos.x;
            y = pos.y;
            /*Chặn Kính lúp out ra khỏi ảnh*/
            if (x > img.width - (w / zoom)) {x = img.width - (w / zoom);}
            if (x < w / zoom) {x = w / zoom;}
            if (y > img.height - (h / zoom)) {y = img.height - (h / zoom);}
            if (y < h / zoom) {y = h / zoom;}
            /*đặt vị trí của kính lúp:*/
            glass.style.left = (x - w) + "px";
            glass.style.top = (y - h) + "px";
            /*hiển thị những gì kính lúp nhìn thấy*/
            glass.style.backgroundPosition = "-" + ((x * zoom) - w + bw) + "px -" + ((y * zoom) - h + bw) + "px";
        }
        function getCursorPos(e) {
            var a, x = 0, y = 0;
            e = e || window.event;
            /*Lấy vị trí x và y của ảnh*/
            a = img.getBoundingClientRect();
            /*tính toán tạo độ liên quan đến ảnh*/
            x = e.pageX - a.left;
            y = e.pageY - a.top;
            /*xem xét bất kì cuộn trang nào*/
            x = x - window.pageXOffset;
            y = y - window.pageYOffset;
            return {x : x, y : y};
        }
    }
</script>
<script>
    /* Kích thước kính lúp*/
    magnify("myimage", 3);
</script>
</body>
</html>