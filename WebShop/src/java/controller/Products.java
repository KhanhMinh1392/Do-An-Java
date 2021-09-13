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
import java.util.ArrayList;
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
@WebServlet(urlPatterns = { "/Products" })
public class Products extends HttpServlet {
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
                spd = new SanPhamDao();
                sp = new SanPham();
                
                int page = 1;
                int total = 0, totalpage = 0;
                int max = 6;//thay doi so luong san pham moi trang
                float pagef;
                
                if (request.getParameter("page") != null) {
                    page = (int) Integer.parseInt(request.getParameter("page"));//lay so trang (page) tu client, mac dinh la 1
                    if(page <= 0){
                        page = 1;
                    }
                }
                
                try{
                    totalpage = spd.getTotalPage();
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
                //tinh tong so trang
                pagef = (float) totalpage/max;
                int pageint = (int) totalpage/max;
                if(pagef == pageint){
                    total = totalpage/max;
                }else if(pagef > pageint){
                    total = (totalpage/max) + 1;
                }
                
                if(page>total){
                    page = total;
                }
                //lay san pham ra
                int first = ((page-1)*max)+1;
                int last = max*page;
                
                List<SanPham> listsp = new ArrayList<SanPham>();
                try{
                    listsp = spd.getProduct(first, last);
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                request.setAttribute("action", action);
                request.setAttribute("products", listsp);
                request.setAttribute("totalpage", total);
                request.setAttribute("pagecurrent", page);
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/views/Products.jsp");
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
