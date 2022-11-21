/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

/**
 *
 * @author Inspiron
 */
public class NguyenLieu {
    private String id;
    private String maNL ;
    private String tenNL;
    private String LoaiNL;
    private int soluong;

    public NguyenLieu() {
    }

    public NguyenLieu(String id, String maNL, String tenNL, String LoaiNL, int soluong) {
        this.id = id;
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.LoaiNL = LoaiNL;
        this.soluong = soluong;
    }

    public NguyenLieu(String maNL, String tenNL, String LoaiNL, int soluong) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.LoaiNL = LoaiNL;
        this.soluong = soluong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public String getLoaiNL() {
        return LoaiNL;
    }

    public void setLoaiNL(String LoaiNL) {
        this.LoaiNL = LoaiNL;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    

}