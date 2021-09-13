/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import model.ConnectionDB;
import dao.NhanVienDao;
import dao.SanPhamDao;
import entity.NhanVien;
import entity.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HELLO
 */
@WebServlet(urlPatterns = { "/ListProducts" })
public class ListProducts extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        NhanVien nv = new NhanVien();
        nv = (NhanVien) session.getAttribute("account");;
 
        // Nếu chưa đăng nhập (login).
        if (nv == null) {
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Login.jsp");

            dispatcher.forward(request, response);
            return;
        }
        // Lưu thông tin vào request attribute trước khi forward (chuyển tiếp).
        request.setAttribute("account", nv);
        if(nv.getQuyen()==1){
            response.sendRedirect(request.getContextPath() + "/Products");
            return;
        }else if(nv.getQuyen()==0){
            SanPhamDao spd = new SanPhamDao();
            SanPham sp = new SanPham();
            String errorString = null;
            List<SanPham> listsp = null;
            try {
                listsp = spd.getAll();
            } catch (Exception e) {
                e.printStackTrace();
                errorString = e.getMessage();
        }
            // Lưu thông tin vào request attribute trước khi forward sang views.
            request.setAttribute("errorString", errorString);
            request.setAttribute("products", listsp);
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/ListProducts.jsp");
            dispatcher.forward(request, response);
            return;
        }
 
        // Nếu người dùng đã login thì forward (chuyển tiếp) tới trang
        // /WEB-INF/views/userInfoView.jsp
        
//        processRequest(request, response);
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Login.jsp");
 
        dispatcher.forward(request, response);
        return;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    public static void main(String[] args) {
//        SanPhamDao spd = new SanPhamDao();
//            SanPham sp = new SanPham();
//            String errorString = null;
//            List<SanPham> listsp = null;
//            try {
//                listsp = spd.getAll();
//            } catch (Exception e) {
//                e.printStackTrace();
//                errorString = e.getMessage();
//                
//                
//            }
//            System.out.println("");
//            if(listsp == null){
//                System.out.println("null");
//            }else{
//                System.out.println(listsp);
//            }
//    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
