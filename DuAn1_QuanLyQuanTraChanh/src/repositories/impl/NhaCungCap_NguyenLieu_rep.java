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
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.jdbcUtil;
import domainmodels.NhaCungCap_NguyenLieu;

/**
 *
 * @author Inspiron
 */
public class NhaCungCap_NguyenLieu_rep {
    public ArrayList<NhaCungCap_NguyenLieu> getAll(){
         ArrayList<NhaCungCap_NguyenLieu> nhaCungCap_NguyenLieus=new ArrayList<>();
        try {
            Connection conn=jdbcUtil.getConnection();
            String sql="SELECT * FROM NHACUNGCAP";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs=ps.getResultSet();
            while(rs.next()){
                String id=rs.getString("Id");
                String ma=rs.getString("MaNCC");
                String ten=rs.getString("TenNCC");
                String diachi=rs.getString("DiaChi");
                String sdt=rs.getString("SDT");
                String email=rs.getString("Email");
                NhaCungCap_NguyenLieu cap_NguyenLieu=new NhaCungCap_NguyenLieu(id, ma, ten, diachi, sdt, email);
                nhaCungCap_NguyenLieus.add(cap_NguyenLieu);
            
            
            }
           
        } catch (SQLException ex) {
             ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
         return nhaCungCap_NguyenLieus;
    }
    public void insert(NhaCungCap_NguyenLieu cap_NguyenLieu){
        try {
            Connection conn=jdbcUtil.getConnection();
            String sql="INSERT INTO NHACUNGCAP"+"(MaNCC,TenNCC,DiaChi,SDT,Email)"+"VALUES(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, cap_NguyenLieu.getMancc());
            ps.setString(2, cap_NguyenLieu.getTenncc());
            ps.setString(3, cap_NguyenLieu.getDiachi());
            ps.setString(4, cap_NguyenLieu.getSdt());
            ps.setString(5, cap_NguyenLieu.getEmail());
            ps.execute();
        } catch (SQLException ex) {
           ex.printStackTrace();
    
    
        
    }catch (Exception ex) {
            ex.printStackTrace();
        }
        
    
    
    
}
    public void delete(String id){
        try {
            Connection conn=jdbcUtil.getConnection();
            String sql="DELETE FROM NHACUNGCAP where Id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    
    
    }
    public void update(String id, NhaCungCap_NguyenLieu cap_NguyenLieu){
    try {
            Connection conn=jdbcUtil.getConnection();
            String sql="UPDATE NHACUNGCAP SET MaNCC =?, TenNCC=?, DiaChi=?, SDT=?, Email=? WHERE Id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, cap_NguyenLieu.getMancc());
            ps.setString(2, cap_NguyenLieu.getTenncc());
            ps.setString(3, cap_NguyenLieu.getDiachi());
            ps.setString(4, cap_NguyenLieu.getSdt());
            ps.setString(5, cap_NguyenLieu.getEmail());
            ps.setString(6, id);
            ps.execute();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    
    
    }
}
