/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

/**
 *
 * @author ASUS
 */
public class Ban {
    private String id;
    private String maBan;
    private String tenBan;

    public Ban() {
    }

    public Ban(String id, String maBan, String tenBan) {
        this.id = id;
        this.maBan = maBan;
        this.tenBan = tenBan;
    }

    public Ban(String maBan, String tenBan) {
        this.maBan = maBan;
        this.tenBan = tenBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getId(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
