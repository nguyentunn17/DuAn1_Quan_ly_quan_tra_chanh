/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;


import domainmodels.NhanVien;
import domainmodels.NhanVienVMD;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import utilities.jdbcUtil;

/**
 *
 * @author Quang
 */
public class QLNVRepo {

    public ArrayList<NhanVien> listall() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "select * from nhanvien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String gioiTinh = rs.getString("gioitinh");
                Date ngaySinh = rs.getDate("ngaysinh");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                int trangThai = rs.getInt("trangThai");
                String anh = rs.getString("anh");
                String idLuong = rs.getString("idluong");
                NhanVien nv = new NhanVien(id, ma, ten, gioiTinh, ngaySinh, diaChi, sdt, trangThai, anh, idLuong);
                list.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void insert(NhanVien nv) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "insert into nhanvien "
                    + "(ma,ten,gioitinh,ngaysinh,diachi,sdt,trangthai,anh)"
                    + "values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getGioiTinh());
            ps.setDate(4,new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getSdt());
            ps.setInt(7, nv.getTrangThai());
            ps.setString(8, nv.getAnh());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String ma, NhanVien nv) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "update nhanvien set ten=?,gioitinh=?,ngaysinh=?,diachi=?,sdt=?,trangthai=?,anh=? where ma =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getGioiTinh());
            ps.setDate(3, new java.sql.Date(nv.getNgaySinh().getTime()));
            ps.setString(4, nv.getDiaChi());
            ps.setString(5, nv.getSdt());
            ps.setInt(6, nv.getTrangThai());
            ps.setString(7, nv.getAnh());
            ps.setString(8, ma);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "delete nhanvien where ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<NhanVienVMD> listViewMoDel() {
        ArrayList<NhanVienVMD> listView = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "select luong.mucluong, nhanvien.ma,nhanvien.ten,nhanvien.gioitinh,nhanvien.ngaysinh,nhanvien.diachi,nhanvien.sdt,nhanvien.trangthai,nhanvien.anh from luong inner join nhanvien on nhanvien.idluong = luong.id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String gioiTinh = rs.getString("gioitinh");
                Date ngaySinh = rs.getDate("ngaysinh");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                int trangThai = rs.getInt("trangThai");
                String anh = rs.getString("anh");
                double luong = rs.getDouble("luong");
                NhanVienVMD nhanVienVMD = new NhanVienVMD(ma, ten, gioiTinh, ngaySinh, diaChi, sdt, trangThai, anh, luong);
                listView.add(nhanVienVMD);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listView;
    }
    
    public ArrayList<NhanVien>list(String ma){
         ArrayList<NhanVien> listSearch = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "select * from nhanvien where ma like ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma1 = rs.getString("ma");
                String ten = rs.getString("ten");
                String gioiTinh = rs.getString("gioitinh");
                Date ngaySinh = rs.getDate("ngaysinh");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                int trangThai = rs.getInt("trangThai");
                String anh = rs.getString("anh");
                String idLuong = rs.getString("idluong");
                NhanVien nv = new NhanVien(id, ma1, ten, gioiTinh, ngaySinh, diaChi, sdt, trangThai, anh, idLuong);
                listSearch.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listSearch;
    }
}
