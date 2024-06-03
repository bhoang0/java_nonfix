/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.XeSo;
import model.XeMay;

public class XeMayDAO implements DAOInterface<XeMay> {

    public static XeMayDAO getInstance() {
        return new XeMayDAO();
    }

    @Override
    public int insert(XeMay t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(XeMay t) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE XeMay SET TenXe = ?,soLuong=?,gia=?,tenDongCo=?,phanKhoi=?,xuatXu=?,doCaoYen=?,tieuThuNL=?,trangThai=? WHERE maXe=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenXe());
            pst.setInt(2, t.getSoLuong());
            pst.setDouble(3, t.getGia());
            pst.setString(4, t.gettenDongCo());
            pst.setString(5, t.getphanKhoi());
            pst.setString(6, t.getXuatXu());
            pst.setString(7, t.getdoCaoYen());
            pst.setString(8, t.gettieuThuNL());
            pst.setInt(9, t.getTrangThai());
            pst.setString(10, t.getMaXe());
            ketqua = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(XeMayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }

    @Override
    public int delete(XeMay t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE From XeMay WHERE MaXe=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaXe());
            ketQua = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<XeMay> selectAll() {
        ArrayList<XeMay> ketQua = new ArrayList<XeMay>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT MaXe,TenXe,soLuong,gia,tenDongCo,phanKhoi,xuatXu,doCaoYen, tieuThuNL,trangThai From XeMay";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maXe = rs.getString("MaXe");
                String TenXe = rs.getString("TenXe");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tenDongCo = rs.getString("tenDongCo");
                String phanKhoi = rs.getString("phanKhoi");
                String xuatXu = rs.getString("xuatXu");
                String doCaoYen = rs.getString("doCaoYen");
                String tieuThuNL = rs.getString("tieuThuNL");
                int trangThai = rs.getInt("trangThai");
                XeMay xm = new XeMay(maXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL, trangThai);
                ketQua.add(xm);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public XeMay selectById(String t) {
        XeMay ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT MaXe,TenXe,soLuong,gia,tenDongCo,phanKhoi,xuatXu,doCaoYen,tieuThuNL,trangThai From XeMay WHERE MaXe = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maXe = rs.getString("MaXe");
                String TenXe = rs.getString("TenXe");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tenDongCo = rs.getString("tenDongCo");
                String phanKhoi = rs.getString("phanKhoi");
                String xuatXu = rs.getString("xuatXu");
                String doCaoYen = rs.getString("doCaoYen");
                String tieuThuNL = rs.getString("tieuThuNL");
                int trangThai = rs.getInt("trangThai");
                ketQua = new XeMay(maXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL, trangThai);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public int updateSoLuong(String MaXe, int soluong) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE XeMay SET soLuong=? WHERE maXe=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, soluong);
            pst.setString(2, MaXe);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    public int deleteTrangThai(String MaXe){
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE XeMay SET trangThai=0 WHERE MaXe=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, MaXe);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<XeMay> selectAllE() {
        ArrayList<XeMay> ketQua = new ArrayList<XeMay>();
        ArrayList<XeMay> ketQuaTonKho = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT MaXe,TenXe,soLuong,gia,tenDongCo,phanKhoi,xuatXu,doCaoYen, tieuThuNL, trangThai From XeMay";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maXe = rs.getString("MaXe");
                String TenXe = rs.getString("TenXe");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tenDongCo = rs.getString("tenDongCo");
                String phanKhoi = rs.getString("phanKhoi");
                String xuatXu = rs.getString("xuatXu");
                String doCaoYen = rs.getString("doCaoYen");
                String tieuThuNL = rs.getString("tieuThuNL");
                int trangThai = rs.getInt("trangThai");
                XeMay xm = new XeMay(maXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL, trangThai);
                ketQua.add(xm);
            }
            for (XeMay XeMay : ketQua) {
                if (XeMay.getSoLuong() > 0) {
                    ketQuaTonKho.add(XeMay);
                }
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQuaTonKho;
    }
    
        public ArrayList<XeMay> selectAllExist() {
        ArrayList<XeMay> ketQua = new ArrayList<XeMay>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maXe,TenXe,soLuong,gia,tenDongCo,phanKhoi,xuatXu,doCaoYen,tieuThuNL,trangThai From XeMay WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maXe = rs.getString("maXe");
                String TenXe = rs.getString("TenXe");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tenDongCo = rs.getString("tenDongCo");
                String phanKhoi = rs.getString("phanKhoi");
                String xuatXu = rs.getString("xuatXu");
                String doCaoYen = rs.getString("doCaoYen");
                String tieuThuNL = rs.getString("tieuThuNL");
                int trangThai = rs.getInt("trangThai");
                XeMay xm = new XeMay(maXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL, trangThai);
                ketQua.add(xm);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
        
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * From XeMay WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                soluong++;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return soluong;
    }
}
