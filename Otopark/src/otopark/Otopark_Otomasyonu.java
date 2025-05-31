
package otopark;


import java.awt.Color;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;



/**
 *
 * @author asus
 */
public class Otopark_Otomasyonu extends javax.swing.JPanel {
    static int kalanHak=3;
    

   
    public Otopark_Otomasyonu() {
        initComponents();
        
try {
    // Giriş butonu ikonu
    URL lockURL = getClass().getResource("/otopark/icon_klasoru/lock_icon.png");
    System.out.println("lock_icon: " + lockURL);
    if (lockURL != null) {
        giris.setIcon(new ImageIcon(lockURL));
    } else {
        System.out.println("lock_icon.png bulunamadı!");
    }

    // Kullanıcı ikonu
    URL userURL = getClass().getResource("/otopark/icon_klasoru/user_icon_white_50x50.png");
    System.out.println("user_icon: " + userURL);
    if (userURL != null) {
        jLabel2.setIcon(new ImageIcon(userURL));
    } else {
        System.out.println("user_icon_white_50x50.png bulunamadı!");
    }

    // Şifre ikonu
    URL padlockURL = getClass().getResource("/otopark/icon_klasoru/padlock_icon_white.png");
    System.out.println("padlock_icon: " + padlockURL);
    if (padlockURL != null) {
        sifre_text.setIcon(new ImageIcon(padlockURL));
    } else {
        System.out.println("padlock_icon_white.png bulunamadı!");
    }


    } catch (Exception e) {
        e.printStackTrace(); // hata varsa consola yaz
    }


        this.setPreferredSize(new java.awt.Dimension(319, 439));
        JLabel dummy = new JLabel();
this.add(dummy);         // Panele ekle
dummy.setFocusable(true);
dummy.requestFocusInWindow();
        // Kullanıcı Adı Placeholder
kulanici_adi.setText("Kullanıcı Adı");
kulanici_adi.setForeground(Color.GRAY);

kulanici_adi.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (kulanici_adi.getText().equals("Kullanıcı Adı")) {
            kulanici_adi.setText("");
            kulanici_adi.setForeground(Color.BLACK);
        }
    }
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (kulanici_adi.getText().isEmpty()) {
            kulanici_adi.setText("Kullanıcı Adı");
            kulanici_adi.setForeground(Color.GRAY);
        }
    }
});


// Şifre Placeholder için geçici olarak açık metin göster
sifre.setEchoChar((char) 0); // Gizleme kapalı
sifre.setText("Şifre");
sifre.setForeground(Color.GRAY);

sifre.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (String.valueOf(sifre.getPassword()).equals("Şifre")) {
            sifre.setText("");
            sifre.setForeground(Color.BLACK);
            sifre.setEchoChar('•'); // Gizleme aktif
        }
    }
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (String.valueOf(sifre.getPassword()).isEmpty()) {
            sifre.setText("Şifre");
            sifre.setForeground(Color.GRAY);
            sifre.setEchoChar((char) 0); // Tekrar göster
        }
    }
});

        saat();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel1 = new otopark.RoundedPanel();
        tarih_Zaman = new javax.swing.JLabel();
        limit = new javax.swing.JLabel();
        giris = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sifre_text = new javax.swing.JLabel();
        kulanici_adi = new javax.swing.JTextField();
        sifre = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        roundedPanel1.setBackground(new java.awt.Color(23, 59, 73));

        tarih_Zaman.setBackground(new java.awt.Color(255, 255, 255));
        tarih_Zaman.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tarih_Zaman.setForeground(new java.awt.Color(0, 255, 255));

        limit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        limit.setForeground(new java.awt.Color(255, 255, 255));
        limit.setText("Limitiniz : 3");

        giris.setBackground(new java.awt.Color(76, 175, 80));
        giris.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        giris.setForeground(new java.awt.Color(255, 255, 255));
        giris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otopark/icon.png"))); // NOI18N
        giris.setText("GİRİŞ   ");
        giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisActionPerformed(evt);
            }
        });

        cikis.setBackground(new java.awt.Color(255, 51, 51));
        cikis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cikis.setForeground(new java.awt.Color(255, 255, 255));
        cikis.setText("KAPAT");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tarih -  Saat");

        jButton1.setBackground(new java.awt.Color(38, 43, 43));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("KAYIT OL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Documents\\NetBeansProjects\\Otopark\\Otopark\\Otopark\\src\\otopark\\icon_klasoru\\user_icon_white_50x50.png")); // NOI18N

        sifre_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sifre_text.setForeground(new java.awt.Color(255, 255, 255));
        sifre_text.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Documents\\NetBeansProjects\\Otopark\\Otopark\\Otopark\\src\\otopark\\icon_klasoru\\padlock_icon_white.png")); // NOI18N

        kulanici_adi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kulanici_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kulanici_adiActionPerformed(evt);
            }
        });

        sifre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(tarih_Zaman, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(limit))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giris, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sifre_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kulanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(tarih_Zaman, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(kulanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre_text))
                .addGap(62, 62, 62)
                .addComponent(limit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giris, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void kulanici_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kulanici_adiActionPerformed
         

    }//GEN-LAST:event_kulanici_adiActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
       System.exit(0);

    }//GEN-LAST:event_cikisActionPerformed

    private void girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisActionPerformed
       String kullaniciAdi = kulanici_adi.getText().trim();
String sifreGirilen = new String(sifre.getPassword()).trim();

if (kullaniciAdi.isEmpty() || sifreGirilen.isEmpty() ||
    kullaniciAdi.equals("Kullanıcı Adı") || sifreGirilen.equals("Şifre")) {
    JOptionPane.showMessageDialog(this, "Lütfen kullanıcı adı ve şifre girin.");
    return;
}

try (java.sql.Connection conn = DBConnection.getConnection()) {
    String sql = "SELECT * FROM uye_kayit WHERE kullanici_adi = ? AND kullanici_sifre = ?";
    try (java.sql.PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, kullaniciAdi);
        pst.setString(2, sifreGirilen);
        try (java.sql.ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                //  kullanıcı_id'yi al ve oturuma ata
                Session.kullaniciId = rs.getInt("kullanici_id");

               
                new AnaEkran().setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
            } else {
                kalanHak--;
                limit.setText("Limitiniz : " + kalanHak);
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış.");
                  kulanici_adi.setText("");
    sifre.setText("");

                if (kalanHak == 0) {
                    JOptionPane.showMessageDialog(this, "Giriş hakkınız tükendi!");
                    System.exit(0);
                }
            }
        }
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
    e.printStackTrace();
}

    }//GEN-LAST:event_girisActionPerformed

    private void sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             JFrame anaEkran= new Kayit_Ol();
                anaEkran.setVisible(true);
                          //mevcut pencereyi kapat
                           JFrame frame =(JFrame)SwingUtilities.getWindowAncestor(this);
                          frame.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 private void saat() {
        // Saatin sürekli güncellenmesi için bir Timer başlatıyoruz.
        Timer saniye = new Timer(1000, e -> {
            // Her saniye çalışacak işlev
            SimpleDateFormat tarih = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String tarihSaat = tarih.format(new Date());
            tarih_Zaman.setText(tarihSaat);
        });
        saniye.start(); // Timer'ı başlatıyoruz.
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                JFrame frame = new JFrame("Otopark Girişi");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(new Otopark_Otomasyonu());
                frame.pack();
                frame.setResizable(false); // boyutlandırılamaz
                frame.setLocationRelativeTo(null); // ekran ortası
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis;
    private javax.swing.JButton giris;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kulanici_adi;
    private javax.swing.JLabel limit;
    private otopark.RoundedPanel roundedPanel1;
    private javax.swing.JPasswordField sifre;
    private javax.swing.JLabel sifre_text;
    private javax.swing.JLabel tarih_Zaman;
    // End of variables declaration//GEN-END:variables
}

