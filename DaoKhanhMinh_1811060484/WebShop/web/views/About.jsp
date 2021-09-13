<%-- 
    Document   : About
    Created on : May 29, 2021, 11:04:52 AM
    Author     : Administrator
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>LEO- About</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/News.css">
    <script src="javascript/script.js"></script>
</head>
<body>
<div class="sidenav">
    <a href="Home.jsp">
        <img class="img" src="${pageContext.request.contextPath}/views/img/logo2.png">
    </a>
    <div class="head">
        <a href="${pageContext.request.contextPath}/Products" >SHOP</a>  
        <a href="News.jsp" >NEWS</a>
        <a href="${pageContext.request.contextPath}/views/Help.jsp" >CONTACT</a>
        <a href="About.jsp" >ABOUT</a>
    </div>

    <div class="icon">
        <a href=""><i class="fa fa-search fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="Login.jsp"><i class="fa fa-user fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="views/Bag.jsp"><i class="fa fa-shopping-basket fa-2x" aria-hidden="true" style="color: black"></i></a>
    </div>
</div>

<br><br><br><br>

<div class="slideshow-container">
    <div class="mySlides fade">
        <img src="img/runner.jpg" alt="Hình ảnh LV" width="600px" height="600">
    </div>
    <div class="mySlides fade">
        <img src="img/HDpurple.jpg" alt="Hình ảnh FOG" width=600px height="600" >
    </div>
    <div class="mySlides fade">
        <img src="img/graffiti%20white.jpg"alt="Hình ảnh" width=600px height="600">
    </div>
    <div class="mySlides fade">
        <img src="img/2ybasic.jpg" alt="Hình ảnh Nike" width=600px height="600">
    </div>
    <div class="mySlides fade">
        <img src="img/slide.png" alt="Slide" width=600px height="600">
    </div>
</div>
<div style="text-align: center">
    <span class="dot" onclick="currentSlide(1)"></span>
    <span class="dot" onclick="currentSlide(2)"></span>
    <span class="dot" onclick="currentSlide(3)"></span>
    <span class="dot" onclick="currentSlide(4)"></span>
    <span class="dot" onclick="currentSlide(5)"></span>
</div>

<div class="reduce">
    <h3>Giới Thiệu</h3>
    <p>Dirtycoins xuất hiện trên thị trường từ đầu năm 2017, Dirtycoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế. Dirtycoins thực chất là một cách lồng ghép khéo léo về sự ra đời của thương hiệu. Chữ Y trên đồng tiền tượng trưng cho tiền thân của Dirtycoins, The Yars Shop.
        Bắt nguồn từ Yars, Dirtycoins trân trọng giá trị của đồng tiền xương máu, thành quả lao động đầy mồ hôi, bụi bẩn và nước mắt. Với sức hút của mình, Dirty Coins trở thành biểu tượng cho phong cách thời trang mạnh mẽ, táo bạo, và được ưa chuộng rộng rãi. Dirtycoins mang đến một cái góc độ độc đáo không những về phong cách sống mà còn về gout ăn mặc hiện đại. Dirtycoins nhận thức được nhu cầu đang phát triển của thị trường Streetwear Việt Nam. Những mặt hàng thời trang tại Dirtycoins được thiết kế với sự kết hợp văn hoá Châu Á và Châu Âu, tạo ra phong cách độc đáo và mới mẻ. Bên cạnh đó ,với sự phá cách từ tông màu trắng đen, tông màu chủ đạo của đa số dòng thời trang Streetwear, các mẫu thời trang tại Dirtycoins mang nhiều màu sắc phong phú. Đây là cách Dirtycoins mang đến giá trị cho cộng đồng trẻ yêu thích Streetwear, khuyến khích họ mạo hiểm trong gu ăn mặc của mình. Với tính cách mạo hiểm, không ngại rủi ro, Dirtycoins dần mở rộng thị trường trong suốt quá trình phát triển các chi nhánh trên toàn quốc, đem tới một nền văn hoá rất riêng của Dirtycoins.</p>
</div>

<div class="end">
    <hr style="border: 2px solid black">
    <div>
        <a><i class="fa fa-phone-square" aria-hidden="true"></i>Hỗ Trợ/Mua Hàng: 0706166088</a>
    </div>
    <hr style="border: 2px solid black">
</div>

<div class="info">
    <div>
        <h4>Giới Thiệu</h4>
        <a>DirtyCoins xuất hiện trên thị trường từ đầu năm 2017, DirtyCoins mang sức mạnh của một thương hiệu local brand đầy cá tính với những sản phẩm thời trang hàng đầu xu thế. DirtyCoins thực chất là một cách lồng ghép khéo léo về sự ra đời của thương hiệu. Chữ Y trên đồng tiền tượng trưng cho tiền thân của DirtyCoins, The Yars Shop. Bắt nguồn từ Yars, DirtyCoins trân trọng giá trị của đồng tiền xương máu, thành quả lao động đầy mồ hôi, bụi bẩn và nước mắt. Với sức hút của mình, Dirty Coins trở thành biểu tượng cho phong cách thời trang mạnh mẽ, táo bạo, và được ưa chuộng rộng rãi. DirtyCoins mang đến một cái góc độ độc đáo không những về phong cách sống mà còn về gout ăn mặc hiện đại. DirtyCoins nhận thức được nhu cầu đang phát triển của thị trường Streetwear Việt Nam. Những mặt hàng thời trang tại DirtyCoins được thiết kế với sự kết hợp văn hoá Châu Á và Châu Âu, tạo ra phong cách độc đáo và mới mẻ. Bên cạnh đó ,với sự phá cách từ tông màu trắng đen, tông màu chủ đạo của đa số dòng thời trang Streetwear, các mẫu thời trang tại Dirtycoins mang nhiều màu sắc phong phú. Đây là cách DirtyCoins mang đến giá trị cho cộng đồng trẻ yêu thích Streetwear, khuyến khích họ mạo hiểm trong gu ăn mặc của mình. Với tính cách mạo hiểm, không ngại rủi ro, DirtyCoins dần mở rộng thị trường trong suốt quá trình phát triển các chi nhánh trên toàn quốc, đem tới một nền văn hoá rất riêng của DirtyCoins.</a>
        <h4>Mạng Xã Hội</h4>
        <div class="mxh">
            <a href="https://www.facebook.com"><i class="fa fa-facebook fa-2x" aria-hidden="true" style="color: white;background: #0b7dda;width: 35px;height: 30px;border-radius: 30%"></i></a>
            <a href="https://www.instagram.com"><i class="fa fa-instagram fa-2x" aria-hidden="true" style="color: white;background:  #ffad1a;width: 35px;height: 30px;border-radius: 30%"></i></a>
            <a href="https://www.youtube.com"><i class="fa fa-youtube-play fa-2x" aria-hidden="true" style="color: red;border-radius: 30%"></i></a>
        </div>

    </div>
</div>


<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 3000); // thay đổi ảnh trong 3s
}
</script>

</body>
</html>