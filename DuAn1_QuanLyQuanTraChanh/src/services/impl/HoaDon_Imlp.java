/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodels.HoaDon;
import java.util.ArrayList;
import repositories.impl.HoaDon_rep;
import services.HoaDon_sv;

/**
 *
 * @author Inspiron
 */
public class HoaDon_Imlp implements HoaDon_sv{
    private HoaDon_rep hoaDon_rep;

    public HoaDon_Imlp() {
        this.hoaDon_rep=new HoaDon_rep();
                
    }
    

    @Override
    public void insert(HoaDon hoaDon) {
        this.hoaDon_rep.insert(hoaDon);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(String id, HoaDon hoaDon) {
        this.hoaDon_rep.update(id, hoaDon);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String id) {
        this.hoaDon_rep.delete(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon> getAll() {
       return this.hoaDon_rep.getAll();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
