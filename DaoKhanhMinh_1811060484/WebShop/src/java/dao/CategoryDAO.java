/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import entity.Category;
import entity.SanPham;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CategoryDAO  {
    private static final String TABLE_NAME = "dbo.TheLoai";
    ConnectionDB connectiondb = ConnectionDB.getInstance();
    public List<Category> getAll() {
       Connection conn;
        List<Category> list = new ArrayList<Category>();
        try {
            conn = ConnectionDB.getInstance().getConnection();
            Statement stmt = conn.createStatement();
            String sql_select = "select * from "+TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql_select);
            while(rs.next()){
                Category category = new Category();
                category.setCategoryID(rs.getString("MaLoai"));
                category.setCategoryName(rs.getString("TenLoai"));
                
                list.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
 }
     public static void main(String[] args) throws SQLException {
                    CategoryDAO catelogydao = new CategoryDAO();
        Category category = new Category();
        List<Category> listCategory = catelogydao.getAll();
        for(Category cate : listCategory){
            System.out.println(cate.getCategoryID()+ " - " +cate.getCategoryName());
        }
 }

    
}
