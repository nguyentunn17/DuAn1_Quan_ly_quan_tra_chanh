/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import domainmodels.PhieuXuat_NguyenLieu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.PhieuXuat_NguyenLieu_sv;
import services.impl.PhieuXuat_NguyenLieu_lmpl;

/**
 *
 * @author Inspiron
 */
public class PhieuXuat_NguyenLieu_JFrame1 extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;
    private PhieuXuat_NguyenLieu_sv nguyenLieu_sv = new PhieuXuat_NguyenLieu_lmpl();

    /**
     * Creates new form PhieuNhap_NguyenLieu_JFrame
     */
    public PhieuXuat_NguyenLieu_JFrame1() {
        initComponents();
        loadTable();
    }

    public void loadTable() {
        defaultTableModel = (DefaultTableModel) this.tbl_phieuxuat.getModel();
        defaultTableModel.setRowCount(0);
        for (PhieuXuat_NguyenLieu pxnl : this.nguyenLieu_sv.getList()) {
            Object[] rowdata = {
                pxnl.getId(), pxnl.getMa(), pxnl.getNgayxuat(), pxnl.getDonvitinh(), pxnl.getSoluong(), pxnl.getDongia(), pxnl.thanhtien(), pxnl.getGhichu()

            };
            defaultTableModel.addRow(rowdata);

        }

    }

    private PhieuXuat_NguyenLieu getData() {
        String ma = txt_ma.getText().trim();
        String ngayxuat = txt_ngay.getText().trim();
        String donvi = txt_donvi.getText().trim();
        String soluong = txt_soluong.getText().trim();
        String dongia = txt_dongia.getText().trim();
        String ghichu = txt_ghichu.getText().trim();
        int soluongg = Integer.parseInt(soluong);
        double dongiaa = Double.parseDouble(dongia);
        if (ma.length() == 0
                || ngayxuat.length() == 0 || donvi.length() == 0 || ghichu.length() == 0) {
            JOptionPane.showMessageDialog(this, "Ko được để trống");
            return null;
        }
        PhieuXuat_NguyenLieu phieuXuat_NguyenLieu = new PhieuXuat_NguyenLieu(ma, ngayxuat, donvi, soluongg, dongiaa, ghichu);
        return phieuXuat_NguyenLieu;

    }

    private String getid(String ma) {
        for (PhieuXuat_NguyenLieu nguyenLieu : this.nguyenLieu_sv.getList()) {
            if (nguyenLieu.getMa().equals(ma)) {
                return nguyenLieu.getId();
            }
        }
        return null;
    }

    public void clear() {
        txt_dongia.setText("");
        txt_donvi.setText("");
        txt_ghichu.setText("");
        txt_ma.setText("");
        txt_ngay.setText("");
        txt_soluong.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_dongia = new javax.swing.JTextField();
        txt_soluong = new javax.swing.JTextField();
        txt_donvi = new javax.swing.JTextField();
        txt_ngay = new javax.swing.JTextField();
        txt_ma = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_ghichu = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_phieuxuat = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lbl_thanhtien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ma");

        jLabel3.setText("NgayXuat");

        jLabel4.setText("DonViTinh");

        jLabel5.setText("SoLuong");

        jLabel6.setText("DonGia");

        jLabel10.setText("GhiChu");

        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sua");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xoa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        tbl_phieuxuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Ma", "NgayXuat", "DonViTinh", "SoLuong", "DonGia", "ThanhTien", "GhiChu"
            }
        ));
        tbl_phieuxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phieuxuatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_phieuxuat);

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("ThanhTien : ");

        lbl_thanhtien.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_dongia)
                    .addComponent(txt_soluong)
                    .addComponent(txt_donvi)
                    .addComponent(txt_ngay)
                    .addComponent(txt_ma)
                    .addComponent(txt_ghichu, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_them))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sua))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_donvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btn_xoa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        PhieuXuat_NguyenLieu nguyenLieu = this.getData();
        this.nguyenLieu_sv.insert(nguyenLieu);
        this.loadTable();
        this.clear();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int row = tbl_phieuxuat.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa");
            return;
        }

        PhieuXuat_NguyenLieu nguyenLieu = this.getData();
        if (nguyenLieu == null) {
            return;
        }
        String ma = tbl_phieuxuat.getValueAt(row, 1).toString();
        this.nguyenLieu_sv.update(getid(ma), nguyenLieu);
        this.loadTable();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int row = tbl_phieuxuat.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần xóa");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Xác nhận xóa?");
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        String id = tbl_phieuxuat.getValueAt(row, 0).toString();
        this.nguyenLieu_sv.delete(id);
        this.loadTable();
        this.clear();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tbl_phieuxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_phieuxuatMouseClicked
        // TODO add your handling code here:
        int row = this.tbl_phieuxuat.getSelectedRow();
        if (row == -1) {
            return;
        }
        txt_ma.setText(this.tbl_phieuxuat.getValueAt(row, 1).toString());
        txt_ngay.setText(this.tbl_phieuxuat.getValueAt(row, 2).toString());
        txt_donvi.setText(this.tbl_phieuxuat.getValueAt(row, 3).toString());
        txt_soluong.setText(this.tbl_phieuxuat.getValueAt(row, 4).toString());
        txt_dongia.setText(this.tbl_phieuxuat.getValueAt(row, 5).toString());
        lbl_thanhtien.setText(this.tbl_phieuxuat.getValueAt(row, 6).toString());
        txt_ghichu.setText(this.tbl_phieuxuat.getValueAt(row, 7).toString());


    }//GEN-LAST:event_tbl_phieuxuatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat_NguyenLieu_JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat_NguyenLieu_JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat_NguyenLieu_JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat_NguyenLieu_JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuXuat_NguyenLieu_JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_thanhtien;
    private javax.swing.JTable tbl_phieuxuat;
    private javax.swing.JTextField txt_dongia;
    private javax.swing.JTextField txt_donvi;
    private javax.swing.JTextField txt_ghichu;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_ngay;
    private javax.swing.JTextField txt_soluong;
    // End of variables declaration//GEN-END:variables
}
