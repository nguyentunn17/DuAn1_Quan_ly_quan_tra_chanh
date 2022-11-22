/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import domainmodels.PhieuNhap_NguyenLieu;

/**
 *
 * @author Inspiron
 */
public interface PhieuNhap_NguyenLieu_sv {
    public ArrayList<PhieuNhap_NguyenLieu> getList();
    public void insert(PhieuNhap_NguyenLieu pnnl);
    public void delete(String id);
    public void update(String id,PhieuNhap_NguyenLieu pnnl);
    
}
