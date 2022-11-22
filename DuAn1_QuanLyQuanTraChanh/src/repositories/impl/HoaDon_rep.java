/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import domainmodels.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utilities.jdbcUtil;

/**
 *
 * @author Inspiron
 */
public class HoaDon_rep {
    public ArrayList<HoaDon> getAll() {
        ArrayList<HoaDon> list = new ArrayList<>();
        try {
            Connection conn = jdbcUtil.getConnection();
            String select = "select * from HOADON";
            PreparedStatement ps = conn.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("MaHD");
                String ngaytao = rs.getString("NgayTao");
                String ngaythanhtoan = rs.getString("NgayThanhToan");
                String ngayship = rs.getString("Ngayship");
                String ngayNhan=rs.getString("NgayNhan");
                int trangthai = rs.getInt("TrangThai");
                String ten=rs.getString("TenNguoiNhan");
                String diachi=rs.getString("DiaChi");
                String sdt=rs.getString("SDT");
              HoaDon hd=new HoaDon(id, ma, ngaytao, ngaythanhtoan, ngayship, ngayNhan, trangthai, ten, diachi, sdt);
              list.add(hd);
             
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void insert(HoaDon hoaDon) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String insert = "insert into HOADON"
                    + "(MaHD,NgayTao,NgayThanhToan,Ngayship,NgayNhan,TrangThai,TenNguoiNhan,DiaChi,SDT)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, hoaDon.getMa());
            ps.setString(2, hoaDon.getNgaytao());
            ps.setString(3, hoaDon.getNgaythanhtoan());
            ps.setString(4, hoaDon.getNgayship());
            ps.setString(5, hoaDon.getNgaynhap());
            ps.setInt(6, hoaDon.getTrangthai());
            ps.setString(7, hoaDon.getTen());
            ps.setString(8, hoaDon.getDiachi());
            ps.setString(9, hoaDon.getSdt());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, HoaDon hoaDon) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String update = "update HOADON set MaHD=?,NgayTao=?,NgayThanhToan=?,Ngayship=?,NgayNhan=?,TrangThai=?,TenNguoiNhan=?,DiaChi=?,SDT=? where Id=?";
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, hoaDon.getMa());
            ps.setString(2, hoaDon.getNgaytao());
            ps.setString(3, hoaDon.getNgaythanhtoan());
            ps.setString(4, hoaDon.getNgayship());
            ps.setString(5, hoaDon.getNgaynhap());
            ps.setInt(6, hoaDon.getTrangthai());
            ps.setString(7, hoaDon.getTen());
            ps.setString(8, hoaDon.getDiachi());
            ps.setString(9, hoaDon.getSdt());
            ps.setString(10, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection conn = jdbcUtil.getConnection();
            String delete = "delete from HOADON where Id=? ";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
