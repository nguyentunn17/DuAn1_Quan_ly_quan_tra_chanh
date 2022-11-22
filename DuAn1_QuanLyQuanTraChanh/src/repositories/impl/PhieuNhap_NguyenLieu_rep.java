/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import domainmodels.PhieuNhap_NguyenLieu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.jdbcUtil;

/**
 *
 * @author Inspiron
 */
public class PhieuNhap_NguyenLieu_rep {

    public ArrayList<PhieuNhap_NguyenLieu> getAll() {

        ArrayList<PhieuNhap_NguyenLieu> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "SELECT * from PHIEUNHAP";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String ngayNhap = rs.getString("NgayNhap");
                String donvitinh = rs.getString("DonViTinh");
                int soluong = rs.getInt("SoLuong");
                double dongia = rs.getDouble("DonGia");
                double thanhtien = rs.getDouble("ThanhTien");
                int phantramchietkhau = rs.getInt("PhanTramChietKhau");
                String ghichu = rs.getString("GhiChu");
                PhieuNhap_NguyenLieu nguyenLieu = new PhieuNhap_NguyenLieu(id, ma, ten, ngayNhap, donvitinh, soluong, dongia, thanhtien, phantramchietkhau, ghichu);
                list.add(nguyenLieu);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void insert(PhieuNhap_NguyenLieu pnnl) {

        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "INSERT INTO PHIEUNHAP" + "(Ma,Ten,NgayNhap,DonViTinh,SoLuong,DonGia,PhanTramChietKhau,GhiChu)" + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pnnl.getMa());
            ps.setString(2, pnnl.getTen());
            ps.setString(3, pnnl.getNgaynhap());
            ps.setString(4, pnnl.getDonvitinh());
            ps.setInt(5, pnnl.getSoluong());
            ps.setDouble(6, pnnl.getDongia());
            ps.setInt(7, pnnl.getPhantramchietkhau());
            ps.setString(8, pnnl.getGhichu());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void update(String id, PhieuNhap_NguyenLieu pnnl) {

        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "UPDATE PHIEUNHAP SET Ma=?,Ten=?,NgayNhap=?,DonViTinh=?,SoLuong=?,DonGia=?,PhanTramChietKhau=?,GhiChu=? WHERE Id=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pnnl.getMa());
            ps.setString(2, pnnl.getTen());
            ps.setString(3, pnnl.getNgaynhap());
            ps.setString(4, pnnl.getDonvitinh());
            ps.setInt(5, pnnl.getSoluong());
            ps.setDouble(6, pnnl.getDongia());
            ps.setInt(7, pnnl.getPhantramchietkhau());
            ps.setString(8, pnnl.getGhichu());
            ps.setString(9, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void delete(String id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "DELETE FROM PHIEUNHAP WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
