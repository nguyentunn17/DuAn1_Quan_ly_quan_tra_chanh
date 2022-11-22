/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodels.PhieuXuat_NguyenLieu;
import java.util.ArrayList;
import repositories.impl.PhieuXuat_NguyenLieu_rep;
import services.PhieuXuat_NguyenLieu_sv;

/**
 *
 * @author Inspiron
 */
public class PhieuXuat_NguyenLieu_lmpl implements PhieuXuat_NguyenLieu_sv{
    private PhieuXuat_NguyenLieu_rep pxnl;

    public PhieuXuat_NguyenLieu_lmpl() {
        this.pxnl=new PhieuXuat_NguyenLieu_rep();
    }
    

    @Override
    public ArrayList<PhieuXuat_NguyenLieu> getList() {
        return this.pxnl.getAll();
    }

    @Override
    public void insert(PhieuXuat_NguyenLieu pxnl) {
        this.pxnl.insert(pxnl);
    }

    @Override
    public void delete(String id) {
        this.pxnl.delete(id);
    }

    @Override
    public void update(String id, PhieuXuat_NguyenLieu pxnl) {
        this.pxnl.update(id, pxnl);
    }
    
}
