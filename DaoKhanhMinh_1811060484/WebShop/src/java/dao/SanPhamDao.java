/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.ConnectionDB;
import entity.SanPham;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 *
 */
public class SanPhamDao implements Dao<SanPham>{
    private static final String TABLE_NAME = "dbo.SanPham";
    ConnectionDB connectiondb = ConnectionDB.getInstance();
    
    @Override
    public List<SanPham> getAll() {
        Connection conn = null;
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            conn = ConnectionDB.getInstance().getConnection();
            Statement stmt = conn.createStatement();
            String sql_select = "select * from "+TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql_select);
            while(rs.next()){
                SanPham pro = new SanPham();
                pro.setMaSP(rs.getString("MaSP"));
                pro.setTenSP(rs.getString("TenSP"));
                pro.setMaLoai(rs.getString("MaLoai"));
                pro.setAnh(rs.getString("Anh"));
                pro.setNhanHieu(rs.getString("NhanHieu"));
                pro.setGiaSP(rs.getFloat("GiaSP"));
                list.add(pro);
            }
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
//    public static void main(String[] args) {
//        SanPhamDao spd = new SanPhamDao();
//        SanPham pro = new SanPham();
//        List<SanPham> listPro = spd.getAll();
//        for(SanPham products : listPro){
//            System.out.println(products.getTenSP());
//        }
//    }

    public boolean checkProducts(String MaSP) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_select = "select * from dbo.SanPham where MaSP = ?";            
            psmt = conn.prepareStatement(sql_select);    
            psmt.setString(1, MaSP);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Optional<SanPham> get(String MaSP) {
        Connection conn = null;
        SanPham sp = new SanPham();
        PreparedStatement psmt = null;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_select = "select * from dbo.SanPham where MaSP = ?";            
            psmt = conn.prepareStatement(sql_select);    
            psmt.setString(1, MaSP);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                sp.setMaSP(MaSP);
                sp.setTenSP(rs.getString("TenSP"));
                sp.setMaLoai(rs.getString("MaLoai"));
                sp.setAnh(rs.getString("Anh"));
                sp.setNhanHieu(rs.getString("NhanHieu"));
                sp.setGiaSP(rs.getFloat("GiaSP"));
//                conn.close();
                return Optional.of(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(SanPham sp) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_select = "update dbo.SanPham set MaLoai = ?, TenSP = ?, NhanHieu = ?, GiaSP = ?, Anh = ? where MaSP = ?";            
            psmt = conn.prepareStatement(sql_select);    
            psmt.setString(1, sp.getMaLoai());
            psmt.setString(2, sp.getTenSP());
            psmt.setString(3, sp.getNhanHieu());
            psmt.setFloat(4, sp.getGiaSP());
            psmt.setString(5, sp.getAnh());
            psmt.setString(6, sp.getMaSP());
            if (psmt.executeUpdate() > 0) {
//                conn.close();
                return true;
            }else{
//                conn.close();
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    
    }

    public int getTotalPage() {
    Connection conn = null;
    PreparedStatement stmt;
    String sql_select = "SELECT count(MaSP) FROM dbo.SanPham";
    int count = 0;
    try {
        conn = ConnectionDB.getInstance().getConnection();
        stmt = conn.prepareStatement(sql_select);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            count = rs.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return count;
    }
    
    public List<SanPham> getProduct(int min, int max) {
    Connection conn = null;
    PreparedStatement psmt = null;
    SanPham pro;
    List<SanPham> list = new ArrayList<SanPham>();
    String sql_select = "SELECT * FROM(SELECT ROW_NUMBER() OVER (ORDER BY MaSP) AS ROWNUM, * FROM dbo.SanPham) AS U WHERE ROWNUM BETWEEN ? AND ? ORDER BY ROWNUM";
    try {
        conn = ConnectionDB.getInstance().getConnection();
        psmt = conn.prepareStatement(sql_select);
        psmt.setInt(1, min);
        psmt.setInt(2, max);
        ResultSet rs = psmt.executeQuery();
        while (rs.next()) {
            pro = new SanPham();
            pro.setMaSP(rs.getString("MaSP"));
            pro.setTenSP(rs.getString("TenSP"));
            pro.setMaLoai(rs.getString("MaLoai"));
            pro.setAnh(rs.getString("Anh"));
            pro.setNhanHieu(rs.getString("NhanHieu"));
            pro.setGiaSP(rs.getFloat("GiaSP"));
            list.add(pro);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
    }
    
    @Override
    public boolean delete(SanPham t) {
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_select = "delete from "+TABLE_NAME+ " where MaSP = ?";            
            psmt = conn.prepareStatement(sql_select);    
            psmt.setString(1, t.getMaSP());
            if (psmt.executeUpdate() > 0) {
                return true;
            }else return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean insert(SanPham t) {
         Connection conn = null;
        PreparedStatement psmt = null;  
        boolean retVal = false;
        try {
            conn = ConnectionDB.getInstance().getConnection();
            String sql_insert = "insert into dbo.SanPham values(?, ?, ?, ?, ?, ?)";
            psmt = conn.prepareStatement(sql_insert);
            psmt.setString(1, t.getMaSP());
            psmt.setString(2, t.getMaLoai());
            psmt.setString(3, t.getTenSP());
            psmt.setString(4, t.getNhanHieu());
            psmt.setFloat(5, t.getGiaSP());
            psmt.setString(6, t.getAnh());
            int r = psmt.executeUpdate();
            System.out.println(r);
            retVal = true;            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }
    public static void main(String[] args) {
        SanPhamDao spd = new SanPhamDao();
//        SanPham sp = new SanPham();
//        sp.setMaSP("SP50");
//        sp.setMaLoai("TL01");
//        sp.setNhanHieu("TEST");
//        sp.setTenSP("SP updated");
//        sp.setGiaSP(999990);
//        sp.setAnh("/views/img/1tshirt.jpg");
//        List<SanPham> list = new ArrayList<SanPham>();
//        list = spd.getProduct(1, 4);
int count = spd.getTotalPage();
        System.out.println(count);
//        System.out.println(list);
//        System.out.println(spd.checkProducts("SP55"));
//System.out.println(spd.update(sp));
//System.out.println(spd.delete(sp));
//        System.out.println(spd.get("SP55").get().getTenSP());
//        System.out.println(spd.insert(sp));
//System.out.println("ok");
    }
}