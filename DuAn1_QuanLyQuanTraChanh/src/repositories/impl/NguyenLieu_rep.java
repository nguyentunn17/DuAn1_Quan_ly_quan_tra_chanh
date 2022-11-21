/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utilities.jdbcUtil;
import domainmodels.NguyenLieu;

/**
 *
 * @author Inspiron
 */
public class NguyenLieu_rep {

    public ArrayList<NguyenLieu> getAll() {
        ArrayList<NguyenLieu> listNguyenLieu = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String select = "select * from NGUYENLIEU";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("MaNL");
                String ten = rs.getString("TenNL");
                String loai = rs.getString("LoaiNL");
                int so = rs.getInt("SOLUONG");

                NguyenLieu nguyenLieu = new NguyenLieu(id, ma, ten, loai, so);
                listNguyenLieu.add(nguyenLieu);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listNguyenLieu;
    }

    public void insert(NguyenLieu nguyenLieu) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String insert = "insert into NGUYENLIEU "
                    + "(MaNL,TenNL,LoaiNL,SOLUONG)"
                    + "values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, nguyenLieu.getMaNL());
            ps.setString(2, nguyenLieu.getTenNL());
            ps.setString(3, nguyenLieu.getLoaiNL());
            ps.setInt(4, nguyenLieu.getSoluong());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, NguyenLieu nguyenLieu) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String update = "update NGUYENLIEU set MaNL=?, TenNL=? ,LoaiNL=?, SOLUONG=? where Id=?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, nguyenLieu.getMaNL());
            ps.setString(2, nguyenLieu.getTenNL());
            ps.setString(3, nguyenLieu.getLoaiNL());
            ps.setInt(4, nguyenLieu.getSoluong());
            ps.setString(5, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String delete = "delete from NGUYENLIEU where Id=? ";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
