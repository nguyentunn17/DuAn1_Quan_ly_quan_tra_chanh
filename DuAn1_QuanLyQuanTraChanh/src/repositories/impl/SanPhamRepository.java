/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.impl;

import domainmodels.KhuyenMai;
import domainmodels.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositories.ISanPhamRepository;

/**
 *
 * @author Hung
 */
public class SanPhamRepository implements ISanPhamRepository {

    @Override
    public ArrayList<domainmodels.SanPham> read() {
        ArrayList<SanPham> listsp = new ArrayList<>();
        try {
            Connection conn = utilities.jdbcUtil.getConnection();
            String query = "SELECT * FROM SANPHAM";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("masp");
                String ten = rs.getString("tensp");
                SanPham sp = new SanPham(id, ma, ten);
                listsp.add(sp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listsp;
    }

}
