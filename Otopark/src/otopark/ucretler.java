/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otopark;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import otopark.AnaEkran;
import otopark.NavigationManager;
import java.sql.ResultSet;


public class ucretler extends javax.swing.JFrame {

 
    /**
     * Creates new form ucretler
     */
    public ucretler() {
        initComponents();
        sadeceSayisalGiriseIzinVer(saatlik_ucret);
sadeceSayisalGiriseIzinVer(gunluk_ucret);
sadeceSayisalGiriseIzinVer(aylik_ucret);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/transparent_car_icon_100x100.png")));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/taxi_icon_100x100.png")));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/motorcycle_icon_100x100.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/shipping_icon_white_lines_100x100.png")));
        geri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon_klasoru/6820523_back_interface_ui_ux_icon.png")));
        this.setResizable(false);           // Büyütmeyi engeller
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(javax.swing.JFrame.NORMAL);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otomobil", "Motosiklet", "Taksi", "Kamyonet" }));
        roundedPanel_Kamyonet.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            roundedPanel_KamyonetMouseClicked(evt);
        }
    });
        saatlik_ucret.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyReleased(java.awt.event.KeyEvent evt) {
            try {
                double saatlik = Double.parseDouble(saatlik_ucret.getText().trim());
                double gunluk = saatlik * 24;
                double aylik = saatlik * 720;
                gunluk_ucret.setText(String.format("%.2f", gunluk));
                aylik_ucret.setText(String.format("%.2f", aylik));
            } catch (NumberFormatException e) {
                gunluk_ucret.setText("");
                aylik_ucret.setText("");
            }
        }
    });
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new otopark.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        roundedPanel_Otomobil = new otopark.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roundedPanel_Taksi = new otopark.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roundedPanel_Motosiklet = new otopark.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        geri = new javax.swing.JButton();
        kaydet = new javax.swing.JButton();
        guncellebutton = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        aylik_ucret = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gunluk_ucret = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saatlik_ucret = new javax.swing.JTextField();
        roundedPanel_Kamyonet = new otopark.RoundedPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roundedPanel1.setBackground(new java.awt.Color(30, 30, 47));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fiyat Belirleme");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otomobil", "Motosiklet", "Taksi", "Kamyonet", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Araç Türü");

        roundedPanel_Otomobil.setBackground(new java.awt.Color(18, 32, 47));
        roundedPanel_Otomobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedPanel_OtomobilMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\icon klasörü\\transparent_car_icon_100x100.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Otomobil");

        javax.swing.GroupLayout roundedPanel_OtomobilLayout = new javax.swing.GroupLayout(roundedPanel_Otomobil);
        roundedPanel_Otomobil.setLayout(roundedPanel_OtomobilLayout);
        roundedPanel_OtomobilLayout.setHorizontalGroup(
            roundedPanel_OtomobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_OtomobilLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(roundedPanel_OtomobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        roundedPanel_OtomobilLayout.setVerticalGroup(
            roundedPanel_OtomobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_OtomobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        roundedPanel_Taksi.setBackground(new java.awt.Color(50, 40, 20));
        roundedPanel_Taksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedPanel_TaksiMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\icon klasörü\\taxi_icon_100x100.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Taksi");

        javax.swing.GroupLayout roundedPanel_TaksiLayout = new javax.swing.GroupLayout(roundedPanel_Taksi);
        roundedPanel_Taksi.setLayout(roundedPanel_TaksiLayout);
        roundedPanel_TaksiLayout.setHorizontalGroup(
            roundedPanel_TaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel_TaksiLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(roundedPanel_TaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel_TaksiLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27))
        );
        roundedPanel_TaksiLayout.setVerticalGroup(
            roundedPanel_TaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_TaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundedPanel_Motosiklet.setBackground(new java.awt.Color(40, 40, 40));
        roundedPanel_Motosiklet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedPanel_MotosikletMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\icon klasörü\\motorcycle_icon_100x100.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Motosiklet");

        javax.swing.GroupLayout roundedPanel_MotosikletLayout = new javax.swing.GroupLayout(roundedPanel_Motosiklet);
        roundedPanel_Motosiklet.setLayout(roundedPanel_MotosikletLayout);
        roundedPanel_MotosikletLayout.setHorizontalGroup(
            roundedPanel_MotosikletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_MotosikletLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(roundedPanel_MotosikletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundedPanel_MotosikletLayout.setVerticalGroup(
            roundedPanel_MotosikletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_MotosikletLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        geri.setBackground(new java.awt.Color(30, 30, 47));
        geri.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        geri.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\icon klasörü\\6820523_back_interface_ui_ux_icon.png")); // NOI18N
        geri.setBorder(null);
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        kaydet.setBackground(new java.awt.Color(102, 102, 102));
        kaydet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kaydet.setText("Kaydet");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });

        guncellebutton.setBackground(new java.awt.Color(102, 102, 102));
        guncellebutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guncellebutton.setText("Güncelle");
        guncellebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellebuttonActionPerformed(evt);
            }
        });

        temizle.setBackground(new java.awt.Color(102, 102, 102));
        temizle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(30, 30, 47));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));

        aylik_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aylik_ucretActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Aylık Ücret :");

        gunluk_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunluk_ucretActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Günlük Ücret :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Saatlik Ücret :");

        saatlik_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saatlik_ucretActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saatlik_ucret, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(aylik_ucret)
                    .addComponent(gunluk_ucret))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saatlik_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gunluk_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aylik_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundedPanel_Kamyonet.setBackground(new java.awt.Color(60, 60, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\icon klasörü\\shipping_icon_white_lines_100x100.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kamyonet");

        javax.swing.GroupLayout roundedPanel_KamyonetLayout = new javax.swing.GroupLayout(roundedPanel_Kamyonet);
        roundedPanel_Kamyonet.setLayout(roundedPanel_KamyonetLayout);
        roundedPanel_KamyonetLayout.setHorizontalGroup(
            roundedPanel_KamyonetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_KamyonetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
            .addGroup(roundedPanel_KamyonetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel_KamyonetLayout.setVerticalGroup(
            roundedPanel_KamyonetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel_KamyonetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(roundedPanel_Otomobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roundedPanel_Taksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(roundedPanel_Motosiklet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(roundedPanel_Kamyonet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(kaydet)
                        .addGap(46, 46, 46)
                        .addComponent(guncellebutton)
                        .addGap(42, 42, 42)
                        .addComponent(temizle)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundedPanel_Taksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel_Otomobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel_Motosiklet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel_Kamyonet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kaydet)
                            .addComponent(guncellebutton)
                            .addComponent(temizle))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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
                .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gunluk_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunluk_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gunluk_ucretActionPerformed

    private void aylik_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aylik_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aylik_ucretActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      
     String model = jComboBox1.getSelectedItem().toString().trim();

if (model.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Lütfen bir araç türü seçiniz.");
    return;
}

try {
   Connection con = DBConnection.getConnection();


    // Seçilen model türüne göre ücret bilgilerini getir
    String sql = "SELECT saatlik, gunluk, aylik FROM ucret_bilgisi WHERE model_tur = ?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, model);

    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        // Ücret bilgilerini form alanlarına yaz
        saatlik_ucret.setText(String.valueOf(rs.getDouble("saatlik")));
        gunluk_ucret.setText(String.valueOf(rs.getDouble("gunluk")));
        aylik_ucret.setText(String.valueOf(rs.getDouble("aylik")));
    } else {
        // Bu araç türü için kayıt yoksa alanları boş bırak
        saatlik_ucret.setText("");
        gunluk_ucret.setText("");
        aylik_ucret.setText("");
        JOptionPane.showMessageDialog(null, "Seçilen araç türü için ücret bilgisi bulunamadı.");
    }

    con.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Veri alınamadı: " + e.getMessage());
    e.printStackTrace();
}
// Seçime göre panel arka plan renklerini değiştir
switch (model.toLowerCase()) {
    case "otomobil" -> {
        roundedPanel_Otomobil.setBackground(new Color(35, 99, 180));
        roundedPanel_Taksi.setBackground(new Color(50, 40, 20));
        roundedPanel_Motosiklet.setBackground(new Color(40, 40, 40));
        roundedPanel_Kamyonet.setBackground(new Color(60, 60, 60));
    }
    case "taksi" -> {
        roundedPanel_Otomobil.setBackground(new Color(18, 32, 47));
        roundedPanel_Taksi.setBackground(new Color(255, 193, 7));
        roundedPanel_Motosiklet.setBackground(new Color(40, 40, 40));
        roundedPanel_Kamyonet.setBackground(new Color(60, 60, 60));
    }
    case "motosiklet" -> {
        roundedPanel_Otomobil.setBackground(new Color(18, 32, 47));
        roundedPanel_Taksi.setBackground(new Color(50, 40, 20));
        roundedPanel_Motosiklet.setBackground(new Color(100, 100, 255));
        roundedPanel_Kamyonet.setBackground(new Color(60, 60, 60));
    }
    case "kamyonet" -> {
        roundedPanel_Otomobil.setBackground(new Color(18, 32, 47));
        roundedPanel_Taksi.setBackground(new Color(50, 40, 20));
        roundedPanel_Motosiklet.setBackground(new Color(40, 40, 40));
        roundedPanel_Kamyonet.setBackground(new Color(255, 153, 0));
    }
}


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void saatlik_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saatlik_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saatlik_ucretActionPerformed

    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed

    String model = jComboBox1.getSelectedItem().toString().trim();
    String saatlik = saatlik_ucret.getText().trim();
    String gunluk = gunluk_ucret.getText().trim();
    String aylik = aylik_ucret.getText().trim();

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/otopark_otomosyonu", "root", "");

        // Önceden aynı araç türü eklenmiş mi kontrol et
        String kontrolSQL = "SELECT COUNT(*) FROM ucret_bilgisi WHERE model_tur = ?";
        PreparedStatement kontrolPS = con.prepareStatement(kontrolSQL);
        kontrolPS.setString(1, model);
        ResultSet rs = kontrolPS.executeQuery();
        rs.next();
        int sayi = rs.getInt(1);

        if (sayi > 0) {
            JOptionPane.showMessageDialog(null, "Bu araç türü için zaten kayıt var. Lütfen güncelleyin.");
        } else {
            // Yeni kayıt ekle
            String insertUcret = "INSERT INTO ucret_bilgisi (model_tur, saatlik, gunluk, aylik) VALUES (?, ?, ?, ?)";
            PreparedStatement ps1 = con.prepareStatement(insertUcret);
            // DOUBLE PARSE İŞLEMLERİNDE VİRGÜLÜ NOKTAYA ÇEVİR
ps1.setDouble(2, Double.parseDouble(saatlik.replace(",", ".")));
ps1.setDouble(3, Double.parseDouble(gunluk.replace(",", ".")));
ps1.setDouble(4, Double.parseDouble(aylik.replace(",", ".")));


            ps1.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ücret bilgisi başarıyla eklendi!");

            // Alanları temizle
            saatlik_ucret.setText("");
            gunluk_ucret.setText("");
            aylik_ucret.setText("");
        }

        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage());
        e.printStackTrace();
    }


    }//GEN-LAST:event_kaydetActionPerformed

    private void guncellebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellebuttonActionPerformed
      String model = jComboBox1.getSelectedItem().toString().trim();
String saatlik = saatlik_ucret.getText().trim();
String gunluk = gunluk_ucret.getText().trim();
String aylik = aylik_ucret.getText().trim();

try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/otopark_otomosyonu", "root", "");

    // Seçilen araç türüne göre güncelleme işlemi
    String updateSQL = "UPDATE ucret_bilgisi SET saatlik = ?, gunluk = ?, aylik = ? WHERE model_tur = ?";
    PreparedStatement ps = con.prepareStatement(updateSQL);
     // DOUBLE PARSE İŞLEMLERİNDE VİRGÜLÜ NOKTAYA ÇEVİR
ps.setDouble(1, Double.parseDouble(saatlik.replace(",", ".")));
ps.setDouble(2, Double.parseDouble(gunluk.replace(",", ".")));
ps.setDouble(3, Double.parseDouble(aylik.replace(",", ".")));
ps.setString(4, model); 


    int updated = ps.executeUpdate();

    if (updated > 0) {
        JOptionPane.showMessageDialog(null, "Ücret bilgisi güncellendi!");
    } else {
        JOptionPane.showMessageDialog(null, "Bu araç türü için kayıt bulunamadı. Güncelleme yapılamadı.");
    }

    con.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Hata: " + e.getMessage());
    e.printStackTrace();
}

    }//GEN-LAST:event_guncellebuttonActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
         saatlik_ucret.setText("");
    gunluk_ucret.setText("");
    aylik_ucret.setText("");
    }//GEN-LAST:event_temizleActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        NavigationManager.navigateTo(this, new AnaEkran()); 
    }//GEN-LAST:event_geriActionPerformed

    private void roundedPanel_OtomobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel_OtomobilMouseClicked
        jComboBox1.setSelectedItem("Otomobil");
        roundedPanel_Otomobil.setBackground(new Color(35, 99, 180)); // seçili renk
        roundedPanel_Taksi.setBackground(new Color(50, 40, 20));     // varsayılan
        roundedPanel_Motosiklet.setBackground(new Color(40, 40, 40)); // varsayılan
        roundedPanel_Kamyonet.setBackground(new Color(60, 60, 60));
    }//GEN-LAST:event_roundedPanel_OtomobilMouseClicked

    private void roundedPanel_TaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel_TaksiMouseClicked
        jComboBox1.setSelectedItem("Taksi");
        roundedPanel_Taksi.setBackground(new Color(255, 193, 7));     // seçili renk
        roundedPanel_Otomobil.setBackground(new Color(18, 32, 47));   // varsayılan
        roundedPanel_Motosiklet.setBackground(new Color(40, 40, 40)); // varsayılan
        roundedPanel_Kamyonet.setBackground(new Color(60, 60, 60));
    }//GEN-LAST:event_roundedPanel_TaksiMouseClicked

    private void roundedPanel_MotosikletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel_MotosikletMouseClicked
        jComboBox1.setSelectedItem("Motosiklet");
        roundedPanel_Motosiklet.setBackground(new Color(100, 100, 255)); // seçili renk
        roundedPanel_Otomobil.setBackground(new Color(18, 32, 47));      // varsayılan
        roundedPanel_Taksi.setBackground(new Color(50, 40, 20)); 
        roundedPanel_Kamyonet.setBackground(new Color(60, 60, 60));
    }//GEN-LAST:event_roundedPanel_MotosikletMouseClicked

    public void roundedPanel_KamyonetMouseClicked(java.awt.event.MouseEvent evt) {
        jComboBox1.setSelectedItem("Kamyonet");
        roundedPanel_Kamyonet.setBackground(new Color(255, 153, 0)); 
        roundedPanel_Otomobil.setBackground(new Color(18, 32, 47));
        roundedPanel_Taksi.setBackground(new Color(50, 40, 20));
        roundedPanel_Motosiklet.setBackground(new Color(40, 40, 40));
    }
    private void sadeceSayisalGiriseIzinVer(javax.swing.JTextField textField) {
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
            java.util.logging.Logger.getLogger(ucretler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ucretler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ucretler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ucretler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ucretler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aylik_ucret;
    private javax.swing.JButton geri;
    private javax.swing.JButton guncellebutton;
    private javax.swing.JTextField gunluk_ucret;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaydet;
    private otopark.RoundedPanel roundedPanel1;
    private otopark.RoundedPanel roundedPanel_Kamyonet;
    private otopark.RoundedPanel roundedPanel_Motosiklet;
    private otopark.RoundedPanel roundedPanel_Otomobil;
    private otopark.RoundedPanel roundedPanel_Taksi;
    private javax.swing.JTextField saatlik_ucret;
    private javax.swing.JButton temizle;
    // End of variables declaration//GEN-END:variables
}

