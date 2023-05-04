/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.HoaDonDichVuBLL;
import DTO.HoaDonDichVuDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TOAN
 */
public class formHoaDonDichVu extends javax.swing.JInternalFrame {

    /**
     * Creates new form formHoaDonDichVu
     */
    loadTable loadTbl = new loadTable();
    HoaDonDichVuBLL hoaDonBLL = new HoaDonDichVuBLL();
    public formHoaDonDichVu() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //Lấy độ dài màn hình
        
        int w=this.getSize().width;
        int h=this.getSize().height;
        int x=(dim.width-w)/2;
        int y=(dim.height-h)/2;
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhongDaCoHoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenDichVu = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnXoaHoaDon = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChiTietHoaDonDichVu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietDichVu = new javax.swing.JTable();
        btnLapHoaDon = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbbPhongChuaCoHoaDon = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hóa đơn dịch vụ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Phòng đã lập hóa đơn"));
        jPanel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(478, 148));

        tblPhongDaCoHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPhongDaCoHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongDaCoHoaDonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPhongDaCoHoaDon);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dịch Vụ"));
        jPanel1.setPreferredSize(new java.awt.Dimension(134, 196));

        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDichVu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));
        jPanel3.setPreferredSize(new java.awt.Dimension(435, 130));

        jLabel3.setText("Tên Dịch Vụ");

        jLabel4.setText("Đơn Giá");

        txtTenDichVu.setToolTipText("");
        txtTenDichVu.setEnabled(false);

        txtDonGia.setEnabled(false);
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã Dịch Vụ");

        jLabel6.setText("Đơn Vị Sử Dụng");

        txtMaDichVu.setEnabled(false);
        txtMaDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDichVuActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon("D:\\learn\\java\\DoAnJava\\src\\main\\java\\pic\\luu20.jpg")); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtDonGia))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnLuu)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Hóa Đơn Dịch Vụ");
        jLabel1.setPreferredSize(new java.awt.Dimension(207, 29));

        btnXoaHoaDon.setIcon(new javax.swing.ImageIcon("D:\\learn\\java\\DoAnJava\\src\\main\\java\\pic\\thungrac20.jpg")); // NOI18N
        btnXoaHoaDon.setText("Xóa hóa đơn");
        btnXoaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHoaDonActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon("D:\\learn\\java\\DoAnJava\\src\\main\\java\\pic\\thoat20.jpg")); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi Tiết Hóa Đơn Dịch Vụ"));
        jPanel6.setPreferredSize(new java.awt.Dimension(616, 215));

        tblChiTietHoaDonDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblChiTietHoaDonDichVu);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi Tiết Sử Dụng Dịch Vụ"));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(443, 189));

        tblChiTietDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Dịch vụ", "Đơn giá", "Số lượng", "Quy cách", "Tổng"
            }
        ));
        jScrollPane2.setViewportView(tblChiTietDichVu);

        btnLapHoaDon.setIcon(new javax.swing.ImageIcon("D:\\learn\\java\\DoAnJava\\src\\main\\java\\pic\\contract20.png")); // NOI18N
        btnLapHoaDon.setText("Lập hóa đơn");
        btnLapHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapHoaDonActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\learn\\java\\DoAnJava\\src\\main\\java\\pic\\thungrac20.jpg")); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(btnLapHoaDon)
                .addGap(55, 55, 55)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLapHoaDon)
                    .addComponent(btnXoa))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setPreferredSize(new java.awt.Dimension(152, 36));

        jLabel2.setText("Phòng chưa có hóa đơn");

        cbbPhongChuaCoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPhongChuaCoHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(cbbPhongChuaCoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbPhongChuaCoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(btnXoaHoaDon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThoat)
                            .addGap(159, 159, 159)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaHoaDon)
                    .addComponent(btnThoat))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(txtSoLuong.getText().equals("") || txtSoLuong.getText() == null){
            JOptionPane.showMessageDialog(rootPane, "Số lượng không được để trống");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblChiTietDichVu.getModel();
        if(tblChiTietDichVu.getColumnCount() > 0) {
            for(int i=0;i<tblChiTietDichVu.getRowCount();i++) {
                if(((String) tblChiTietDichVu.getValueAt(i, 1)).equals(txtTenDichVu.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Dịch vụ đã chọn, vui lòng chọn dịch vụ khác");
                    return;
                }
            }
        }
        
        model.addRow(new Object[]{
            txtMaDichVu.getText(),
            txtTenDichVu.getText(),
            txtDonGia.getText(),
            txtSoLuong.getText(),
            jLabel7.getText(),
            Integer.parseInt(txtDonGia.getText().replaceAll(",", "")) * Integer.parseInt(txtSoLuong.getText())
        });
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLapHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapHoaDonActionPerformed
        // TODO add your handling code here:
        try{
            if(tblChiTietDichVu.getRowCount() == 0){ //Nếu bảng table không có hàng nào được chọn 
                JOptionPane.showMessageDialog(rootPane, "Vui lòng thêm dịch vụ trước khi tạo hóa đơn");
                return;
            } 
            if(cbbPhongChuaCoHoaDon.getItemCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Hiện tại không còn phòng nào chưa lập hóa đơn");
                return;
            }
            
            HoaDonDichVuDTO hoaDonDichVuDTO = new HoaDonDichVuDTO();
            Date ngayHienTai = new Date(System.currentTimeMillis());
            java.text.SimpleDateFormat dayFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
            System.out.println(dayFormat.format(ngayHienTai));
            hoaDonDichVuDTO.setMaPhong(cbbPhongChuaCoHoaDon.getSelectedItem().toString());
            String ngayLap = dayFormat.format(ngayHienTai.getTime());
            System.out.println(ngayLap);
            hoaDonDichVuDTO.setNgayLapHoaDon(ngayLap);
            if(hoaDonBLL.ThemHoaDon(hoaDonDichVuDTO)>0) {
                for(int i=0;i<tblChiTietDichVu.getRowCount();i++) {
                    hoaDonDichVuDTO.setMaDichVu((String) tblChiTietDichVu.getValueAt(i, 0));
                    hoaDonDichVuDTO.setDonViSuDung(Integer.parseInt((String) tblChiTietDichVu.getValueAt(i, 3)));
                    hoaDonBLL.ThemChiTietDichVu(hoaDonDichVuDTO);
                }
                loadPhongChuaCoHoaDonTheoThang();
                JOptionPane.showMessageDialog(rootPane, "Thêm mới hóa đơn thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm mới hóa đơn thất bại");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(formHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnLapHoaDonActionPerformed

    private void btnXoaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHoaDonActionPerformed
        // TODO add your handling code here:
       try{
            if(tblChiTietHoaDonDichVu.getSelectedRow() == -1) { //Nếu như chưa chọn
                JOptionPane.showMessageDialog(rootPane, "Hãy chọn hóa đơn cần xóa");
                return;
            }
            
            int reply = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", title, JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                int index = tblChiTietHoaDonDichVu.getSelectedRow();
                HoaDonDichVuDTO hoaDonDichVuDTO = new HoaDonDichVuDTO();
                hoaDonDichVuDTO.setMaHoaDon((int) tblChiTietHoaDonDichVu.getValueAt(index, 0));
                if(hoaDonBLL.XoaHoaDon(hoaDonDichVuDTO) > 0){
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    loadPhongChuaCoHoaDonTheoThang();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa thất bại");
                }
            } else {
                return;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(formHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaHoaDonActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbbPhongChuaCoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbPhongChuaCoHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbPhongChuaCoHoaDonActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        try {
            loadTbl.loadJTable(hoaDonBLL.LoadDichVu(), tblDichVu);
            loadPhongChuaCoHoaDonTheoThang();
            Date ngayHienTai = new Date(System.currentTimeMillis());
            SimpleDateFormat dayFormat = new SimpleDateFormat("MM/yyyy");
            jLabel2.setText("Phòng chưa lập hóa đơn tháng: " + dayFormat.format(ngayHienTai.getTime()));
        } catch (Exception ex) {
            Logger.getLogger(formHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDichVuMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblDichVu.getSelectedRow();//lấy giá trị index của hàng  được chọn
            HoaDonDichVuDTO hoaDonDichVuDTO = new HoaDonDichVuDTO();
            hoaDonDichVuDTO.setDichVu((String) tblDichVu.getValueAt(index, 0));//Gán giá trị dịch vụ là hàng thứ index và cột thứ 0
            ResultSet rs = hoaDonBLL.LoadDichVuTheoMa(hoaDonDichVuDTO);

            while (rs.next())//lặp tất cả các hàng trong resultSet
            {
                //lần lượt chạy từng hàng trong resultSet và load các cột tương ứng vào các textfield
                txtMaDichVu.setText(rs.getString(1).toString());
                txtTenDichVu.setText(rs.getString(2).toString());
                txtDonGia.setText(rs.getString(3).toString());
                jLabel7.setText(rs.getString(4).toString());
                //Nếu như dịch vụ là những dịch vụ trả tiền mặc định theo tháng 
                if (txtTenDichVu.getText().toString().equals("Điện") || txtTenDichVu.getText().toString().equals("Nước (máy)")) {
                    txtSoLuong.setText("");//bỏ gán giá trị mặc dịnh cho textfiled
                    txtSoLuong.setEnabled(true);//enable textfield để người dùng nhập vào
                } else {
                    txtSoLuong.setText("1");//Mặc định gán giá trị cho đơn vi sử dụng là 1
                    txtSoLuong.setEnabled(false);//disable textfeild không cho người dùng sửa
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(formHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblDichVuMouseClicked

    private void txtMaDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDichVuActionPerformed

    private void tblPhongDaCoHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongDaCoHoaDonMouseClicked
        // TODO add your handling code here:
        try{
            int index = tblPhongDaCoHoaDon.getSelectedRow();
            Date ngayHienTai = new Date(System.currentTimeMillis());
            SimpleDateFormat dayFormat = new SimpleDateFormat("MM/yyyy");
            HoaDonDichVuDTO hoaDonDichVuDTO = new HoaDonDichVuDTO();
            hoaDonDichVuDTO.setMaPhong((String) tblPhongDaCoHoaDon.getValueAt(index, 0 ));
            hoaDonDichVuDTO.setNgayLapHoaDon(dayFormat.format(ngayHienTai.getTime()));
            loadTbl.loadJTable(hoaDonBLL.LoadCT_DICHVU(hoaDonDichVuDTO), tblChiTietHoaDonDichVu);
            
        } catch (Exception ex) {
            Logger.getLogger(formHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblPhongDaCoHoaDonMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblChiTietDichVu.getModel();
        if(tblChiTietDichVu.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn dịch vụ cần xóa");
            return;
        }
        
        if(tblChiTietDichVu.getRowCount() > 0) {
            for(int i=0;i<tblChiTietDichVu.getRowCount(); i++) {
                if(tblChiTietDichVu.getSelectedRow() == i) {
                    model.removeRow(i);
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void loadPhongChuaCoHoaDonTheoThang() throws Exception{
        Date ngayHienTai = new Date(System.currentTimeMillis());
        java.text.SimpleDateFormat dayFormat = new java.text.SimpleDateFormat("dd/MM/yyyy"); //Khai báo định dạng ngày tháng
        HoaDonDichVuDTO hoaDonDichVuDTO = new HoaDonDichVuDTO();
        hoaDonDichVuDTO.setNgayLapHoaDon(dayFormat.format(ngayHienTai.getTime()));
        loadTbl.loadJcombobox(hoaDonBLL.LoadPhongChuaCoHoaDon(hoaDonDichVuDTO), cbbPhongChuaCoHoaDon, "MaPhong");
        loadTbl.loadJTable(hoaDonBLL.LoadPhongDaCoHoaDon(hoaDonDichVuDTO), tblPhongDaCoHoaDon);
    }
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
            java.util.logging.Logger.getLogger(formHoaDonDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formHoaDonDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formHoaDonDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formHoaDonDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formHoaDonDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLapHoaDon;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaHoaDon;
    private javax.swing.JComboBox<String> cbbPhongChuaCoHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblChiTietDichVu;
    private javax.swing.JTable tblChiTietHoaDonDichVu;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTable tblPhongDaCoHoaDon;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenDichVu;
    // End of variables declaration//GEN-END:variables
}