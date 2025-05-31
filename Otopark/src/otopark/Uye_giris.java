/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otopark;

import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static otopark.Session.kullaniciId;

/**
 *
 * @author asus
 */
public class Uye_giris extends javax.swing.JFrame {

    private JFrame Otopark_Girs;

    /**
     * Creates new form Uye_giris
     */
    public Uye_giris() {
        initComponents();  
        sadeceSayisalGiriseIzinVer(telefon_alani);
         sadeceSayisalGiriseIzinVer(uye_no);

// GUI bileşenleri oluşturuluyor
        veritabaniBaglantiKur();         // Veritabanı bağlantısı kuruluyor
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/user_icon_33x33.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/ad_icon_33x33.png")));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/soyad_icon_33x33.png")));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/telephone_icon_33x33_resized.png")));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/address_icon_33x33.png")));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/6820523_back_interface_ui_ux_icon.png")));
        java.net.URL varsayilanIcon = getClass().getResource("/otopark/icon_klasoru/red_car_icon_200px.png");
        if (varsayilanIcon != null) {
            jLabel17.setIcon(new javax.swing.ImageIcon(varsayilanIcon));
        } else {
            System.err.println("Varsayılan ikon bulunamadı!");
        }
        this.setResizable(false);           // Büyütmeyi engeller
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(javax.swing.JFrame.NORMAL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new otopark.RoundedPanel();
        roundedPanel2 = new otopark.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        uye_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefon_alani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        roundedPanel3 = new otopark.RoundedPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox_Marka = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uyeListesi_button = new javax.swing.JButton();
        kaydetbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roundedPanel1.setBackground(new java.awt.Color(24, 26, 32));

        roundedPanel2.setBackground(new java.awt.Color(30, 30, 47));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ÜYE NO :");

        uye_no.setBackground(new java.awt.Color(44, 45, 55));
        uye_no.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uye_no.setForeground(new java.awt.Color(255, 255, 255));
        uye_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_noActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AD :");

        jTextField2.setBackground(new java.awt.Color(44, 45, 55));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SOY ADI:");

        jTextField3.setBackground(new java.awt.Color(44, 45, 55));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TELEFON:");

        telefon_alani.setBackground(new java.awt.Color(44, 45, 55));
        telefon_alani.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefon_alani.setForeground(new java.awt.Color(255, 255, 255));
        telefon_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefon_alaniActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADRES:");

        jTextField4.setBackground(new java.awt.Color(44, 45, 55));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Plakası");

        jTextField7.setBackground(new java.awt.Color(44, 45, 55));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Markası");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modeli");

        jTextField8.setBackground(new java.awt.Color(44, 45, 55));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ÜYE BİLGİLERİ");

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ARAÇ BİLGİLERİ");

        jComboBox_Marka.setBackground(new java.awt.Color(44, 45, 55));
        jComboBox_Marka.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox_Marka.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_Marka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Toyota", "BMW", "Mercedes", "Renault", "Hyundai", "Volkswagen" }));
        jComboBox_Marka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_MarkaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(uye_no, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefon_alani)
                                .addComponent(jTextField4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox_Marka, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117))))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(14, 14, 14)
                        .addComponent(jComboBox_Marka, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38)
                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(roundedPanel2Layout.createSequentialGroup()
                                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(10, 10, 10)
                                        .addComponent(uye_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))
                                .addGap(6, 6, 6)
                                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                                        .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(roundedPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel14))
                                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telefon_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15))))))
                .addGap(32, 32, 32))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ÜYE KAYIT EKRANI");

        uyeListesi_button.setBackground(new java.awt.Color(102, 102, 102));
        uyeListesi_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uyeListesi_button.setText("Üye Listesi");
        uyeListesi_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeListesi_buttonActionPerformed(evt);
            }
        });

        kaydetbutton.setBackground(new java.awt.Color(102, 102, 102));
        kaydetbutton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        kaydetbutton.setText("Kaydet");
        kaydetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetbuttonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(24, 26, 32));
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(uyeListesi_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(kaydetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kaydetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyeListesi_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kaydetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetbuttonActionPerformed
veritabaniBaglantiKur(); // Bağlantıyı sağla

// Kullanıcıdan alınan veriler
int kullaniciId = Session.kullaniciId;
 // Giriş yapan kullanıcıdan alınmalı
String uyeNo = uye_no.getText(); // Kullanıcının kendi verdiği üye numarası
String adi = jTextField2.getText();
String soyadi = jTextField3.getText();
String telefon = telefon_alani.getText();
String adres = jTextField4.getText();
String plaka = jTextField7.getText();
String model = jTextField8.getText();
String marka = jComboBox_Marka.getSelectedItem().toString();

try {
    // 1. ÜYE BİLGİLERİNİ EKLE
    String sql1 = "INSERT INTO uye_bilgisi (kullanici_id, uye_no, ad, soy_Ad, tel_No, adres) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pst1 = con.prepareStatement(sql1);
    pst1.setInt(1, kullaniciId);
    pst1.setString(2, uyeNo); // dikkat: varchar ise string, int ise parseInt yap
    pst1.setString(3, adi);
    pst1.setString(4, soyadi);
    pst1.setString(5, telefon);
    pst1.setString(6, adres);
    pst1.executeUpdate();

    // 2. ARAÇ BİLGİLERİNİ EKLE
    String sql2 = "INSERT INTO arac_bilgi (kullanici_id, uye_no, plaka, marka, model) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement pst2 = con.prepareStatement(sql2);
    pst2.setInt(1, kullaniciId);
    pst2.setString(2, uyeNo);
    pst2.setString(3, plaka);
    pst2.setString(4, marka);
    pst2.setString(5, model);
    pst2.executeUpdate();

    JOptionPane.showMessageDialog(this, "Kayıt başarıyla eklendi!");

    // Form temizleme
    uye_no.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    telefon_alani.setText("");
    jTextField7.setText("");
    jTextField8.setText("");

} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Hata oluştu: " + e.getMessage());
}


    }//GEN-LAST:event_kaydetbuttonActionPerformed

    private void uye_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_noActionPerformed
        
    }//GEN-LAST:event_uye_noActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void telefon_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefon_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefon_alaniActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void uyeListesi_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeListesi_buttonActionPerformed
         UyeListesi liste = new UyeListesi();
    liste.setVisible(true);
    }//GEN-LAST:event_uyeListesi_buttonActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox_MarkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_MarkaActionPerformed
        String secilenMarka = (String) jComboBox_Marka.getSelectedItem();

    // İkonların bulunduğu klasör

    // Markaya göre dosya adını belirle
    String dosyaAdi = switch (secilenMarka) {
        case " " -> "red_car_icon_200px.png";
        case "Toyota" -> "toyota_icon.png";
        case "BMW" -> "bmw_icon.png";
        case "Mercedes" -> "mercedes_icon.png";
        case "Renault" -> "renault_icon.png";
        case "Hyundai" -> "hyundai_icon.png";
        case "Volkswagen" -> "volkswagen_icon.png";
        default -> "red_car_icon_200px.png"; // yedek ikon dosyası varsa
    };

    // Kaynak klasör yolu – src/otopark/icon_klasoru
    String resourcePath = "/otopark/icon_klasoru/" + dosyaAdi;
    java.net.URL iconURL = getClass().getResource(resourcePath);

    if (iconURL != null) {
        jLabel17.setIcon(new javax.swing.ImageIcon(iconURL));
    } else {
        // Hata varsa ikon yerine null göster, ya da log yazdır
        System.err.println("İkon bulunamadı: " + resourcePath);
        jLabel17.setIcon(null); // veya varsayılan ikon
    }
    }//GEN-LAST:event_jComboBox_MarkaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         NavigationManager.navigateTo(this, new AnaEkran());
    }//GEN-LAST:event_jButton2ActionPerformed

   Connection con = null;

public void veritabaniBaglantiKur() {
 
    con = DBConnection.getConnection();
}

  
public class UyeListesi extends JFrame {

    JTable table;
    Connection con;

    public UyeListesi() {
        setTitle("Üye Listesi");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        tabloyuDoldur();
    }

    private void tabloyuDoldur() {
        try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otopark_otomosyonu", "root", "");

              String sql ="SELECT * FROM uye_bilgisi WHERE kullanici_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, Session.kullaniciId); 
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Üye No", "Ad", "Soyad", "Telefon", "Adres"}, 0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("uye_no"),
                    rs.getString("ad"),
                    rs.getString("soy_Ad"),
                    rs.getString("tel_No"),
                    rs.getString("adres")
                });
            }

            table.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }
}private void sadeceSayisalGiriseIzinVer(javax.swing.JTextField textField) {
    textField.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent e) {
            char c = e.getKeyChar();

            // Sadece rakam, virgül ve backspace'e izin ver
            if (!Character.isDigit(c) && c != ',' && c != '\b') {
                e.consume(); // giriş engellenir
            }
        }
    });
}


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
            java.util.logging.Logger.getLogger(Uye_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uye_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uye_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uye_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uye_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_Marka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton kaydetbutton;
    private otopark.RoundedPanel roundedPanel1;
    private otopark.RoundedPanel roundedPanel2;
    private otopark.RoundedPanel roundedPanel3;
    private javax.swing.JTextField telefon_alani;
    private javax.swing.JButton uyeListesi_button;
    private javax.swing.JTextField uye_no;
    // End of variables declaration//GEN-END:variables
}
