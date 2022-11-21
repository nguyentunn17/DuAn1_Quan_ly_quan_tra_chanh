/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

import java.util.Date;

/**
 *
 * @author Phuong
 */
public class luong {
    private String maLuong;
    private String mucLuong;
     private String ngayquydinh;
    private String phuCap;
    private String thuong;
   

    public luong() {
    }

    public luong(String maLuong, String mucLuong, String ngayquydinh, String phuCap, String thuong) {
        this.maLuong = maLuong;
        this.mucLuong = mucLuong;
        this.ngayquydinh = ngayquydinh;
        this.phuCap = phuCap;
        this.thuong = thuong;
    }

    public String getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(String maLuong) {
        this.maLuong = maLuong;
    }

    public String getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(String mucLuong) {
        this.mucLuong = mucLuong;
    }

    public String getNgayquydinh() {
        return ngayquydinh;
    }

    public void setNgayquydinh(String ngayquydinh) {
        this.ngayquydinh = ngayquydinh;
    }

    public String getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(String phuCap) {
        this.phuCap = phuCap;
    }

    public String getThuong() {
        return thuong;
    }

    public void setThuong(String thuong) {
        this.thuong = thuong;
    }

}