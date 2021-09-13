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
 
 
@WebServlet(urlPatterns = { "/UpdateProducts" })
public class UpdateProducts extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public UpdateProducts() {
        super();
    }
 
    // Hiển thị trang tạo sản phẩm.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("action", "UpdateProducts");
        request.setAttribute("title", "Sửa sản phẩm");
        request.setAttribute("readonly", "readonly");
        
        SanPhamDao spd = new SanPhamDao();
        SanPham sp = new SanPham();
        String MaSP = (String) request.getParameter("masp");
        sp = spd.get(MaSP).get();
        if(sp==null){
            String errorString = "Sua san pham loi";
        }
        request.setAttribute("products", sp);
        
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Add.jsp");
        dispatcher.forward(request, response);
    }
 
    // Khi người dùng nhập các thông tin sản phẩm, và nhấn Submit.
    // Phương thức này sẽ được gọi.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SanPhamDao spd;
        String MaSP = (String) request.getParameter("masp");
        String MaLoai = (String) request.getParameter("maloai");
        String TenSP = (String) request.getParameter("tensp");
        String NhanHieu = (String) request.getParameter("nhanhieu");
        String Gia = (String) request.getParameter("giasp");
        String Anh = (String) request.getParameter("anh");
        float GiaSP = 0;
        try{
            GiaSP = Float.parseFloat(Gia);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        SanPham sp = new SanPham();
        sp.setMaSP(MaSP);
        sp.setMaLoai(MaLoai);
        sp.setNhanHieu(NhanHieu);
        sp.setTenSP(TenSP);
        sp.setGiaSP(GiaSP);
        sp.setAnh(Anh);
 
        String errorString = null;
 
 
        if (errorString == null) {
            try {
                spd = new SanPhamDao();
                if(spd.update(sp)==false){
                    errorString = "Sua san pham loi";
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
 
        // Lưu thông tin vào request attribute trước khi forward sang views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("products", sp);
        request.setAttribute("action", "UpdateProducts");
        request.setAttribute("title", "Sửa sản phẩm");
        request.setAttribute("readonly", "readonly");
 
        // Nếu có lỗi forward (chuyển tiếp) sang trang 'edit'.
        if (errorString != null) {
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Add.jsp");
            dispatcher.forward(request, response);
            return;
        }
        // Nếu mọi thứ tốt đẹp.
        // Redirect (chuyển hướng) sang trang danh sách sản phẩm.
        else {
            response.sendRedirect(request.getContextPath() + "/ListProducts");
            return;
        }
    }
 
}
