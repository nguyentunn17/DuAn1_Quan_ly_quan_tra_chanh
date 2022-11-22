/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

/**
 *
 * @author Inspiron
 */
public class PhieuNhap_NguyenLieu {
    private String id;
    private String ma;
    private String ten;
    private String ngaynhap;
    private String donvitinh;
    private int soluong;
    private double dongia;
    private double thanhtien;
    private int phantramchietkhau;
    private String ghichu;

    public PhieuNhap_NguyenLieu() {
    }

    public PhieuNhap_NguyenLieu(String ma, String ten, String ngaynhap, String donvitinh, int soluong, double dongia, int phantramchietkhau, String ghichu) {
        this.ma = ma;
        this.ten = ten;
        this.ngaynhap = ngaynhap;
        this.donvitinh = donvitinh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.phantramchietkhau = phantramchietkhau;
        this.ghichu = ghichu;
    }

    
    

    public PhieuNhap_NguyenLieu(String id, String ma, String ten, String ngaynhap, String donvitinh, int soluong, double dongia, double thanhtien, int phantramchietkhau, String ghichu) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaynhap = ngaynhap;
        this.donvitinh = donvitinh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.phantramchietkhau = phantramchietkhau;
        this.ghichu = ghichu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getPhantramchietkhau() {
        return phantramchietkhau;
    }

    public void setPhantramchietkhau(int phantramchietkhau) {
        this.phantramchietkhau = phantramchietkhau;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    public double thanhtien(){
        this.thanhtien=((this.soluong*this.dongia)*(100-this.phantramchietkhau))/100;
    
    return thanhtien;
    }
   
    
}
