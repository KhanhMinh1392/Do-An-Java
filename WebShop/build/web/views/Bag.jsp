<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vn">
<head>
    <meta charset="UTF-8">
    <title>Giỏ Hàng - LEO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="Bag.css">
</head>
<body>
<div class="sidenav">
    <a href="${pageContext.request.contextPath}/views/Home.jsp">
        <img class="img" src="img/logo2.png">
    </a>
    <div class="head">
        <a href="${pageContext.request.contextPath}/Products" >SHOP</a>
       
        <a href="#" >NEWS</a>
        <a href="${pageContext.request.contextPath}/views/Help.jsp" >CONTACT</a>
        <a href="#" >ABOUT</a>
    </div>
    <div class="icon">
        <a href=""><i class="fa fa-search fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href="${pageContext.request.contextPath}/views/Login.jsp"><i class="fa fa-user fa-2x" aria-hidden="true" style="color: black"></i></a>
        <a href=""><i class="fa fa-shopping-basket fa-2x" aria-hidden="true" style="color: black"></i></a>
    </div>
</div>
<div class="main">
    <div>
        <h1 class="h1">Thông Tin Đơn Hàng</h1>
    </div>
</div>
<div class="row">
    <div class="col-75">
        <div class="container">
            <form action="/action_page.php">

                <div class="row">
                    <div class="col-50">
                        <h3>Thông Tin Đặt Hàng</h3>
                        <label for="fname"><i class="fa fa-user"></i> Họ Tên</label>
                        <input type="text" id="fname" name="firstname" placeholder="Họ và Tên">
                        <label for="email"><i class="fa fa-envelope"></i> Email</label>
                        <input type="text" id="email" name="email" placeholder="@gmail.com">
                        <label for="adr"><i class="fa fa-address-card-o"></i> Địa Chỉ</label>
                        <input type="text" id="adr" name="address" placeholder="Địa Chỉ">
                        <label for="city"><i class="fa fa-institution"></i> Thành Phố</label>
                        <input type="text" id="city" name="city" placeholder="Thành Phố Hồ Chí Minh">
                        <label for="city"><i class="fa fa-phone"></i> SĐT</label>
                        <input type="text" id="phone" name="phone" placeholder="Số Điện Thoại">
                    </div>

                    <div class="col-50">
                        <h3>Vận Chuyển</h3>
                        <div class="deliver">
                            <a>Vui lòng nhập thông tin giao hàng</a>
                        </div>
                        <h3>Thanh Toán</h3>
                        <div class="table">
                            <br>
                            <a style="margin-left: 10px"><i class="fa fa-dot-circle-o" aria-hidden="true"></i>Thanh toán khi giao hàng (COD)<i class="fa fa-money" aria-hidden="true" style="color: #0b7dda;float: right"></i></a>
                            <label>Bạn chỉ thanh toán khi nhận được hàng</label>
                        </div>
                        <br><br><br>
                        <label for="city"><i class="fa fa-sticky-note-o" aria-hidden="true"></i> Ghi Chú</label>
                        <input type="text" id="note" name="phone" placeholder="Ghi Chú Đơn Hàng">
                    </div>

                </div>
                <label>
                    <input type="checkbox" checked="checked" name="sameadr"> Đồng ý địa chỉ trên là đúng
                </label>
                <input type="submit" value="Đặt Hàng" class="btn">
            </form>
        </div>
    </div>
    <div class="col-25">
        <div class="container">
            <h4>Sản Phẩm <span class="price" style="color:black"><i class="fa fa-shopping-cart"></i> <b>4</b></span></h4>
            <p><a href="#"><img src="img/jaket.jpg" style="width: 60px" height="60px"></a> <span class="price">790.000</span></p>
            <p><a href="#"><img src="img/tshirt2.jpg" style="width: 60px" height="60px"></a></a> <span class="price">420.000</span></p>
            <p><a href="#"><img src="img/backpack1.png" style="width: 60px" height="60px"></a></a> <span class="price">800.000</span></p>
            <p><a href="#"><img src="img/Short1.png" style="width: 60px" height="60px"></a></a> <span class="price">350.000</span></p>
            <hr>
            <p>Total <span class="price" style="color:black"><b>2.360.000</b></span></p>
        </div>
    </div>
</div>


<script>
    function tinh_tong(a, b)
    {
        return a + b;
    }
    // Lấy thông tin từ người dùng
    // Tính tổng
    var tong = tinh_tong(a, b);

    // In ra màn hình
    document.write("Tổng hai số " + a + " + " + b + " là " + tong);
</script>
</body>
</html>