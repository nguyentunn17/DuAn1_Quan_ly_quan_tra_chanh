/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

/**
 *
 * @author Inspiron
 */
public class PhieuXuat_NguyenLieu {

    private String id;
    private String ma;
    private String ngayxuat;
    private String donvitinh;
    private int soluong;
    private double dongia;
    private double thanhtien;
    private String ghichu;

    public PhieuXuat_NguyenLieu(String ma, String ngayxuat, String donvitinh, int soluong, double dongia, String ghichu) {
        this.ma = ma;
        this.ngayxuat = ngayxuat;
        this.donvitinh = donvitinh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.ghichu = ghichu;
    }

    public PhieuXuat_NguyenLieu(String ma, String ngayxuat, String donvitinh, int soluong, double dongia, double thanhtien, String ghichu) {
        this.ma = ma;
        this.ngayxuat = ngayxuat;
        this.donvitinh = donvitinh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.ghichu = ghichu;
    }

    public PhieuXuat_NguyenLieu() {
    }

    public PhieuXuat_NguyenLieu(String id, String ma, String ngayxuat, String donvitinh, int soluong, double dongia, double thanhtien, String ghichu) {
        this.id = id;
        this.ma = ma;
        this.ngayxuat = ngayxuat;
        this.donvitinh = donvitinh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
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

    public String getNgayxuat() {
        return ngayxuat;
    }

    public void setNgayxuat(String ngayxuat) {
        this.ngayxuat = ngayxuat;
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

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public double thanhtien() {
        this.thanhtien = this.soluong * this.dongia;

        return thanhtien;
    }

}
