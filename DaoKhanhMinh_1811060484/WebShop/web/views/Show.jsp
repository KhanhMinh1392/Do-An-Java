<%-- 
    Document   : Show
    Created on : May 25, 2021, 9:52:49 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"> <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<html>
    <head>
        <title>Manager</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container"> 
 <div class="row"> 
  <h1 class="text-center">Quản Lý Sản Phẩm</h1> 
  <div class="col-md-10 col-md-offset-1"> 
   <div class="panel panel-default panel-table"> 
    <div class="panel-heading"> 
     <div class="row"> 
      <div class="col col-xs-6"> 
       <h3 class="panel-title">Danh sách sản phẩm</h3> 
      </div> 
      <div class="col col-xs-6 text-right"> 
        <!-- <button type="add.jsp" class="btn btn-sm btn-primary btn-create">Thêm mới</button> -->
       <a href="add.jsp" >Thêm sản phẩm</a> 
      </div> 
     </div> 
    </div> 
    <div class="panel-body"> 
     <table class="table table-striped table-bordered table-list"> 
      <thead> 
       <tr> 
        <th><em class="fa fa-cog"></em>
        </th> 
        <th class="hidden-xs">Mã sản phẩm</th> 
        <th>Tên sản phẩm</th> 
        <th>Nhãn Hiệu</th> 
        <th>Giá sản phẩm</th> 
        <th>Ảnh</th> 
       </tr> 
      </thead> 
      <tbody><tr> 
       <td align="center"><a class="btn btn-default"><em class="fa fa-pencil"></em></a> <a class="btn btn-danger"><em class="fa fa-trash"></em></a>
       </td> 
       <td class="hidden-xs">SP01</td> 
       <td>16Typh Tee</td> 
       <td>DirtyCoin</td> 
       <td>100000</td> 
      </tr> 
      <tr> 
       <td align="center"><a class="btn btn-default"><em class="fa fa-pencil"></em></a> <a class="btn btn-danger"><em class="fa fa-trash"></em></a>
       </td> 
       <td class="hidden-xs">SP02</td> 
       <td>Basic Tee</td> 
       <td>DirtyCoin</td> 
       <td>100000</td> 
      </tr> 
      <tr> 
       <td align="center"><a class="btn btn-default"><em class="fa fa-pencil"></em></a> <a class="btn btn-danger"><em class="fa fa-trash"></em></a>
       </td> 
       <td class="hidden-xs">SP03</td> 
       <td>Black Tee</td> 
       <td>DirtyCoin</td> 
       <td>100000</td> 
      </tr> 
      <tr> 
       <td align="center"><a class="btn btn-default"><em class="fa fa-pencil"></em></a> <a class="btn btn-danger"><em class="fa fa-trash"></em></a>
       </td> 
       <td class="hidden-xs">SP04</td> 
       <td>White Tee</td> 
       <td>DirtyCoin</td> 
       <td>100000</td> 
      </tr> 
     </tbody></table> 
    </div> 
    <div class="panel-footer"> 
     <div class="row"> 
       <!-- <div class="col col-xs-4">Trang 1 của 5 </div> 
      <div class="col col-xs-8"> 
        <ul class="pagination hidden-xs pull-right"> 
        <li><a href="">1</a>
        </li> 
        <li><a href="">2</a>
        </li> 
        <li><a href="">3</a>
        </li> 
        <li><a href="">4</a>
        </li> 
        <li><a href="">5</a>
        </li> 
       </ul> 
       <ul class="pagination visible-xs pull-right"> 
        <li><a href="">«</a>
        </li> 
        <li><a href="">»</a>
        </li> 
       </ul> 
      </div> 
     </div> -->
    </div> 
   </div> 
  </div> 
 </div>
</div>
    </body>
</html>

