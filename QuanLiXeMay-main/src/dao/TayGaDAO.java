/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.XeSo;
import model.TayGa;

/**
 *
 * @author
 */
public class TayGaDAO implements DAOInterface<TayGa> {

    public static TayGaDAO getInstance() {
        return new TayGaDAO();
    }

    @Override
    public int insert(TayGa t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO XeMay (MaXe, TenXe, soLuong, tenDongCo, phanKhoi, doCaoYen, gia, congSuat, khoiLuong, xuatXu, loaixe, tieuThuNL, trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaXe());
            pst.setString(2, t.getTenXe());
            pst.setInt(3, t.getSoLuong());
            pst.setString(4, t.gettenDongCo());
            pst.setString(5, t.getphanKhoi());
            pst.setString(6, t.getdoCaoYen());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getcongSuat());
            pst.setInt(9, t.getkhoiLuong());
            pst.setString(10, t.getXuatXu());
            pst.setString(11, "Tay ga");
            pst.setString(12, t.gettieuThuNL());
            pst.setInt(13, t.getTrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(TayGa t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE XeMay SET MaXe=?, TenXe=?, soLuong=?, tenDongCo=?, phanKhoi=?, doCaoYen=?, gia=?, congSuat=?, khoiLuong=?, xuatXu=?, loaixe = ?, tieuThuNL = ?, trangThai = ? WHERE MaXe= ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaXe()); 
            pst.setString(2, t.getTenXe());
            pst.setInt(3, t.getSoLuong());
            pst.setString(4, t.gettenDongCo());
            pst.setString(5, t.getphanKhoi());
            pst.setString(6, t.getdoCaoYen());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getcongSuat());
            pst.setInt(9, t.getkhoiLuong());
            pst.setString(10, t.getXuatXu());
            pst.setString(11, "Tay ga");
            pst.setString(12, t.gettieuThuNL());
            pst.setInt(13, t.getTrangThai());
            pst.setString(14, t.getMaXe());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(TayGa t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM XeMay WHERE MaXe=? ";
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
    public ArrayList<TayGa> selectAll() {
        ArrayList<TayGa> ketQua = new ArrayList<TayGa>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM XeMay";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String MaXe = rs.getString("MaXe");
                String TenXe = rs.getString("TenXe");
                int soLuong = rs.getInt("soLuong");
                String tenDongCo = rs.getString("tenDongCo");
                String phanKhoi = rs.getString("phanKhoi");
                String doCaoYen = rs.getString("doCaoYen");
                double gia = rs.getDouble("gia");
                String congSuat = rs.getString("congSuat");
                int khoiLuong = rs.getInt("khoiLuong");
                String tieuThuNL = rs.getString("tieuThuNL");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                TayGa tg = new TayGa(congSuat, khoiLuong, MaXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL,trangThai);
                ketQua.add(tg);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public TayGa selectById(String t) {
        TayGa ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM XeMay WHERE maXe=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String MaXe = rs.getString("MaXe");
                String TenXe = rs.getString("TenXe");
                int soLuong = rs.getInt("soLuong");
                String tenDongCo = rs.getString("tenDongCo");
                String phanKhoi = rs.getString("phanKhoi");
                String doCaoYen = rs.getString("doCaoYen");
                double gia = rs.getDouble("gia");
                String congSuat = rs.getString("congSuat");
                int khoiLuong = rs.getInt("khoiLuong");
                String tieuThuNL = rs.getString("tieuThuNL");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                ketQua = new TayGa(congSuat, khoiLuong, MaXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL,trangThai);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
