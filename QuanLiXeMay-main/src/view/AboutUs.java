/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author
 */
public class AboutUs extends javax.swing.JDialog {

    /**
     * Creates new form AddAccount
     */
//    private AccountForm homeAcc;

    public AboutUs() {
                initComponents();
        setLocationRelativeTo(null);
        jTextArea1.setLineWrap(true); // Bật chế độ wrap
        jTextArea1.setWrapStyleWord(true); // Wrap theo từ, không cắt từ giữa chừng
        jTextArea1.setFocusable(false);
        jTextArea1.setText("Công ty nước XYZ cung cấp nước cho 2 đối tượng khách hàng: sinh hoạt và kinh doanh. Thông tin bao gồm:\n" +
"\n" +
"- Sinh hoạt gồm: Mã khách hàng, họ tên, đơn giá, định mức:\n" +
"\n" +
"- Mỗi tháng sẽ ghi nhận lượng nước tiêu thụ của khách hàng trong tháng.\n" +
"\n" +
"- Nếu lượng nước tiêu thụ <= định mức thì thành tiền - lượng nước tiêu thụ \" đơn giả\n" +
"\n" +
"- Ngược lại: thành tiền = lượng nước tiêu thụ * đơn giá định mức + lượng nước tiêu thụ vượt định mức đơn giá * 1.5.\n" +
"\n" +
"- Kinh doanh: Mã khách hàng, họ tên, đơn giá, loại kinh doanh:\n" +
"\n" +
"- Mỗi tháng sẽ ghi nhận lượng nước tiêu thụ của khách hàng trong tháng.\n" +
"\n" +
"- Mỗi loại kinh doanh sẽ có hệ số: 5%, 10% hoặc 15%\n" +
"\n" +
"- Thành tiền - lượng nước tiêu thụ\" đơn giá.\n" +
"\n" +
"- Khi lượng nước tiêu thụ vượt 500 m² thì thành tiền = lượng nước tiêu thụ ở đơn giá và giảm giá theo loại kinh doanh.\n" +
"\n" +
"Mỗi khách hàng có một danh sách để lưu lại lượng nước tiêu thụ của mỗi tháng trong năm (Vi\n" +
"- Thành tiên - lượng nước tiêu thụ * đơn giả.\n" +
"\n" +
"- Khi lượng nước tiêu thụ vượt 500 m² thì thành tiền = lượng nước tiêu thụ * đơn giá và giảm giá theo loại kinh doanh.\n" +
"\n" +
"Mỗi khách hàng có một danh sách để lưu lại lượng nước tiêu thụ của mỗi tháng trong năm (Vĩ dụ: ArrayList) và danh sách chỉ lưu trữ trong một năm, sang đầu năm mới sẽ trở lại từ đầu (ArrayList bằng rồng).\n" +
"\n" +
"Hãy dùng ngôn ngữ lập trình Java để thực hiện các yêu cầu sau:\n" + "");
//        homeAcc = (AccountForm) parent;
//        Account acc = homeAcc.getAccountSelect();
//        txtfullname.setText(acc.getFullName());
//        txtusername.setText(acc.getUser());
//        txtusername.setEditable(false);
//        txtEmail.setText(acc.getEmail());
//        vaitro.setSelectedItem(acc.getRole());
//        trangthai.setSelectedIndex(acc.getStatus());
//        jTextArea1.setText(LoadData());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About us");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 128, 128));
        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel1.setText("   About us");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextArea1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseEntered
        // TODO add your handling code here:
        jTextArea1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mupthui1.jpg")));
      
    }//GEN-LAST:event_jTextArea1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
