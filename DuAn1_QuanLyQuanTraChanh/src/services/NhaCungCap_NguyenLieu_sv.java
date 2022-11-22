/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import domainmodels.NhaCungCap_NguyenLieu;

/**
 *
 * @author Inspiron
 */
public interface NhaCungCap_NguyenLieu_sv {
    ArrayList<NhaCungCap_NguyenLieu> getList();
    public void insert(NhaCungCap_NguyenLieu cap_NguyenLieu);
    public void delete(String id);
    public void update(String id , NhaCungCap_NguyenLieu cap_NguyenLieu);
    
}
