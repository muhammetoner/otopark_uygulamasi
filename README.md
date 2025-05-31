# 🚗 Otopark Otomasyonu Projesi

Java ve Swing kullanılarak geliştirilmiş, kullanıcı dostu ve görsel açıdan zengin **masaüstü otopark yönetim sistemi**.  
Kullanıcı kayıt/giriş, araç kaydı, otopark alanı yönetimi ve fiyat belirleme gibi temel otopark işlevlerini destekler.

---

## 📷 Ekran Görüntüleri

### 🔐 Giriş Ekranı
![Giriş Ekranı](otopark_otopasyonu_arayüz_png/giris_ekrani.png)

### 📝 Kayıt Ol Ekranı
![Kayıt Ol](otopark_otopasyonu_arayüz_png/kayit_ol.png)

### 🧾 Ana Menü (İşlem Seçimi)
![Ana Menü](otopark_otopasyonu_arayüz_png/otopark_islemleri.png)

### 🧑‍💼 Üye Kayıt Ekranı
![Üye Kayıt](otopark_otopasyonu_arayüz_png/uye_kayit_ekrani.png)

### 🔍 Üye Arama Ekranı
![Üye Arama](otopark_otopasyonu_arayüz_png/uye_arama.png)

### 🅿️ Otopark Alanı Görseli
![Otopark Alanı](otopark_otopasyonu_arayüz_png/otopark_alani.png)

### 💰 Fiyat Belirleme Paneli
![Fiyat Belirleme](otopark_otopasyonu_arayüz_png/fiyat_belirleme.png)

---

## 🔧 Özellikler

- 🔐 **Kullanıcı Giriş/Kayıt**:
  - Güvenli kullanıcı adı ve şifre kontrolü
  - Giriş hakkı sınırı (3 deneme)
  - Anlık saat/tarih gösterimi

- 🧾 **Ana Menü Paneli**:
  - Farklı işlemler arasında hızlı geçiş
  - Temiz, sade ve ikonlu arayüz

- 👤 **Üye Kayıt Modülü**:
  - Kişisel bilgiler + araç bilgileri
  - Veritabanına kayıtlı olarak saklama

- 🔍 **Üye Arama & Silme**:
  - Üye no ile arama
  - Silme ve listeleme desteği

- 🚗 **Otopark Görsel Alanı**:
  - Araçların doluluk durumlarını gösteren grafik alan
  - Farklı araç türleriyle (otomobil, taksi, kamyonet...)

- 💸 **Fiyat Belirleme Paneli**:
  - Araç türüne göre saatlik, günlük, aylık fiyat belirleme
  - Fiyatları güncelleme, kaydetme, temizleme butonları

---

## 💻 Teknolojiler

- Java SE (Swing GUI)
- JDBC (Veritabanı bağlantısı)
- MySQL
- NetBeans IDE
- Git & GitHub

---

## 🚀 Kurulum & Çalıştırma

1. MySQL üzerinde `otopark_otomosyonu` isimli bir veritabanı oluşturun.
2. dist bulunan veri tabanını içe aktarın   .
3. `DBConnection.java` içindeki veritabanı bağlantı bilgilerini güncelleyin.(önce çalışıyor mu diye kontrol edenin sorun olursa portu localhost değiştiebilirsiniz)
4. NetBeans veya başka bir IDE ile `Otopark_Otomasyonu.java` ya da `Kayit_Ol.java` üzerinden çalıştırın.( dist klasöründe bulunan .jar basıp kullanmaya başlaya bilrisiniz eğer koldarı düzenlemek istemiyorsanız )

---

## 📝 Notlar

- **Türkçe karakter desteği** mevcuttur.
- Şifrelerde güvenlik kontrolü uygulanır.
- Kullanıcı adı kurallarına uygunluk zorunludur.
- Görsel arayüzlerde ikonlar ve renkler kullanıcı deneyimini güçlendirmek amacıyla seçilmiştir.

---

## 📄 Lisans

MIT Lisansı

---

## 🙏 Teşekkür

Bu projeyi tamamlarken desteğini esirgemeyen herkese teşekkür ederim.  
Yeni projelerde görüşmek üzere! ✨
