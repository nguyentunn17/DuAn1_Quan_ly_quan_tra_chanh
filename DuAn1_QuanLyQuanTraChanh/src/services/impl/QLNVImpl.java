/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;


import domainmodels.NhanVien;
import domainmodels.NhanVienVMD;
import java.util.ArrayList;
import repositories.impl.QLNVRepo;
import services.QLNVServices;

/**
 *
 * @author Quang
 */
public class QLNVImpl implements QLNVServices {

    private QLNVRepo qLNVRepo;

    public QLNVImpl() {
        qLNVRepo = new QLNVRepo();
    }

    @Override
    public ArrayList<NhanVien> listAll() {
        return qLNVRepo.listall();
    }

    @Override
    public void insert(NhanVien nv) {
        qLNVRepo.insert(nv);
    }

    @Override
    public void update(String ma, NhanVien nv) {
        qLNVRepo.update(ma, nv);
    }

    @Override
    public void delete(String ma) {
        qLNVRepo.delete(ma);
    }

    @Override
    public ArrayList<NhanVienVMD> listViewMoDel() {
        return qLNVRepo.listViewMoDel();
    }

    @Override
    public ArrayList<NhanVien> listSearch(String ma) {
        return qLNVRepo.list(ma);
    }

}
