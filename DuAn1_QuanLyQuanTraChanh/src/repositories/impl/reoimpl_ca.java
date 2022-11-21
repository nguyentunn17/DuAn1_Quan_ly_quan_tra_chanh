/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import domainmodels.ca;
import repositories.reo_ca;
import utilities.jdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuong
 */
public class reoimpl_ca implements reo_ca{

    @Override
    public ArrayList<ca> getAll() {
        ArrayList<ca> listca =new ArrayList<>();
        try{
            Connection conn=jdbcUtil.getConnection();
            String sql="select * from CA";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.execute();
            ResultSet rs=pre.getResultSet();
            while(rs.next()){
                String maca=rs.getString("MaCa");
                String tenca=rs.getString("TenCa");
                String ngaythang=rs.getString("NgayThang");
                int time=rs.getInt("ThoiGianCa");
                ca c=new ca(maca, tenca, ngaythang, time);
                listca.add(c);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(reoimpl_luong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listca;
    }

    @Override
    public boolean insert(ca c) {
        try {
            Connection conn=jdbcUtil.getConnection();
            String insert = "insert into CA" + "(MaCa,TenCa,NgayThang,ThoiGianCa)" + "Values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, c.getMaCa());
            ps.setString(2, c.getTenCa());
            ps.setString(3, c.getNgayThang());
            ps.setInt(4, c.getThoigianca());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean Update(String MaCa, ca c) {
        try {
            Connection conn=jdbcUtil.getConnection();
            String Update = "update CA set TenCa=?,NgayThang=?,ThoiGianCa=? Where MaCa=?";
            PreparedStatement ps = conn.prepareStatement(Update);
            ps.setString(4, MaCa);
            ps.setString(1, c.getTenCa());
            ps.setString(2, c.getNgayThang());
            ps.setInt(3, c.getThoigianca());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String MaCa) {
        try {
            Connection conn=jdbcUtil.getConnection();
            String delete = "delete from CA where MaCa = ?";
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, MaCa);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    }
    

