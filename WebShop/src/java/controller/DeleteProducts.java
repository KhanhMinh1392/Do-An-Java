/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author HELLO
 */
import entity.SanPham;
import dao.SanPhamDao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
@WebServlet(urlPatterns = { "/DeleteProducts" })
public class DeleteProducts extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DeleteProducts() {
        super();
    }
 
    // Hiển thị trang tạo sản phẩm.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SanPhamDao spd = new SanPhamDao();
        SanPham sp = new SanPham();
        String MaSP = (String) request.getParameter("masp");
        sp.setMaSP(MaSP);
        spd.delete(sp);
        response.sendRedirect(request.getContextPath() + "/ListProducts");
        return;
    }
 
    // Khi người dùng nhập các thông tin sản phẩm, và nhấn Submit.
    // Phương thức này sẽ được gọi.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
 
}
