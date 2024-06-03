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
import javax.swing.JOptionPane;
import model.XeSo;
import model.XeMay;

/**
 *
 * @author 
 */
public class XeSoDAO implements DAOInterface<XeSo> {

    public static XeSoDAO getInstance() {
        return new XeSoDAO();
    }

    @Override
    public int insert(XeSo t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO XeMay (MaXe, TenXe, soLuong, tenDongCo, phanKhoi, doCaoYen, gia, phienBan, dungTichbinhXang, xuatXu, loaiXe, tieuThuNL, trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaXe());
            pst.setString(2, t.getTenXe());
            pst.setInt(3, t.getSoLuong());
            pst.setString(4, t.gettenDongCo());
            pst.setString(5, t.getphanKhoi());
            pst.setString(6, t.getdoCaoYen());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getphienBan());
            pst.setDouble(9, t.getdungTichbinhXang());
            pst.setString(10, t.getXuatXu());
            pst.setString(11, "XeSo");
            pst.setString(12, t.gettieuThuNL());
            pst.setInt(13, t.getTrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thêm được " + t.getMaXe(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketQua;
    }

    @Override
    public int update(XeSo t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE XeMay SET MaXe=?, TenXe=?, soLuong=?, tenDongCo=?, phanKhoi=?, doCaoYen=?, gia=?, phienBan=?, dungTichbinhXang=?, xuatXu=?, loaiXe = ?, tieuThuNL = ?, trangThai = ? WHERE MaXe=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaXe());
            pst.setString(2, t.getTenXe());
            pst.setInt(3, t.getSoLuong());
            pst.setString(4, t.gettenDongCo());
            pst.setString(5, t.getphanKhoi());
            pst.setString(6, t.getdoCaoYen());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getphienBan());
            pst.setDouble(9, t.getdungTichbinhXang());
            pst.setString(10, t.getXuatXu());
            pst.setString(11, "XeSo");
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
    public int delete(XeSo t) {
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
    public ArrayList<XeSo> selectAll() {
        ArrayList<XeSo> ketQua = new ArrayList<XeSo>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * From XeMay";
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
                double dungTichbinhXang = rs.getDouble("dungTichbinhXang");
                String phienBan = rs.getString("phienBan");
                String tieuThuNL = rs.getString("tieuThuNL");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("TrangThai");
                XeSo xm = new XeSo(dungTichbinhXang, phienBan, MaXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL, trangThai);
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
    public XeSo selectById(String t) {
        XeSo ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * From XeMay WHERE MaXe=?";
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
                double dungTichbinhXang = rs.getDouble("dungTichbinhXang");
                String phienBan = rs.getString("phienBan");
                String tieuThuNL = rs.getString("tieuThuNL");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                ketQua = new XeSo(dungTichbinhXang, phienBan, MaXe, TenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL, trangThai);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public boolean isXeSo(String id) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * From XeMay WHERE MaXe= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            String tl = null;
            while (rs.next()) {
                tl = rs.getString("loaiXe");
            }
            if (tl.equals("XeSo")) {
                return true;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
}
