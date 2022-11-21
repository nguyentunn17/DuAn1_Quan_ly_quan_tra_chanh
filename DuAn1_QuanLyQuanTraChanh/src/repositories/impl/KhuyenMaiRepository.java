package repositories.impl;

import domainmodels.KhuyenMai;
import java.util.ArrayList;
import repositories.IKhuyenMaiRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhuyenMaiRepository implements IKhuyenMaiRepository {

    @Override
    public ArrayList<KhuyenMai> read() {
        ArrayList<KhuyenMai> listkm = new ArrayList<>();
        try {
            Connection conn = utilities.jdbcUtil.getConnection();
            String query = "SELECT * FROM KHUYENMAI";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String hinhThuc = rs.getString("hinhthuc");
                Double giaTri = rs.getDouble("giatri");
                Date ngayBatDau = rs.getDate("ngayBatDau");
                Date ngayKetThuc = rs.getDate("ngayKetThuc");
                int trangThai = rs.getInt("trangThai");
                Double giaKhiGiam = rs.getDouble("dongiakhigiam");
                KhuyenMai km = new KhuyenMai(id, ma, ten, hinhThuc, giaTri, ngayBatDau, ngayKetThuc, trangThai, giaKhiGiam);
                listkm.add(km);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listkm;
    }

    @Override
    public void create(KhuyenMai km) {
        try {
            Connection conn = utilities.jdbcUtil.getConnection();
            String query = "INSERT INTO KHUYENMAI(ma,ten,hinhthuc,giatri,ngaybatdau,ngayketthuc,trangthai) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setObject(1, km.getMa());
            ps.setObject(2, km.getTen());
            ps.setObject(3, km.getHinhThuc());
            ps.setObject(4, km.getGiaTri());
            ps.setObject(5, km.getNgayBatDau());
            ps.setObject(6, km.getNgayKetThuc());
            ps.setObject(7, km.getTrangThai());

            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(KhuyenMai km, String id) {
        try {
            Connection conn = utilities.jdbcUtil.getConnection();
            String query = "UPDATE KHUYENMAI SET ma=?,ten=?,hinhthuc=?,giatri=?,ngaybatdau=?,ngayketthuc=?,trangthai=? WHERE ID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setObject(1, km.getMa());
            ps.setObject(2, km.getTen());
            ps.setObject(3, km.getHinhThuc());
            ps.setObject(4, km.getGiaTri());
            ps.setObject(5, km.getNgayBatDau());
            ps.setObject(6, km.getNgayKetThuc());
            ps.setObject(7, km.getTrangThai());
            ps.setObject(8, id);

            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
