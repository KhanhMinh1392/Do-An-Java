<%@page import="java.util.List"%>
<%@page import="entity.SanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page buffer="8192kb" autoFlush="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Sản Phẩm</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/icon_font/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/css/Admin.css">
    
</head>
<body>
<div class="sidenav">
    <img class="img" src="${pageContext.request.contextPath}/views/img/logo2.png" style="z-index: 1">
    <div class="catory">
        <a href="${pageContext.request.contextPath}/Admin"><i class="fa fa-address-card fa-2x" aria-hidden="true" style="color: black"></i> Thông Tin Admin</a>
        <a href="${pageContext.request.contextPath}/views/Dashboard.jsp"><i class="fa fa-home fa-2x" aria-hidden="true" style="color: black"></i> Tổng Quan</a>
        <a href="DonHang.html"><i class="fa fa-cart-arrow-down fa-2x" aria-hidden="true" style="color: black"></i> Đơn Hàng</a>
        <a href="${pageContext.request.contextPath}/ListProducts"><i class="fa fa-archive fa-2x" aria-hidden="true" style="color: black"></i> Danh Sách Sản Phẩm</a>
        <a href="#Report"><i class="fa fa-bar-chart fa-2x" aria-hidden="true" style="color: black"></i> Doanh Thu</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/Logout"><i class="fa fa-sign-out fa-2x" aria-hidden="true" style="color: black"></i> Đăng Xuất</a>
    </div>
</div>
<div>
    <h4 class="h4">Danh Sách Sản Phẩm</h4>
    
    <form class="search">
        <input type="text" name="search" placeholder="Search..">
    </form>
    <h4 class="h4"><a href="${pageContext.request.contextPath}/AddProducts" class="">Thêm</a></h4>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th>Mã sản phẩm</th>
                    <th>Tên sản phẩm</th>
                    <th>Mã loại</th>
                    <th>Nhãn hiệu</th>
                    <th>Giá sản phẩm(VNĐ)</th>
                    <th>Hành động</th>
                </tr>
            </thead>
            <tbody>
                <%
                   List<SanPham> list = (List) request.getAttribute("products");
               %>
               <%
                   for(SanPham sp : list){
               %>
                <tr style="text-align: center;">
                    <td><% out.print(sp.getMaSP()); %></td>
                    <td><% out.print(sp.getTenSP()); %></td>
                    <td><% out.print(sp.getMaLoai()); %></td>
                    <td><% out.print(sp.getNhanHieu()); %></td>
                    <td><% out.print(String.format("%.0f", sp.getGiaSP())); %></td>
                    <td>
                        <a href="${pageContext.request.contextPath}/UpdateProducts?masp=<% out.print(sp.getMaSP());%>" class="">Sửa</a>
                        <a href="${pageContext.request.contextPath}/DeleteProducts?masp=<% out.print(sp.getMaSP());%>" class="">Xoá</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>


<div class="move">
    <div class="w3-bar">
        <a href="#" class="w3-button w3-hover-purple">«</a>
        <a href="#" class="w3-button w3-hover-green">1</a>
        <a href="#" class="w3-button w3-hover-red">2</a>
        <a href="#" class="w3-button w3-hover-blue">3</a>
        <a href="#" class="w3-button w3-hover-black">4</a>
        <a href="#" class="w3-button w3-hover-orange">»</a>
    </div>
</div>
</body>
</html>