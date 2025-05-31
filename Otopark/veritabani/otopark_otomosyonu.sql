-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3307
-- Üretim Zamanı: 12 May 2025, 10:02:23
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `otopark_otomosyonu`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arac_bilgi`
--

CREATE TABLE `arac_bilgi` (
  `uyeNo` int(11) NOT NULL,
  `plaka` varchar(45) NOT NULL,
  `marka` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `arac_bilgi`
--

INSERT INTO `arac_bilgi` (`uyeNo`, `plaka`, `marka`, `model`) VALUES
(1, '23AD45', 'volvo', '2025'),
(2, '27MN34', 'volvo', '2025'),
(3, '45AD34', 'volvo', '2025'),
(4, '34AD234', 'volvo', '2023'),
(5, '72AC234', 'toros', '2024'),
(6, '21FT34', 'BMW', '2025'),
(7, '21NS3131', 'BMW', '2025'),
(123, '23AC234', 'porşe', '2024');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uye_bilgisi`
--

CREATE TABLE `uye_bilgisi` (
  `uye_no` int(11) NOT NULL,
  `ad` varchar(45) NOT NULL,
  `soy_Ad` varchar(45) NOT NULL,
  `tel_no` varchar(45) NOT NULL,
  `adres` varchar(95) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `uye_bilgisi`
--

INSERT INTO `uye_bilgisi` (`uye_no`, `ad`, `soy_Ad`, `tel_no`, `adres`) VALUES
(1, 'muhammet', 'öner', '05461532110', 'gaziantep'),
(2, 'furakan', 'ozan', '4525243', 'gaziantep'),
(3, 'murat', 'sinayic', '054676543', 'şırnak'),
(4, 'mehmet', 'deniz', '0567345654', 'gaziantep barak mahallesi'),
(5, 'kasım', 'ekici', '0576234543', 'mardin midyat'),
(6, 'fatma', 'yıldız', 'r567568456574', 'diyarbakır'),
(7, 'nurullah', 'savcı', '05444653877', 'diyarbakır bağlar'),
(123, 'muhammet', 'öner', '05461532118', 'barak mahallesi 100112 nolu sokak no4 gaziantep şahinbe');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `arac_bilgi`
--
ALTER TABLE `arac_bilgi`
  ADD PRIMARY KEY (`uyeNo`);

--
-- Tablo için indeksler `uye_bilgisi`
--
ALTER TABLE `uye_bilgisi`
  ADD PRIMARY KEY (`uye_no`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
