-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3306
-- Üretim Zamanı: 29 May 2025, 14:42:49
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
-- Tablo için tablo yapısı `arabamodeli`
--

CREATE TABLE `arabamodeli` (
  `kullanici_id` int(11) DEFAULT NULL,
  `model_turu` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `arac_bilgi`
--

CREATE TABLE `arac_bilgi` (
  `kullanici_id` int(11) NOT NULL,
  `uye_no` int(11) NOT NULL,
  `plaka` varchar(20) NOT NULL,
  `marka` varchar(50) DEFAULT NULL,
  `model` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `arac_bilgi`
--

INSERT INTO `arac_bilgi` (`kullanici_id`, `uye_no`, `plaka`, `marka`, `model`) VALUES
(1, 120, 'sdfgbn', 'Toyota', '2345t'),
(4, 1, '12 AZ  234', 'Toyota', '2025'),
(5, 5, '23 AC 345', 'Hyundai', '2025'),
(7, 1, '27 AC 456', 'BMW', 'M3'),
(10, 2, 'sadfbn', 'Toyota', 'afvbdc'),
(11, 1, 'wfe', 'Toyota', 'fweee'),
(15, 23, 'w343t5', 'BMW', 'q3regt'),
(16, 1, 'SCDVC', 'Toyota', 'WEDF'),
(19, 3, '234', 'BMW', '12345'),
(21, 1, '12345t', 'Toyota', 'qwertg'),
(22, 1, '234', 'BMW', 'model');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `park_kayitlari`
--

CREATE TABLE `park_kayitlari` (
  `id` int(11) NOT NULL,
  `buton_no` varchar(10) NOT NULL,
  `plaka` varchar(20) NOT NULL,
  `giris_zamani` datetime NOT NULL,
  `cikis_zamani` datetime DEFAULT NULL,
  `ucret` int(11) DEFAULT 0,
  `aktif_mi` tinyint(1) DEFAULT 1,
  `model_adi` varchar(100) DEFAULT NULL,
  `kullanici_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `park_kayitlari`
--

INSERT INTO `park_kayitlari` (`id`, `buton_no`, `plaka`, `giris_zamani`, `cikis_zamani`, `ucret`, `aktif_mi`, `model_adi`, `kullanici_id`) VALUES
(1, '1', '23AC24', '2025-05-15 23:09:10', '2025-05-15 23:09:13', 0, 0, NULL, NULL),
(2, '1', '27 AZ 234', '2025-05-17 19:58:09', '2025-05-17 19:58:25', 0, 0, NULL, NULL),
(3, '1', '23AD23', '2025-05-17 22:55:25', '2025-05-17 22:55:40', 0, 0, NULL, NULL),
(4, '1', '24az24', '2025-05-17 23:15:46', '2025-05-17 23:15:55', 0, 0, NULL, NULL),
(5, '1', '23ad23', '2025-05-17 23:21:16', '2025-05-17 23:21:27', 0, 0, NULL, NULL),
(6, '1', '23az23', '2025-05-17 23:22:53', '2025-05-17 23:22:56', 0, 0, NULL, NULL),
(7, '1', '23az23', '2025-05-17 23:23:06', '2025-05-18 00:05:35', 42, 0, NULL, NULL),
(8, '1', '24qer234', '2025-05-18 00:34:11', '2025-05-18 00:34:13', 0, 0, NULL, NULL),
(9, '1', '23az45', '2025-05-18 13:20:56', '2025-05-18 13:21:36', 0, 0, 'taksi', NULL),
(10, '1', '23az23', '2025-05-18 13:22:06', '2025-05-18 13:22:09', 0, 0, 'taksi8', NULL),
(11, '', '23xc23', '2025-05-18 15:47:55', '2025-05-18 15:47:57', 0, 0, 'taksi', NULL),
(12, '', '23x2232', '2025-05-18 17:38:48', '2025-05-18 18:03:25', 24, 0, '13', NULL),
(13, '', '23 az34', '2025-05-19 20:21:37', '2025-05-19 20:21:58', 0, 0, 'otomobil', NULL),
(14, '', '23AZ45', '2025-05-19 23:41:33', '2025-05-20 00:03:15', 21, 0, 'otomobil', NULL),
(15, '', '23 AZ 432', '2025-05-20 13:40:26', '2025-05-20 13:41:30', 0, 0, 'otomobil', NULL),
(16, '', '23az34', '2025-05-20 13:52:26', NULL, 0, 1, 'otomobil', NULL),
(17, '', '23 AZ 234', '2025-05-20 19:01:27', '2025-05-20 19:01:42', 0, 0, 'otomobil', 1),
(18, '', '23AZ456', '2025-05-20 19:14:03', '2025-05-20 19:19:28', 0, 0, 'otomobil', 1),
(19, '', '23 az34', '2025-05-20 19:19:46', '2025-05-20 19:23:19', 0, 0, 'otomobil', 1),
(20, '', '23 dc 34', '2025-05-20 19:23:46', '2025-05-20 19:33:18', 0, 0, 'otomobil', 1),
(21, '', '23mr34', '2025-05-20 19:33:31', '2025-05-20 19:38:01', 0, 0, 'otomobil', 1),
(22, '', '23 AZ34', '2025-05-20 19:38:23', NULL, 0, 1, 'otomobil', 1),
(23, '1', '23 df 234', '2025-05-20 19:46:15', '2025-05-20 19:46:31', 0, 0, 'otomobil', 1),
(24, '1', '23 AC 345', '2025-05-20 19:48:28', '2025-05-20 19:48:46', 0, 0, 'otomobil', 1),
(25, '1', '23bAZ3456', '2025-05-20 19:50:43', '2025-05-20 19:54:44', 0, 0, 'otomobil', 1),
(26, '1', '23 dd 245', '2025-05-20 19:54:59', '2025-05-20 19:55:35', 0, 0, 'otomobil', 1),
(27, '2', '45 dc 45', '2025-05-20 19:55:28', '2025-05-20 19:55:32', 0, 0, '45 cd 56', 1),
(28, '1', '73 FE 699', '2025-05-20 20:31:00', '2025-05-20 20:31:03', 0, 0, 'OTOMOBİL', 3),
(29, '1', '12345678', '2025-05-20 20:31:42', '2025-05-20 20:31:46', 0, 0, 'ASDFYTRE', 3),
(30, '1', '23 AZ 345', '2025-05-20 22:37:53', '2025-05-20 23:27:12', 0, 0, 'otomobil', 1),
(31, '6', '25  DZ345', '2025-05-20 22:38:51', '2025-05-20 23:27:27', 0, 0, 'motosiklet', 1),
(32, '2', '24 az 345', '2025-05-20 23:27:42', '2025-05-21 10:03:31', 2435, 0, 'otomobil', 1),
(33, '1', '23 AD 450', '2025-05-21 10:03:51', '2025-05-22 19:25:50', 2668, 0, 'otomobil', 1),
(34, '1', '23 AZ 240', '2025-05-21 12:45:30', '2025-05-28 20:51:33', 14088, 0, 'otomobil', 5),
(35, '3', '27 AC 456', '2025-05-21 14:07:41', '2025-05-21 20:49:48', 1568, 0, 'Taksi', 7),
(36, '1', '23 AZ 234', '2025-05-21 14:21:48', NULL, 0, 1, 'otomobil', 4),
(37, '2', 'ddssd', '2025-05-21 20:49:43', '2025-05-21 20:49:51', 0, 0, 'Taksi', 7),
(38, '1', 'fdedfe', '2025-05-21 21:03:27', '2025-05-21 21:03:46', 0, 0, 'Otomobil', 7),
(39, '2', 'rgddf', '2025-05-21 21:03:42', '2025-05-21 21:03:43', 0, 0, 'Taksi', 7),
(40, '1', 'fdsd', '2025-05-21 22:28:13', '2025-05-21 22:28:50', 0, 0, 'Taksi', 7),
(41, '2', 'ff', '2025-05-21 22:28:21', '2025-05-21 22:28:47', 0, 0, 'Otomobil', 7),
(42, '3', 'ffd', '2025-05-21 22:28:29', '2025-05-21 22:28:44', 0, 0, 'Motorsiklet', 7),
(43, '4', 'fd', '2025-05-21 22:28:37', '2025-05-21 22:28:40', 0, 0, 'Kamyonet', 7),
(44, '1', 'f', '2025-05-21 22:32:31', '2025-05-21 22:33:14', 0, 0, 'Otomobil', 7),
(45, '2', 'ffd', '2025-05-21 22:32:37', '2025-05-21 22:33:11', 0, 0, 'Taksi', 7),
(46, '3', 'dad', '2025-05-21 22:32:45', '2025-05-21 22:32:59', 0, 0, 'Motorsiklet', 7),
(47, '4', 'qddq', '2025-05-21 22:32:53', '2025-05-21 22:32:55', 0, 0, 'Kamyonet', 7),
(48, '3', 'q', '2025-05-21 22:33:07', '2025-05-21 22:33:08', 0, 0, 'Otomobil', 7),
(49, '1', 'kjnj', '2025-05-21 22:46:28', '2025-05-21 22:47:12', 0, 0, 'Otomobil', 8),
(50, '7', 'jbjk', '2025-05-21 22:46:38', '2025-05-21 22:47:05', 0, 0, 'Taksi', 8),
(51, '4', 'bhvj', '2025-05-21 22:46:47', '2025-05-21 22:47:08', 0, 0, 'Motorsiklet', 8),
(52, '10', 'jbjkj', '2025-05-21 22:46:56', '2025-05-21 22:46:59', 0, 0, 'Kamyonet', 8),
(53, '2', 'few', '2025-05-22 10:18:50', '2025-05-22 10:20:59', 8, 0, 'Otomobil', 7),
(54, '3', 'fewfds', '2025-05-22 10:18:58', '2025-05-22 10:20:57', 4, 0, 'Taksi', 7),
(55, '4', 'c', '2025-05-22 10:20:44', '2025-05-22 10:20:55', 0, 0, 'Otomobil', 7),
(56, '5', 'aqsc', '2025-05-22 10:20:50', '2025-05-22 10:20:52', 0, 0, 'Taksi', 7),
(57, '3', 'k', '2025-05-22 10:24:39', '2025-05-22 10:26:46', 8, 0, 'Otomobil', 7),
(58, '4', 'bh', '2025-05-22 10:24:44', '2025-05-22 10:27:23', 8, 0, 'Taksi', 7),
(59, '8', 'jnbj', '2025-05-22 10:24:50', '2025-05-22 10:27:16', 0, 0, 'Motorsiklet', 7),
(60, '2', 'gws', '2025-05-22 10:26:52', '2025-05-22 10:27:21', 0, 0, 'Otomobil', 7),
(61, '7', 'wg', '2025-05-22 10:26:56', '2025-05-22 10:27:19', 0, 0, 'Taksi', 7),
(62, '9', 'wegd', '2025-05-22 10:27:01', '2025-05-22 10:27:13', 0, 0, 'Motorsiklet', 7),
(63, '10', 'ewew', '2025-05-22 10:27:05', '2025-05-22 10:27:07', 0, 0, 'Kamyonet', 7),
(64, '3', 'ö', '2025-05-22 10:27:31', '2025-05-22 10:27:32', 0, 0, 'Motorsiklet', 7),
(65, '2', 'd', '2025-05-22 11:47:42', '2025-05-22 11:47:51', 0, 0, 'Otomobil', 7),
(66, '8', 'g', '2025-05-22 11:47:46', '2025-05-22 11:47:48', 0, 0, 'Taksi', 7),
(67, '3', 'qef', '2025-05-22 11:49:56', '2025-05-22 12:56:51', 258, 0, 'Taksi', 7),
(68, '2', 'dew', '2025-05-22 11:53:29', '2025-05-22 12:56:54', 242, 0, 'Otomobil', 7),
(69, '8', 'ewfew', '2025-05-22 11:53:32', '2025-05-22 12:56:49', 246, 0, 'Taksi', 7),
(70, '3', 'fd', '2025-05-22 12:56:58', '2025-05-22 12:57:13', 0, 0, 'Otomobil', 7),
(71, '8', 's', '2025-05-22 12:57:02', '2025-05-22 12:57:47', 0, 0, 'Taksi', 7),
(72, '9', 'eq', '2025-05-22 12:57:07', '2025-05-22 12:57:49', 0, 0, 'Motorsiklet', 7),
(73, '4', 'eqf', '2025-05-22 12:57:12', '2025-05-22 12:57:52', 0, 0, 'Kamyonet', 7),
(74, '2', 'eew', '2025-05-22 13:11:34', '2025-05-22 13:12:07', 0, 0, 'Otomobil', 9),
(75, '3', 'ewf', '2025-05-22 13:11:38', '2025-05-22 13:11:53', 0, 0, 'Taksi', 9),
(76, '4', 'efwfw', '2025-05-22 13:11:42', '2025-05-22 13:11:51', 0, 0, 'Motorsiklet', 9),
(77, '5', 'wefe', '2025-05-22 13:11:47', '2025-05-22 13:11:48', 0, 0, 'Kamyonet', 9),
(78, '2', 'sr', '2025-05-22 13:12:12', '2025-05-22 13:36:42', 92, 0, 'Otomobil', 9),
(79, '3', 'wf', '2025-05-22 13:36:47', '2025-05-22 13:52:35', 58, 0, 'Otomobil', 9),
(80, '4', 'wefwe', '2025-05-22 13:36:52', '2025-05-22 13:52:37', 59, 0, 'Taksi', 9),
(81, '9', 'wef', '2025-05-22 13:36:56', '2025-05-22 13:37:08', 0, 0, 'Motorsiklet', 9),
(82, '7', 'wfee', '2025-05-22 13:37:01', '2025-05-22 13:52:33', 53, 0, 'Kamyonet', 9),
(83, '2', '23 AZ 234', '2025-05-22 15:18:57', '2025-05-22 15:19:48', 0, 0, 'Taksi', 4),
(84, '9', '23 AZ 234', '2025-05-22 15:19:10', NULL, 0, 1, 'Motorsiklet', 4),
(85, '7', '23 AZ 345', '2025-05-22 15:19:30', NULL, 0, 1, 'Kamyonet', 4),
(86, '5', '23 DZ 345', '2025-05-22 15:19:47', NULL, 0, 1, 'Taksi', 4),
(87, '3', '23 AZ 234', '2025-05-22 15:20:01', '2025-05-22 15:20:03', 0, 0, 'Taksi', 4),
(88, '3', '23 AZ 345', '2025-05-22 15:20:14', NULL, 0, 1, 'Otomobil', 4),
(89, '2', '73 MS 27', '2025-05-22 17:13:01', '2025-05-22 17:13:04', 0, 0, 'Otomobil', 1),
(90, '3', '73 MS 27', '2025-05-22 17:13:27', '2025-05-22 19:25:59', 467, 0, 'Kamyonet', 1),
(91, '4', 'IUYTRE', '2025-05-22 17:13:42', '2025-05-22 19:26:03', 110, 0, 'Taksi', 1),
(92, '5', 'KUYT', '2025-05-22 17:13:53', '2025-05-22 19:26:06', 0, 0, 'Motorsiklet', 1),
(93, '1', '23 AZ 234', '2025-05-22 20:09:50', '2025-05-22 20:10:07', 0, 0, 'Taksi', 1),
(94, '4', '23  DC 245', '2025-05-28 20:43:20', '2025-05-28 20:51:40', 16, 0, 'Taksi', 5),
(95, '8', '234 AC 345', '2025-05-28 20:43:34', NULL, 0, 1, 'Kamyonet', 5),
(96, '6', '234 ZA 2345', '2025-05-28 20:43:51', NULL, 0, 1, 'Kamyonet', 5),
(97, '3', '23 AC 234', '2025-05-28 20:51:52', NULL, 0, 1, 'Taksi', 5),
(100, '1', '23 AZ 345', '2025-05-29 10:57:00', NULL, 0, 1, 'Otomobil', 15),
(101, '2', '23 AZ 456', '2025-05-29 10:57:10', NULL, 0, 1, 'Taksi', 15),
(102, '1', '23 AZ 234', '2025-05-29 11:02:08', NULL, 0, 1, 'Otomobil', 16),
(103, '1', '23 AZ 345', '2025-05-29 11:23:20', NULL, 0, 1, 'Otomobil', 19),
(104, '7', '23 AZ 234', '2025-05-29 11:23:31', NULL, 0, 1, 'Otomobil', 19),
(105, '4', '23 AD 2456', '2025-05-29 11:23:50', NULL, 0, 1, 'Kamyonet', 19),
(106, '1', '23 AZ 345', '2025-05-29 12:28:53', NULL, 0, 1, 'Otomobil', 1),
(107, '6', '23 DZ 345', '2025-05-29 12:29:08', NULL, 0, 1, 'Taksi', 1),
(108, '8', '23 CB 345', '2025-05-29 12:29:24', NULL, 0, 1, 'Taksi', 1),
(109, '1', '23 az 345', '2025-05-29 13:23:36', NULL, 0, 1, 'Otomobil', 22);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `ucret_bilgisi`
--

CREATE TABLE `ucret_bilgisi` (
  `model_tur` varchar(50) NOT NULL,
  `kullanici_id` int(11) DEFAULT NULL,
  `saatlik` decimal(10,2) DEFAULT NULL,
  `gunluk` decimal(10,2) DEFAULT NULL,
  `aylik` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `ucret_bilgisi`
--

INSERT INTO `ucret_bilgisi` (`model_tur`, `kullanici_id`, `saatlik`, `gunluk`, `aylik`) VALUES
('', NULL, 240.00, 2500.00, 5000.00),
('', NULL, 350.00, 2400.00, 7000.00),
('', NULL, 230.00, 2300.00, 25000.00),
('', NULL, 2400.00, 4000.00, 2400.00),
('', NULL, 2300.00, 5600.00, 23400.00),
('', NULL, 230.00, 400.00, 3500.00),
('', NULL, 230.00, 400.00, 4000.00),
('', NULL, 400.00, 2300.00, 3400.00),
('', NULL, 230.00, 400.00, 5000.00),
('Otomobil', NULL, 80.00, 340.00, 340.00),
('Taksi', NULL, 120.00, 2880.00, 86400.00),
('Motosiklet', NULL, 100.00, 2400.00, 72000.00),
('Kamyonet', NULL, 212.00, 1.00, 1213.00);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uye_bilgisi`
--

CREATE TABLE `uye_bilgisi` (
  `kullanici_id` int(11) NOT NULL,
  `uye_no` int(11) NOT NULL,
  `ad` varchar(50) DEFAULT NULL,
  `soy_Ad` varchar(50) DEFAULT NULL,
  `tel_No` varchar(20) DEFAULT NULL,
  `adres` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `uye_bilgisi`
--

INSERT INTO `uye_bilgisi` (`kullanici_id`, `uye_no`, `ad`, `soy_Ad`, `tel_No`, `adres`) VALUES
(1, 1, 'xcvb', 'wertgh', '123456', 'sdfgh'),
(1, 120, 'met', 'dfg', '2345', '234tyh'),
(4, 1, 'muhammet', 'öner', '234567', 'gaziantep'),
(5, 5, 'Mert', 'Dağcı', '05674567', 'GAziantep /şahinbey'),
(7, 1, 'furkan', 'ozan', '05051270506', 'bdbdbheehjw'),
(10, 2, 'ldövşdv', 'övisdvö', '1234567', 'zsdföd'),
(11, 1, 'vfrfwef', 'wfef', '3423', 'fwer'),
(15, 23, ' gfh', 'dsfgh', '23456', ''),
(16, 1, 'K', 'K', '1234', 'ASDVC'),
(19, 3, 'SGDFH', 'SD', '1234', 'ASDFG'),
(21, 1, 'dfgh', 'sdfvb', '2345', 'dfgh'),
(22, 1, 'mert', 'önder', '12345', 'gaziantep');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uye_kayit`
--

CREATE TABLE `uye_kayit` (
  `kullanici_id` int(11) NOT NULL,
  `kullanici_adi` varchar(50) DEFAULT NULL,
  `kullanici_sifre` varchar(225) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `uye_kayit`
--

INSERT INTO `uye_kayit` (`kullanici_id`, `kullanici_adi`, `kullanici_sifre`) VALUES
(1, 'murat', '1234'),
(2, 'muhammet', '12345'),
(3, 'muratsss', '12345'),
(4, 'muhammet', '1234'),
(5, 'mert', '12345'),
(6, 'hayır', 'hayır'),
(7, 'furkan', '1234'),
(8, 'yusuf', '1234'),
(9, '1', '1'),
(10, 'mert', 'Mert.1234'),
(11, 'nuri', 'Nuri.1234'),
(12, 'm', 'Mert.1234'),
(13, 'm', 'Mert.1234'),
(14, 'mert', 'Mert.1234'),
(15, 'm', 'Mert.1234'),
(16, 'm', 'Mert.1234'),
(17, 'M', ' Mert.1234'),
(18, 'M', ' Mert.1234'),
(19, 'm', 'Mert.1234'),
(20, 'm', 'Mert.1234'),
(21, 'm', 'Mert.123456'),
(22, 'nuri', 'Nuri.1234');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `arabamodeli`
--
ALTER TABLE `arabamodeli`
  ADD KEY `kullanici_id` (`kullanici_id`);

--
-- Tablo için indeksler `arac_bilgi`
--
ALTER TABLE `arac_bilgi`
  ADD PRIMARY KEY (`kullanici_id`,`uye_no`,`plaka`);

--
-- Tablo için indeksler `park_kayitlari`
--
ALTER TABLE `park_kayitlari`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kullanici_id` (`kullanici_id`);

--
-- Tablo için indeksler `ucret_bilgisi`
--
ALTER TABLE `ucret_bilgisi`
  ADD KEY `kullanici_id` (`kullanici_id`);

--
-- Tablo için indeksler `uye_bilgisi`
--
ALTER TABLE `uye_bilgisi`
  ADD PRIMARY KEY (`kullanici_id`,`uye_no`);

--
-- Tablo için indeksler `uye_kayit`
--
ALTER TABLE `uye_kayit`
  ADD PRIMARY KEY (`kullanici_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `park_kayitlari`
--
ALTER TABLE `park_kayitlari`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;

--
-- Tablo için AUTO_INCREMENT değeri `uye_kayit`
--
ALTER TABLE `uye_kayit`
  MODIFY `kullanici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `arabamodeli`
--
ALTER TABLE `arabamodeli`
  ADD CONSTRAINT `arabamodeli_ibfk_1` FOREIGN KEY (`kullanici_id`) REFERENCES `uye_kayit` (`kullanici_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `arac_bilgi`
--
ALTER TABLE `arac_bilgi`
  ADD CONSTRAINT `arac_bilgi_ibfk_1` FOREIGN KEY (`kullanici_id`,`uye_no`) REFERENCES `uye_bilgisi` (`kullanici_id`, `uye_no`);

--
-- Tablo kısıtlamaları `park_kayitlari`
--
ALTER TABLE `park_kayitlari`
  ADD CONSTRAINT `park_kayitlari_ibfk_1` FOREIGN KEY (`kullanici_id`) REFERENCES `uye_kayit` (`kullanici_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `ucret_bilgisi`
--
ALTER TABLE `ucret_bilgisi`
  ADD CONSTRAINT `ucret_bilgisi_ibfk_1` FOREIGN KEY (`kullanici_id`) REFERENCES `uye_kayit` (`kullanici_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `uye_bilgisi`
--
ALTER TABLE `uye_bilgisi`
  ADD CONSTRAINT `uye_bilgisi_ibfk_1` FOREIGN KEY (`kullanici_id`) REFERENCES `uye_kayit` (`kullanici_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
