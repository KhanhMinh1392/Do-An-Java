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
@WebServlet(urlPatterns = { "/ProductDetail" })
public class ProductDetail extends HttpServlet {
    SanPhamDao spd;
    SanPham sp;
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
        response.setContentType("text/html;charset=UTF-8");
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
                String action = "Logout";
                // Nếu chưa đăng nhập (login).
                if (nv == null) {
                    action = "Login";
                }
                // Lưu thông tin vào request attribute trước khi forward (chuyển tiếp).
                String masp = request.getParameter("masp");
                spd = new SanPhamDao();
                sp = new SanPham();
                try{
                    sp = spd.get(masp).get();
                }catch(Exception e){
                    e.printStackTrace();
                }
                request.setAttribute("action", action);
                request.setAttribute("product", sp);
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/ProductDetail.jsp");
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
