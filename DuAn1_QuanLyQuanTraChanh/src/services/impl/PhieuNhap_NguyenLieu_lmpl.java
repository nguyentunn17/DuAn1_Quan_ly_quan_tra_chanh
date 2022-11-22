/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import domainmodels.PhieuNhap_NguyenLieu;
import repositories.impl.PhieuNhap_NguyenLieu_rep;
import services.PhieuNhap_NguyenLieu_sv;

/**
 *
 * @author Inspiron
 */
public class PhieuNhap_NguyenLieu_lmpl implements PhieuNhap_NguyenLieu_sv{
    private PhieuNhap_NguyenLieu_rep phieuNhap_NguyenLieu_rep;

    public PhieuNhap_NguyenLieu_lmpl() {
        this.phieuNhap_NguyenLieu_rep=new PhieuNhap_NguyenLieu_rep();
    }
    

    @Override
    public ArrayList<PhieuNhap_NguyenLieu> getList() {
        return this.phieuNhap_NguyenLieu_rep.getAll();
    }

    @Override
    public void insert(PhieuNhap_NguyenLieu pnnl) {
        this.phieuNhap_NguyenLieu_rep.insert(pnnl);
    }

    @Override
    public void delete(String id) {
      this.phieuNhap_NguyenLieu_rep.delete(id);
    }

    @Override
    public void update(String id, PhieuNhap_NguyenLieu pnnl) {
        this.phieuNhap_NguyenLieu_rep.update(id, pnnl);
    }
    
}
