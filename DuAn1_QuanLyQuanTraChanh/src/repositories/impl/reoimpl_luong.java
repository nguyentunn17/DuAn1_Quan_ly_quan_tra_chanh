/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import utilities.jdbcUtil;
import jdk.jfr.DataAmount;
import domainmodels.luong;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositories.reo_luong;

/**
 *
 * @author Phuong
 */
public class reoimpl_luong implements reo_luong{

    @Override
    public ArrayList<luong> getAll() {
        ArrayList<luong> listluong =new ArrayList<>();
        try{
            Connection conn=jdbcUtil.getConnection();
            String sql="select * from LUONG";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.execute();
            ResultSet rs=pre.getResultSet();
            while(rs.next()){
                String maluong=rs.getString("MaLuong");
                String mucluong=rs.getString("MucLuong");
                String phucap=rs.getString("Phucap");
                String thuong=rs.getString("Thuong");
                String ngayphucap=rs.getString("NgayQuyDinh");
                luong lg=new luong(maluong, mucluong, ngayphucap, phucap, thuong);
                listluong.add(lg);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(reoimpl_luong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listluong;
    }

    @Override
    public boolean insert(luong lg) {
        try {
            Connection conn=jdbcUtil.getConnection();
            String insert = "insert into LUONG" + "(MaLuong,MucLuong,NgayQuyDinh,Phucap,Thuong)" + "Values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, lg.getMaLuong());
            ps.setString(2, lg.getMucLuong());
            ps.setString(3, lg.getNgayquydinh());
            ps.setString(4, lg.getPhuCap());
            ps.setString(5, lg.getThuong());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean Update(String MaLuong, luong lg) {
        try {
            Connection conn=jdbcUtil.getConnection();
            String Update = "update LUONG set MucLuong=?,NgayQuyDinh=?,Phucap=?,Thuong=? Where MaLuong=?";
            PreparedStatement ps = conn.prepareStatement(Update);
            ps.setString(5, MaLuong);
            ps.setString(1, lg.getMucLuong());
            ps.setString(2, lg.getNgayquydinh());
            ps.setString(3, lg.getPhuCap());
            ps.setString(4, lg.getThuong());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String MaLuong) {
         try {
            Connection conn=jdbcUtil.getConnection();
            String delete = "delete from LUONG where MaLuong = ?";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, MaLuong);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
   }
