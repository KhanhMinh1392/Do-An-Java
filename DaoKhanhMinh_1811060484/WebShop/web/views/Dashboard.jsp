<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>DonHang-LEO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="css/Admin.css">
</head>
<body>
<div class="sidenav">
    <img class="img" src="img/logo2.png" style="z-index: 1">
    <div class="catory">
        <a href="Admin.jsp"><i class="fa fa-address-card fa-2x" aria-hidden="true" style="color: black"></i> Thông Tin Admin</a>
        <a href="Dashboard.jsp"><i class="fa fa-home fa-2x" aria-hidden="true" style="color: black"></i> Tổng Quan</a>
        <a href="DonHang.html"><i class="fa fa-cart-arrow-down fa-2x" aria-hidden="true" style="color: black"></i> Đơn Hàng</a>
        <a href="${pageContext.request.contextPath}/ListProducts"><i class="fa fa-archive fa-2x" aria-hidden="true" style="color: black"></i> Danh Sách Sản Phẩm</a>
        <a href="#Report"><i class="fa fa-bar-chart fa-2x" aria-hidden="true" style="color: black"></i> Doanh Thu</a>
    </div>
    <div>
        <a href="Login.jsp"><i class="fa fa-sign-out fa-2x" aria-hidden="true" style="color: black"></i> Đăng Xuất</a>
    </div>
</div>


<div class="main-content">
    <header>
       <div class="search-wrapper">
            <span><i class="fa fa-search" aria-hidden="true"></i></span>
            <input type="search" placeholder="Search Here">
       </div>
        <div class="user-admin">
            <img src="img/Minh.jpg" width="40px" height="40px" alt="">
            <div>
                <h4>Khánh Minh</h4>
                <small>Admin</small>
            </div>
        </div>
    </header>

    <main>
        <div class="cards">
            <div class="cards-single">
                <div>
                    <h1>120</h1>
                    <span>Tổng đơn hàng</span>
                </div>
                <div>
                    <span><i class="fa fa-archive" aria-hidden="true" style="color: darkblue"></i></span>
                </div>
            </div>
            <div class="cards-single">
                <div>
                    <h1>20</h1>
                    <span>Đơn hàng mới</span>
                </div>
                <div>
                    <span><i class="fa fa-plus" aria-hidden="true" style="color: green"></i></span>
                </div>
            </div>
            <div class="cards-single">
                <div>
                    <h1>2</h1>
                    <span>Đơn hàng trả</span>
                </div>
                <div>
                    <span><i class="fa fa-reply" aria-hidden="true" style="color: black"></i></span>
                </div>
            </div>
            <div class="cards-single">
                <div>
                    <h1>0</h1>
                    <span>Đơn hàng hủy</span>
                </div>
                <div>
                    <span><i class="fa fa-ban" aria-hidden="true" style="color: red"></i></span>
                </div>
            </div>
        </div>
        <div class="total">
            <button class="tablink" onclick="openPage('revenue', this, 'green')">Doanh thu bán hàng</button>
            <button class="tablink" onclick="openPage('density', this, 'green')" id="defaultOpen">Tỷ trọng bán hàng</button>
            <div class="filter">
                <button type="button">Chi Nhánh</button>
                <button type="button">Hôm Nay</button>
            </div>

            <div id="revenue" class="tabcontent">
                <img src="img/chart.png" style="height: 350px";width="350px">
            </div>

            <div id="density" class="tabcontent">
                <img src="img/notdothis.jpg"style="height: 350px";width="350px">
            </div>
            <script>
                function openPage(pageName,elmnt,color) {
                 var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("tabcontent");
                 for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].style.backgroundColor = "";
    }
    document.getElementById(pageName).style.display = "block";
    elmnt.style.backgroundColor = color;
    }
    document.getElementById("defaultOpen").click();
            </script>
        </div>

        <div class="">


        </div>
    </main>
</div>


</body>
</html>