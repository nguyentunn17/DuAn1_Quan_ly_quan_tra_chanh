/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

/**
 *
 * @author Phuong
 */
public class ca {
    private String maCa;
    private String tenCa;
    private String ngayThang;
    private int thoigianca;

    public ca() {
    }

    public ca(String maCa, String tenCa, String ngayThang, int thoigianca) {
        this.maCa = maCa;
        this.tenCa = tenCa;
        this.ngayThang = ngayThang;
        this.thoigianca = thoigianca;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    public String getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(String ngayThang) {
        this.ngayThang = ngayThang;
    }

    public int getThoigianca() {
        return thoigianca;
    }

    public void setThoigianca(int thoigianca) {
        this.thoigianca = thoigianca;
    }
    
    
}
