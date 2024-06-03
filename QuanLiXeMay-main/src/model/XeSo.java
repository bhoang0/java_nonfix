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
public class XeSo extends XeMay{
    private double dungTichbinhXang;
    private String phienBan;

    public XeSo(double dungTichbinhXang, String phienBan, String maXe, String tenXe, int soLuong, double gia, String tenDongCo, String phanKhoi, String xuatXu, String doCaoYen, String tieuThuNL, int trangThai) {
        super(maXe, tenXe, soLuong, gia, tenDongCo, phanKhoi, xuatXu, doCaoYen, tieuThuNL,trangThai);
        this.dungTichbinhXang = dungTichbinhXang;
        this.phienBan = phienBan;
    }

    public XeSo() {
        
    }

    public double getdungTichbinhXang() {
        return dungTichbinhXang;
    }

    public void setdungTichbinhXang(double dungTichbinhXang) {
        this.dungTichbinhXang = dungTichbinhXang;
    }

    public String getphienBan() {
        return phienBan;
    }

    public void setphienBan(String phienBan) {
        this.phienBan = phienBan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.dungTichbinhXang);
        hash = 67 * hash + Objects.hashCode(this.phienBan);
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
        final XeSo other = (XeSo) obj;
        if (!Objects.equals(this.dungTichbinhXang, other.dungTichbinhXang)) {
            return false;
        }
        return Objects.equals(this.phienBan, other.phienBan);
    }

    @Override
    public String toString() {
        return "XeSo{" + "dungTichbinhXang=" + dungTichbinhXang + ", phienBan=" + phienBan + '}';
    }


    
    
}
