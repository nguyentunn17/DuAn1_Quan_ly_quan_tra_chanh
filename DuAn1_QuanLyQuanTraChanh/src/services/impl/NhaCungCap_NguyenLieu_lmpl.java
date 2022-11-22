/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import domainmodels.NhaCungCap_NguyenLieu;
import repositories.impl.NhaCungCap_NguyenLieu_rep;
import services.NhaCungCap_NguyenLieu_sv;

/**
 *
 * @author Inspiron
 */
public class NhaCungCap_NguyenLieu_lmpl implements NhaCungCap_NguyenLieu_sv{
    private NhaCungCap_NguyenLieu_rep cap_NguyenLieu_rep;

    public NhaCungCap_NguyenLieu_lmpl() {
        this.cap_NguyenLieu_rep=new NhaCungCap_NguyenLieu_rep();
    }
    

    @Override
    public ArrayList<NhaCungCap_NguyenLieu> getList() {
       return this.cap_NguyenLieu_rep.getAll();
    }

    @Override
    public void insert(NhaCungCap_NguyenLieu cap_NguyenLieu) {
        this.cap_NguyenLieu_rep.insert(cap_NguyenLieu);
    }

    @Override
    public void delete(String id) {
        this.cap_NguyenLieu_rep.delete(id);
    }

    @Override
    public void update(String id, NhaCungCap_NguyenLieu cap_NguyenLieu) {
       this.cap_NguyenLieu_rep.update(id, cap_NguyenLieu);
    }
    
}
