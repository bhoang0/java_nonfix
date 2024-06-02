/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author
 */
public class TayGa extends XeMay{
    private String congSuat;
    private int khoiLuong;

    public TayGa(String congSuat, int khoiLuong) {
        this.congSuat = congSuat;
        this.khoiLuong = khoiLuong;
    }

    public TayGa(String congSuat, int khoiLuong, String maXe, String tenXe, int soLuong, double gia, String tenDongCo, String phanKhoi, String xuatXu, String doCaoYen, String tieuThuNL, int trangThai) {
        super(maXe, tenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL,trangThai);
        this.congSuat = congSuat;
        this.khoiLuong = khoiLuong;
    }

    public TayGa() {
        
    }

    public String getcongSuat() {
        return congSuat;
    }

    public void setcongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public int getkhoiLuong() {
        return khoiLuong;
    }

    public void setkhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.congSuat);
        hash = 43 * hash + Objects.hashCode(this.khoiLuong);
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
        final TayGa other = (TayGa) obj;
        if (!Objects.equals(this.congSuat, other.congSuat)) {
            return false;
        }
        return Objects.equals(this.khoiLuong, other.khoiLuong);
    }

    @Override
    public String toString() {
        return "TayGa{" + "congSuat=" + congSuat + ", khoiLuong=" + khoiLuong + '}';
    }
    
    
}
