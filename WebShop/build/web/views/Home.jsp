<%@page import="entity.Category"%>
<%@page import="dao.CategoryDAO"%>
<%
 CategoryDAO categoryDAO = new CategoryDAO();
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>LEO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/home.css">
    <!--  <script src="views/showSlides.js"></script>
    <script src="views/script.js"></script>
    <script type="text/javascript" src="javascript/JQuery3.3.1.js"></script>
    <script type="text/javascript" src="javascript/lightslider.js"></script>   -->

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
        <a href="${pageContext.request.contextPath}/views/Login.jsp"><i class="fa fa-user fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="${pageContext.request.contextPath}/views/Bag.jsp"><i class="fa fa-shopping-basket fa-2x" aria-hidden="true" style="color: black"></i></a>
    </div>

</div>

<div class="main">
    <div class="slideshow-container">
        <div class="mySlides fade">
            <img src="${pageContext.request.contextPath}/views/img/LouisVuitton.jpg" alt="Hình ảnh LV" width="1580px" height="600">
        </div>
        <div class="mySlides fade">
            <img src="${pageContext.request.contextPath}/views/img/FOG.png" alt="Hình ảnh FOG" width=1580px height="600" >
        </div>
        <div class="mySlides fade">
            <img src="${pageContext.request.contextPath}/views/img/17182757.jpg"alt="Hình ảnh" width=1580px height="600">
        </div>
        <div class="mySlides fade">
            <img src="${pageContext.request.contextPath}/views/img/Nike.png" alt="Hình ảnh Nike" width=1580px height="600">
        </div>
        <div class="mySlides fade">
            <img src="${pageContext.request.contextPath}/views/img/slide.png" alt="Slide" width=1580px height="600">
        </div>

        <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
        <a class="next" onclick="plusSlides(1)">&#10095;</a>
    </div>
    <div style="text-align: center">
        <span class="dot" onclick="currentSlide(1)"></span>
        <span class="dot" onclick="currentSlide(2)"></span>
        <span class="dot" onclick="currentSlide(3)"></span>
        <span class="dot" onclick="currentSlide(4)"></span>
        <span class="dot" onclick="currentSlide(5)"></span>
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
            setTimeout(showSlides, 3000); // thay Äá»i áº£nh trong 3s
        }
    </script>
    <div class="imgg">
        <img src="${pageContext.request.contextPath}/views/img/model.png"width= auto height="600">
        <img src="${pageContext.request.contextPath}/views/img/16.png" width=auto height="600">
        <img src="${pageContext.request.contextPath}/views/img/bag.jpg" width=auto height="600">
    </div>
    <a class="bsl" href="#">
        <p >BEST SELLER</p>
    </a>
    <hr style="border: 2px solid black" width="900px">
    <br>
        <div class="card">
            <a href="Backpack2.html">
                <img src="${pageContext.request.contextPath}/views/img/balo1.png" alt="Beige-Backpack" style="width:100%" height= "360px">
                <h1 class="h1">Backpack Beige</h1>
                <p class="price">800.000Đ</p>
            </a>
        </div>
        <div class="card2">
            <a href="Backpack1.html">
                <img src="${pageContext.request.contextPath}/views/img/balo2.png" alt="Tan-Backpack" style="width:100%">
                <h1 class="h1">Backpack Tan Limit</h1>
                <p class="price">800.000Đ</p>
            </a>
        </div>
        <div class="card3">
            <a href="16eyes.html">
                <img src="${pageContext.request.contextPath}/views/img/eyes.png" alt="EyeT-Shirt" style="width:100%">
                <h1 class="h1">Eyes T-Shirt</h1>
                <p class="price">450.000Đ</p>
            </a>
        </div>
    <br>
    <div>
        <a href="${pageContext.request.contextPath}/Products">
            <button class="button">Xem Tất Cả</button>
        </a>
    </div>

    <br> <br>
    <hr style="border: 2px solid black" width="900px">

    <div class="imgg2">
        <img src="${pageContext.request.contextPath}/views/img/model.png" width=auto height="600">
        <img src="${pageContext.request.contextPath}/views/img/model2.png" width=auto height="600">
    </div>

    <a class="bsl" href="#">
        <p>New Arrival</p>
    </a>

    <hr style="border: 2px solid black" width="900px">

    <div class="card">
        <a href="Jacket.html">
            <img src="${pageContext.request.contextPath}/views/img/jaket.jpg" alt="jacket" style="width:100%" height="260px">
            <h1 class="h1">16Typh Jacket</h1>
            <p class="price">850.000Đ</p>
        </a>
    </div>
    <div class="card2">
        <a href="16TyphRapper.html">
            <img src="${pageContext.request.contextPath}/views/img/tshirt.jpg" alt="16TyphRapper" style="width:100%">
            <h1 class="h1">16Typh Rapper</h1>
            <p class="price">420.000Đ</p>
        </a>
    </div>
    <div class="card3">
        <a href="16eyes.html">
            <img src="${pageContext.request.contextPath}/views/img/tshirt2.jpg" alt="EyeT-Shirt" style="width:100%">
            <h1 class="h1">16Typh Eyes T-Shirt</h1>
            <p class="price">420.000Đ</p>
        </a>
    </div>
    <div class="part2">
        <div class="card">
            <a href="T%20V4.html">
                <img src="${pageContext.request.contextPath}/views/img/1tshirt.jpg" alt="jacket" style="width:100%">
                <h1 class="h1">Basic Tee V4</h1>
                <p class="price">390.000Đ</p>
            </a>
        </div>
        <div class="card2">
            <a href="Tv3.html">
                <img src="${pageContext.request.contextPath}/views/img/2tshirt.jpg" alt="Tan-Backpack" style="width:100%">
                <h1 class="h1">Basic Tee V3</h1>
                <p class="price">390.000Đ</p>
            </a>
        </div>
        <div class="card3">
            <a href="Uni.html">
                <img src="${pageContext.request.contextPath}/views/img/3tshirt.jpg" alt="EyeT-Shirt" style="width:100%">
                <h1 class="h1">Basic Uni Tee </h1>
                <p class="price">390.000Đ</p>
            </a>
        </div>
    </div>
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



</body>
</html>