/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodels.ca;
import java.util.ArrayList;
import repositories.impl.reoimpl_ca;
import services.CaSV;

/**
 *
 * @author Phuong
 */
public class CaSVimpl implements CaSV{
    public  reoimpl_ca rca = new reoimpl_ca();
    @Override
    public ArrayList<ca> getlist() {
        return rca.getAll();
    }

    @Override
    public String insert(ca c) {
        if(rca.insert(c)){
            return "Thêm Thành Công";
        }
        return "Thêm Thất bại";
    }

    @Override
    public String Update(String MaCa, ca c) {
        if(rca.Update(MaCa, c)){
            return "Sửa Thành Công";
        }
        return "Sửa Thất bại";
    }

    @Override
    public String delete(String MaCa) {
        if(rca.delete(MaCa)){
            return "xóa Thành Công";
        }
        return "xóa Thất bại";
    }
    
    
}
