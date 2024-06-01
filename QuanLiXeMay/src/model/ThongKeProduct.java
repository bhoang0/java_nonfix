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
public class ThongKeProduct {
    private String maXe;
    private String tenXe;
    private int slNhap;
    private int slXuat;

    public ThongKeProduct() {
    }

    public ThongKeProduct(String maXe, String tenXe, int slNhap, int slXuat) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.maXe);
        hash = 53 * hash + Objects.hashCode(this.tenXe);
        hash = 53 * hash + this.slNhap;
        hash = 53 * hash + this.slXuat;
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
        final ThongKeProduct other = (ThongKeProduct) obj;
        if (this.slNhap != other.slNhap) {
            return false;
        }
        if (this.slXuat != other.slXuat) {
            return false;
        }
        if (!Objects.equals(this.maXe, other.maXe)) {
            return false;
        }
        return Objects.equals(this.tenXe, other.tenXe);
    }

    @Override
    public String toString() {
        return "ThongKeProduct{" + "maXe=" + maXe + ", tenXe=" + tenXe + ", slNhap=" + slNhap + ", slXuat=" + slXuat + '}';
    }
    
    
}
