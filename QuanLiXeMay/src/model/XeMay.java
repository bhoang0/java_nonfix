/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class XeMay {
    private String MaXe;
    private String TenXe;
    private int soLuong;
    private double gia;
    private String tenDongCo;
    private String phanKhoi;
    private String xuatXu;
    private String doCaoYen;
    private String tieuThuNL;
    private int trangThai;
    

    public XeMay() {
        
    }
    
    public XeMay(String MaXe, String TenXe, int soLuong, double donGia, String tenDongCo, String loaiXe, int trangThai){
        
    }

    public XeMay(String MaXe, String TenXe, int soLuong, double gia, String tenDongCo, String phanKhoi, String xuatXu, String doCaoYen, String tieuThuNL,int trangThai) {
        this.MaXe = MaXe;
        this.TenXe = TenXe;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tenDongCo = tenDongCo;
        this.phanKhoi = phanKhoi;
        this.xuatXu = xuatXu;
        this.doCaoYen = doCaoYen;
        this.tieuThuNL = tieuThuNL;
        this.trangThai = trangThai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public XeMay(String MaXe, String TenXe, int soLuong, double gia,String tenDongCo, String phanKhoi,String tieuThuNL) {
        this.MaXe = MaXe;
        this.TenXe = TenXe;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tenDongCo = tenDongCo;
        this.phanKhoi = phanKhoi;
        this.tieuThuNL = tieuThuNL;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String gettenDongCo() {
        return tenDongCo;
    }

    public void settenDongCo(String tenDongCo) {
        this.tenDongCo = tenDongCo;
    }

    public String getphanKhoi() {
        return phanKhoi;
    }

    public void setphanKhoi(String phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getdoCaoYen() {
        return doCaoYen;
    }

    public void setdoCaoYen(String doCaoYen) {
        this.doCaoYen = doCaoYen;
    }

    public String gettieuThuNL() {
        return tieuThuNL;
    }

    public void settieuThuNL(String tieuThuNL) {
        this.tieuThuNL = tieuThuNL;
    }

    public void xuatHang(int sl) {
        this.soLuong -= sl;
    }
    
    @Override
    public String toString() {
        return "XeMay{" + "maXe=" + MaXe + ", tenXe=" + TenXe + ", soLuong=" + soLuong + ", gia=" + gia + ", tenDongCo=" + tenDongCo + ", phanKhoi=" + phanKhoi + ", xuatXu=" + xuatXu + ", doCaoYen=" + doCaoYen + ", tieuThuNL=" + tieuThuNL + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.MaXe);
        hash = 37 * hash + Objects.hashCode(this.TenXe);
        hash = 37 * hash + this.soLuong;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.gia) ^ (Double.doubleToLongBits(this.gia) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.tenDongCo);
        hash = 37 * hash + Objects.hashCode(this.phanKhoi);
        hash = 37 * hash + Objects.hashCode(this.xuatXu);
        hash = 37 * hash + Objects.hashCode(this.doCaoYen);
        hash = 37 * hash + Objects.hashCode(this.tieuThuNL);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final XeMay other = (XeMay) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.gia) != Double.doubleToLongBits(other.gia)) {
            return false;
        }
        if (!Objects.equals(this.MaXe, other.MaXe)) {
            return false;
        }
        if (!Objects.equals(this.TenXe, other.TenXe)) {
            return false;
        }
        if (!Objects.equals(this.tenDongCo, other.tenDongCo)) {
            return false;
        }
        if (!Objects.equals(this.phanKhoi, other.phanKhoi)) {
            return false;
        }
        if (!Objects.equals(this.xuatXu, other.xuatXu)) {
            return false;
        }
        if (!Objects.equals(this.doCaoYen, other.doCaoYen)) {
            return false;
        }
        return Objects.equals(this.tieuThuNL, other.tieuThuNL);
    }
}
