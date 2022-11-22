/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import domainmodels.PhieuXuat_NguyenLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utilities.jdbcUtil;

/**
 *
 * @author Inspiron
 */
public class PhieuXuat_NguyenLieu_rep {

    public ArrayList<PhieuXuat_NguyenLieu> getAll() {

        ArrayList<PhieuXuat_NguyenLieu> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "SELECT * from PHIEUXUAT";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");

                String ngayxuat = rs.getString("NgayXuat");
                String donvitinh = rs.getString("DonViTinh");
                int soluong = rs.getInt("SoLuong");
                double dongia = rs.getDouble("DonGia");
                double thanhtien = rs.getDouble("ThanhTien");

                String ghichu = rs.getString("GhiChu");
                PhieuXuat_NguyenLieu nguyenLieu = new PhieuXuat_NguyenLieu(id, ma, ngayxuat, donvitinh, soluong, dongia, thanhtien, ghichu);
                list.add(nguyenLieu);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void insert(PhieuXuat_NguyenLieu pxnl) {

        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "INSERT INTO PHIEUXUAT" + "(Ma,NgayXuat,DonViTinh,SoLuong,DonGia,GhiChu)" + "VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pxnl.getMa());
            ps.setString(2, pxnl.getNgayxuat());
            ps.setString(3, pxnl.getDonvitinh());
            ps.setInt(4, pxnl.getSoluong());
            ps.setDouble(5, pxnl.getDongia());
            ps.setString(6, pxnl.getGhichu());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void update(String id, PhieuXuat_NguyenLieu pxnl) {

        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "UPDATE PHIEUXUAT SET Ma=?,NgayXuat=?,DonViTinh=?,SoLuong=?,DonGia=?,GhiChu=? WHERE Id=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pxnl.getMa());
            ps.setString(2, pxnl.getNgayxuat());
            ps.setString(3, pxnl.getDonvitinh());
            ps.setInt(4, pxnl.getSoluong());
            ps.setDouble(5, pxnl.getDongia());
            ps.setString(6, pxnl.getGhichu());
            ps.setString(7, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void delete(String id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String sql = "DELETE FROM PHIEUXUAT WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}


