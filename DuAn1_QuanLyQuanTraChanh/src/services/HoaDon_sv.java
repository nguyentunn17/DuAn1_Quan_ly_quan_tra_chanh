/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodels.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public interface HoaDon_sv {
    public void insert (HoaDon hoaDon);
    public void update (String id, HoaDon hoaDon);
    public void delete (String id);
    public ArrayList<HoaDon> getAll();
    
}
