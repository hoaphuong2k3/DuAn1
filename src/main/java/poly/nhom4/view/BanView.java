/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.nhom4.view;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poly.nhom4.reponse.BanReponse;
import poly.nhom4.service.QuanLyBanService;
import poly.nhom4.service.impl.QuanLyBanServiceIplm;

/**
 *
 * @author ACER
 */
public class BanView extends javax.swing.JFrame {

    ButtonGroup buttonGroup;
    private DefaultTableModel defaultTableModel;
    private final QuanLyBanService quanLyBanService;

    /**
     * Creates new form BanView
     */
    public BanView() {
        initComponents();
        rdTrangThai();
        quanLyBanService = new QuanLyBanServiceIplm();
        loadData();
    }

    public void rdTrangThai() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rdCoNguoi);
        buttonGroup.add(rdConTrong);
        rdConTrong.setSelected(true);
    }

    public void loadData() {
        defaultTableModel = (DefaultTableModel) tbBan.getModel();
        defaultTableModel.setRowCount(0);
        List<BanReponse> list = quanLyBanService.getBanAll();
        for (BanReponse x : list) {
            defaultTableModel.addRow(
                    new Object[]{
                        x.getMaBan(), x.getTenBan(), x.getSoNguoiMax(), x.trangThai()
                    });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtMaBan = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMaBan = new javax.swing.JLabel();
        lblTenBan = new javax.swing.JLabel();
        lblSoNguoi = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        txtTenBan = new javax.swing.JTextField();
        txtSoNguoi = new javax.swing.JTextField();
        rdCoNguoi = new javax.swing.JRadioButton();
        rdConTrong = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bàn", "Tên bàn", "Số người max", "Trạng thái"
            }
        ));
        tbBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan);

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtMaBan.setText("       ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("QUẢN LÝ BÀN");

        lblMaBan.setText("Mã bàn");

        lblTenBan.setText("Tên bàn");

        lblSoNguoi.setText("Số người max");

        lblTrangThai.setText("Trạng thái");

        rdCoNguoi.setText("Có người");

        rdConTrong.setText("Còn trống");

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenBan)
                                    .addComponent(lblSoNguoi)
                                    .addComponent(lblMaBan))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenBan)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnUpdate)
                                                .addComponent(rdConTrong))
                                            .addGap(48, 48, 48)
                                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rdCoNguoi)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                    .addComponent(btnDelete)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(txtSoNguoi)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaBan)
                    .addComponent(txtMaBan))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenBan)
                    .addComponent(txtTenBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoNguoi)
                    .addComponent(txtSoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(rdConTrong)
                    .addComponent(rdCoNguoi))
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanMouseClicked
        int row = tbBan.getSelectedRow();
        txtMaBan.setText(tbBan.getValueAt(row, 0).toString());
        txtTenBan.setText(tbBan.getValueAt(row, 1).toString());
        txtSoNguoi.setText(tbBan.getValueAt(row, 2).toString());
        if (tbBan.getValueAt(row, 3).toString().equalsIgnoreCase("Có người")) {
            rdCoNguoi.setSelected(true);
        } else if (tbBan.getValueAt(row, 3).toString().equalsIgnoreCase("Còn trống")) {
            rdConTrong.setSelected(true);
        } else {
            JOptionPane.showMessageDialog(this, "Không có trạng thái");
        }
    }//GEN-LAST:event_tbBanMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String ten = txtTenBan.getText().trim();
        Integer trangThai = 0;
        if (rdCoNguoi.isSelected()) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }
        if (txtTenBan.getText().trim().length() == 0 || txtSoNguoi.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
        } else {
            Integer soNguoi = Integer.parseInt(txtSoNguoi.getText().trim());
            if (soNguoi < 1 || soNguoi > 10) {
                JOptionPane.showMessageDialog(this, "Số người không hợp lệ");
            } else {
                BanReponse banReponse = new BanReponse();
                banReponse.setTenBan(ten);
                banReponse.setSoNguoiMax(soNguoi);
                banReponse.setTrangThai(trangThai);
                quanLyBanService.add(banReponse);
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadData();
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String ten = txtTenBan.getText().trim();
        Integer trangThai = 0;
        if (rdCoNguoi.isSelected()) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }
        if (txtTenBan.getText().trim().length() == 0 || txtSoNguoi.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
        } else {
            Integer soNguoi = Integer.parseInt(txtSoNguoi.getText().trim());
            Integer maBan = Integer.parseInt(txtMaBan.getText().trim());
            if (soNguoi < 1 || soNguoi > 10) {
                JOptionPane.showMessageDialog(this, "Số người không hợp lệ");
            } else {
                BanReponse banReponse = new BanReponse();
                banReponse.setMaBan(maBan);
                banReponse.setTenBan(ten);
                banReponse.setSoNguoiMax(soNguoi);
                banReponse.setTrangThai(trangThai);
                if (quanLyBanService.update(banReponse)) {
                    JOptionPane.showMessageDialog(this, "Update thành công");
                    loadData();
                } else {
                    System.out.println("sai");
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tbBan.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn data cần xóa");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không", "Delete", 0);
            if (choice == JOptionPane.YES_OPTION) {
                BanReponse banReponse = quanLyBanService.getBanAll().get(row);
                quanLyBanService.delete(banReponse);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                txtMaBan.setText("");
                txtTenBan.setText("");
                txtSoNguoi.setText("");
                loadData();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaBan;
    private javax.swing.JLabel lblSoNguoi;
    private javax.swing.JLabel lblTenBan;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JRadioButton rdCoNguoi;
    private javax.swing.JRadioButton rdConTrong;
    private javax.swing.JTable tbBan;
    private javax.swing.JLabel txtMaBan;
    private javax.swing.JTextField txtSoNguoi;
    private javax.swing.JTextField txtTenBan;
    // End of variables declaration//GEN-END:variables
}
