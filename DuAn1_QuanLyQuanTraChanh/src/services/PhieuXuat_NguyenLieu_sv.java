/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import domainmodels.PhieuXuat_NguyenLieu;

/**
 *
 * @author Inspiron
 */
public interface PhieuXuat_NguyenLieu_sv {
    public ArrayList<PhieuXuat_NguyenLieu> getList();
    public void insert(PhieuXuat_NguyenLieu pxnl);
    public void delete(String id);
    public void update(String id,PhieuXuat_NguyenLieu pxnl);
    
}
