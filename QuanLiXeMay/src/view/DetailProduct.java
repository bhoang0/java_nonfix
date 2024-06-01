/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import dao.XeSoDAO;
import dao.TayGaDAO;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.XeSo;
import model.TayGa;

/**
 *
 * @author 
 */
public class DetailProduct extends javax.swing.JDialog {

    /**
     * Creates new form ThemSP
     */
    private ProductForm owner;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    public DetailProduct(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);       
        initComponents();
        setLocationRelativeTo(null);
        this.owner = (ProductForm) parent;
        if (this.owner.checkxeso()) {
            XeSo a = this.owner.getDetailXeSo();
            txtMaSanPham.setText(a.getMaXe());
            txtTenSanPham.setText(a.getTenXe());
            txtDonGia.setText(formatter.format(a.getGia())+"đ");
            txtTenDongCo.setText(a.gettenDongCo());
            txtPhanKhoi.setText(a.getphanKhoi());
            txtTieuThuNL.setText(a.gettieuThuNL());
            txtDoCaoYen.setText(a.getdoCaoYen());
            txtXuatXu.setText(a.getXuatXu());
            cbxloaisp.setSelectedIndex(0);
            txtDungTichBinhXang.setText(Double.toString(a.getdungTichbinhXang()));
            txtPhienBan.setText(a.getphienBan());
            txtSoLuong.setText(Integer.toString(a.getSoLuong()));
        } else {
            TayGa a = this.owner.getDetailTG();
            txtMaSanPham.setText(a.getMaXe());
            txtTenSanPham.setText(a.getTenXe());
            txtDonGia.setText(formatter.format(a.getGia())+"đ");
            txtTenDongCo.setText(a.gettenDongCo());
            txtPhanKhoi.setText(a.getphanKhoi());
            txtTieuThuNL.setText(a.gettieuThuNL());
            txtDoCaoYen.setText(a.getdoCaoYen());
            txtXuatXu.setText(a.getXuatXu());
            cbxloaisp.setSelectedIndex(1);
            txtCongSuat.setText(a.getcongSuat());
            txtKhoiLuong.setText(Integer.toString(a.getkhoiLuong()) + "W");
            txtSoLuong.setText(Integer.toString(a.getSoLuong()));
        }
    }
    

    private DetailProduct(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenDongCo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhanKhoi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTieuThuNL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDoCaoYen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxloaisp = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        xeso = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtDungTichBinhXang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPhienBan = new javax.swing.JTextField();
        tayga = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtCongSuat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtKhoiLuong = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtXuatXu = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm sản phẩm mới");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Mã sản phẩm");

        txtMaSanPham.setEnabled(false);

        jLabel3.setText("Tên sản phẩm");

        txtTenSanPham.setEnabled(false);

        jLabel4.setText("Đơn giá");

        txtDonGia.setEnabled(false);

        jLabel6.setText("Động cơ");

        txtTenDongCo.setEnabled(false);

        jLabel7.setText("Phân khối");

        txtPhanKhoi.setEnabled(false);

        jLabel8.setText("Tiêu thụ nhiên liệu");

        txtTieuThuNL.setEnabled(false);
        txtTieuThuNL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTieuThuNLActionPerformed(evt);
            }
        });

        jLabel9.setText("Độ cao yên xe");

        txtDoCaoYen.setEnabled(false);

        jLabel10.setText("Loại sản phẩm");

        cbxloaisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xe Số", "Tay ga" }));
        cbxloaisp.setEnabled(false);
        cbxloaisp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxloaispItemStateChanged(evt);
            }
        });
        cbxloaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxloaispActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());

        xeso.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Dung tích bình xăng");

        txtDungTichBinhXang.setEnabled(false);

        jLabel12.setText("Phiên bản");

        txtPhienBan.setEnabled(false);

        javax.swing.GroupLayout xesoLayout = new javax.swing.GroupLayout(xeso);
        xeso.setLayout(xesoLayout);
        xesoLayout.setHorizontalGroup(
            xesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDungTichBinhXang)
            .addGroup(xesoLayout.createSequentialGroup()
                .addGroup(xesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 98, Short.MAX_VALUE))
            .addComponent(txtPhienBan)
        );
        xesoLayout.setVerticalGroup(
            xesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xesoLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDungTichBinhXang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhienBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(xeso, "card2");

        tayga.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel13.setText("Công suất");

        txtCongSuat.setEnabled(false);
        txtCongSuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCongSuatActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel14.setText("Khối lượng");

        txtKhoiLuong.setEnabled(false);

        javax.swing.GroupLayout taygaLayout = new javax.swing.GroupLayout(tayga);
        tayga.setLayout(taygaLayout);
        taygaLayout.setHorizontalGroup(
            taygaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCongSuat)
            .addComponent(txtKhoiLuong)
            .addGroup(taygaLayout.createSequentialGroup()
                .addGroup(taygaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        taygaLayout.setVerticalGroup(
            taygaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taygaLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCongSuat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(tayga, "card2");

        jLabel15.setText("Xuất xứ");

        txtXuatXu.setEnabled(false);

        txtSoLuong.setEnabled(false);

        jLabel5.setText("Số lượng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(txtSoLuong))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTieuThuNL, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txtDoCaoYen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhanKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxloaisp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtXuatXu))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhanKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTieuThuNL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel15))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoCaoYen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 330));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxloaispItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxloaispItemStateChanged
        // TODO add your handling code here:
        if (cbxloaisp.getSelectedItem().equals("Xe Số")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.first(jPanel3);

        }

        if (cbxloaisp.getSelectedItem().equals("Tay ga")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.last(jPanel3);
        }
    }//GEN-LAST:event_cbxloaispItemStateChanged

    private void cbxloaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxloaispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxloaispActionPerformed

    private void txtTieuThuNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTieuThuNLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTieuThuNLActionPerformed

    private void txtCongSuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCongSuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCongSuatActionPerformed

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
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailProduct dialog = new DetailProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxloaisp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel xeso;
    private javax.swing.JPanel tayga;
    private javax.swing.JTextField txtTenDongCo;
    private javax.swing.JTextField txtKhoiLuong;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtPhienBan;
    private javax.swing.JTextField txtDoCaoYen;
    private javax.swing.JTextField txtDungTichBinhXang;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtCongSuat;
    private javax.swing.JTextField txtPhanKhoi;
    private javax.swing.JTextField txtTieuThuNL;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}
