<%-- 
    Document   : add
    Created on : May 26, 2021, 9:32:47 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/views/style.css" rel="stylesheet" type="text/css">
        <title>Add Product</title>
    </head>
    <body>
        <body>
        <h1>${title}</h1>
        <h5>${errorString}</h5>
        <form action="${pageContext.request.contextPath}/${action}" method="POST">
            <label>Mã sản phẩm </label>
            <input type="text" name="masp" value="${products.getMaSP()}" ${readonly}/>
            <br><br>
            <label>Mã loại </label>
            <input type="text" name="maloai" value="${products.getMaLoai()}"/>
            <br><br>
            <label>Tên sản phẩm </label>
            <input type="text"name="tensp" value="${products.getTenSP()}"/>
            <br><br>
            <label>Nhãn Hiệu </label>
            <input type="text" name="nhanhieu" value="${products.getNhanHieu()}"/>
            <br><br>
            <label>Giá sản phẩm </label>
            <input type="number" name="giasp" value="${products.getGiaSP()}"/>
            <br><br>
            <label>Ảnh </label>
            <input type="text" name="anh" value="${products.getAnh()}"/>
            <br><br>
            <button type="submit">Xác nhận</button>
            <a href="${pageContext.request.contextPath}/ListProducts">Cancel</a>
        </form>
    </body>
    </body>
</html>
