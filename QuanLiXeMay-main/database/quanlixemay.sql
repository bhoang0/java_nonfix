-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 17, 2024 at 04:53 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


--
-- Database:   quanlixemay  
--

-- --------------------------------------------------------

--
-- Table structure for table  Account 
--

CREATE TABLE Account (
  fullName varchar(50) DEFAULT NULL,
  userName varchar(50) NOT NULL,
  password varchar(60) DEFAULT NULL,
  role varchar(50) DEFAULT NULL,
  status int(11) DEFAULT NULL,
  email varchar(50) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  Account 
--

INSERT INTO Account (fullName, userName, password, role, status, email) VALUES
('Admin', 'admin', '$2a$12$Y87zSnx.tpFvieylSeXuo.agjb7swi3UVnoo6KVMY9xP5STj4zJhm', 'Admin', 1, 'trngbhoang@gmail.com'),
('Trần Thị Kim Huệ', 'kimhue', '$2a$12$PhiTGBbHjHoB3dbS6BmCC.rzdMCBqDrdK9Y8Ae8GPcKe1RpHiWARO', 'Nhân viên xuất', 1, '22520495@gmail.com'),
('Trần Nguyễn Bảo Hoàng', 'baohoang', '$2a$12$89As1J0AB0yrqGjnQUHtpevc6voGyvzAd8OvzkS1vGDo3YPO2P.Ia', 'Nhân viên nhập', 1, '22520478@gmail.com'),
('Trần Phạm Trúc Anh', 'trucanh', '$2a$12$myOaq0kATMzNkbxgzQEkPu8ht2K0pXOGzZMZo6nSBowq6EyoLo7tS', 'Quản lý kho', 1, '22520082@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table  XeMay 
--

CREATE TABLE  XeMay  (
   MaXe  varchar(50) NOT NULL,
   TenXe  varchar(100) DEFAULT NULL,
   soLuong  int(11) NOT NULL DEFAULT 0,
   tenDongCo  varchar(100) NOT NULL DEFAULT '0',
   phanKhoi  varchar(50) NOT NULL DEFAULT '0',
   doCaoYen  varchar(50) DEFAULT NULL,
   gia  double NOT NULL DEFAULT 0,
   congSuat varchar(50) DEFAULT NULL,
   khoiLuong int(11) DEFAULT NULL,
   loaiXe  varchar(50) DEFAULT NULL,
   tieuThuNL varchar(50) DEFAULT NULL,
   dungTichbinhXang double DEFAULT NULL,
   phienBan  varchar(50) DEFAULT NULL,
   xuatXu  varchar(50) DEFAULT NULL,
   trangThai  int(11) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  XeMay 
--

INSERT INTO  XeMay  ( MaXe ,  TenXe ,  soLuong ,  tenDongCo ,  phanKhoi ,  doCaoYen ,  gia ,  congSuat ,  khoiLuong ,  loaiXe ,  tieuthuNL ,  dungTichbinhXang ,  phienBan ,  xuatXu ,  trangThai ) VALUES
('TG1', 'Honda SH350i', 36, 'SOHC, 4 kỳ, xy-lanh đơn 4 van, làm mát bằng chất lỏng, đáp ứng Euro 3', '329,6 cm3', '805 mm', 150000000, NULL, NULL, 'TayGa', '3.63 lít/100km', 9.3, 'Cao cấp', 'Nhật Bản', 0),
('XS1', 'Honda Wave Alpha 110', 23, '4 kỳ, 1 xilanh, làm mát bằng không khí', '109,2 cm3', '770 mm', 17500000, NULL, NULL, 'XeSo', '1.72 lít/100km', 3.7, 'Tiêu chuẩn', 'Nhật Bản', 0),
('XS2', 'Honda Winner X 2024', 19, 'PGM-FI, DOHC, 4 kỳ xi-lanh đơn, côn tay 6 cấp số, làm mát bằng chất lỏng', '149,2 cm3', '795 mm', 46500000, NULL, NULL, 'XeSo', '1.98 lít/100km', 5.5, 'Tiêu chuẩn', 'Nhật Bản', 1),
('XS3', 'Honda Super Cub C125', 3, 'PGM-FI, 4 kỳ, xy-lanh đơn, làm mát bằng không khí', '123,94 cm3', '780 mm', 87000000, NULL, NULL, 'XeSo', '1.5 lít/100km', 3.7, 'Đặc biệt', 'Nhật Bản', 1),
('XS4', 'Yamaha Sirius RC', 28, '4 thì, 2 van SOHC, làm mát bằng không khí', '110.3 cm3', '770 mm', 21000000, NULL, NULL, 'XeSo', '2.08 lít/100km', 4.2, 'Tiêu chuẩn', 'Nhật Bản', 1),
('TG2', 'Yamaha Grande', 62, 'Blue Core, SOHC, 4 kỳ, 2 van, Làm mát bằng không khí cưỡng bức', '124,9 cm3', '790 mm', 49000000, NULL, NULL, 'TayGa', '1.69 lít/100km', 4.4, 'Đặc biệt', 'Nhật Bản', 1),
('XS5', 'Yamaha Jupiter Fin', 22, '4 thì, 2 van, SOHC, làm mát bằng không khí', '113.7 cm3', '775 mm', 28000000, NULL, NULL, 'XeSo', '1.64 lít/100km', 4, 'Cao cấp', 'Nhật Bản', 1),
('XS6', 'Yamaha Exciter 155 VVA', 23, '4 kỳ, 4 van, SOHC, làm mát bằng chất lỏng', '155.1 cm3', '795 mm', 54000000, NULL, NULL, 'XeSo', '2 lít/100km', 5.4, 'Cao cấp', 'Nhật Bản', 1),
('TG3', 'Yamaha Latte', 18, 'Blue Core, 2 van, 4 kỳ, SOHC, Làm mát bằng không khí cưỡng bức', '124.9 cm3', '790 mm', 38000000, NULL, NULL, 'TayGa', '1.8 lít/100km', 5.5, 'Tiêu chuẩn', 'Nhật Bản', 1),
('TG4', 'Suzuki Address Fi', 19, '4 thì, 1 xy-lanh, làm mát bằng không khí', '113 cm3', '755 mm', 29000000, NULL, NULL, 'TayGa', '1.86 lít/100km', 5.2, 'Tiêu chuẩn', 'Nhật Bản', 1),
('XS7', 'Suzuki Raider R150', 16, 'DOHC, 4 van, côn tay 6 cấp số', '150 cm3', '765 mm', 49000000, NULL, NULL, 'XeSo', '2.4 lít/100km', 4, 'Tiêu chuẩn', 'Nhật Bản', 1),
('TG5', 'Piaggio Liberty 125 ABS', 20, 'Piaggio iGet, 4 kỳ, phun xăng điện tử', '124.5 cm3', '780 mm', 57000000, NULL, NULL, 'TayGa', '2.63 lít/100km', 6, 'Tiêu chuẩn', 'Ý', 1),
('TG6', 'Piaggio Vespa Primavera 125', 37,  'Piaggio iGet, 4 kỳ, 3 van, phun xăng điện tử', '124.5 cm3', '770 mm', 77000000, NULL, NULL, 'TayGa', '2.67 lít/100km', 7, 'Tiêu chuẩn', 'Ý', 1),
('TG7', 'Sym Elite 50', 34, '4 kỳ, 1 xi-lanh, làm mát bằng không khí', '50 cm3', '740 mm', 22000000, NULL, NULL, 'TayGa',  '2.5 lít/100km', 4.5, 'Tiêu chuẩn', 'Đài Loan', 1),
('TG8', 'Sym Attila 50', 53, '4 thì, làm mát bằng không khí', '50 cm3', '750 mm', 20000000, NULL, NULL, 'TayGa', '2.22 lít/100km', 6.2, 'Tiêu chuẩn', 'Đài Loan', 1),
('TG9', 'Sym Angela 50', 83, '4 thì, Làm mát bằng không khí', '50 cm3', '750 mm', 17000000, NULL, NULL, 'TayGa', '1.26 lít/100km', 3.4, 'Tiêu chuẩn', 'Đài Loan', 1),
('XS8', 'Sym Star SR 125 EFI', 118, 'Động cơ 4 thì, SOHC', '123 cm3', '780 mm', 27500000, NULL, NULL, 'XeSo', '1.81 lít/100km', 3.6,  'Tiêu chuẩn', 'Đài Loan', 1),
('TG10', 'Honda SH350i', 11, 'SOHC, 4 kỳ, xy-lanh đơn 4 van, làm mát bằng chất lỏng; đáp ứng Euro 3', '329,6 cm3', '805 mm', 145000000, NULL, NULL, 'TayGa', '3.63 lít/100km', 9.3, 'Đặc biệt', 'Nhật Bản', 1),
('XS9', 'Honda Wave Alpha 110', 90, '4 kỳ, 1 xilanh, làm mát bằng không khí', '109,2 cm3', '770 mm', 18000000, NULL, NULL, 'XeSo', '1.72 lít/100km', 3.7, 'Đặc biệt', 'Nhật Bản', 1),
('XS10', 'Honda Wave Alpha 110', 19, '4 kỳ, 1 xilanh, làm mát bằng không khí', '109,2 cm3', '770 mm', 18500000, NULL, NULL, 'XeSo', '1.72 lít/100km', 3.7, 'giới hạn', 'Nhật Bản', 1),
('XS11', 'Honda Winner X 2024', 60, 'PGM-FI, DOHC, 4 kỳ xi-lanh đơn, côn tay 6 cấp số, làm mát bằng chất lỏng', '149,2 cm3', '795 mm', 47000000, NULL, NULL, 'XeSo', '1.98 lít/100km', 5.5, 'Thể thao', 'Nhật Bản', 1),
('TG11', 'Yamaha Latte', 25, 'Blue Core, 2 van, 4 kỳ, SOHC, Làm mát bằng không khí cưỡng bức', '124.9 cm3', '790 mm', 40000000, NULL, NULL, 'TayGa', '1.8 lít/100km', 5.5, 'Cao cấp', 'Nhật Bản', 1),
('TG12', 'Piaggio Liberty 125 ABS', 19, 'Piaggio iGet, 4 kỳ, phun xăng điện tử', '124.5 cm3', '780 mm', 60000000, NULL, NULL, 'TayGa', '2.63 lít/100km', 6, 'Cao cấp', 'Ý', 1),
('TG13', 'Piaggio Vespa Primavera 125', 16,  'Piaggio iGet, 4 kỳ, 3 van, phun xăng điện tử', '124.5 cm3', '770 mm', 77500000, NULL, NULL, 'Tay ga', '2.67 lít/100km', 7, 'Cao cấp', 'Ý', 1),
('XS12', 'Yamaha Jupiter Fin', 30, '4 thì, 2 van, SOHC, làm mát bằng không khí', '113.7 cm3', '775 mm', 25000000, NULL, NULL, 'XeSo', '1.64 lít/100km', 4, 'Tiêu chuẩn', 'Nhật Bản', 1),
('TG14', 'Sym Elite 50', 19, '4 kỳ, 1 xi-lanh, làm mát bằng không khí', '50 cm3', '740 mm', 25000000, NULL, NULL, 'TayGa',  '2.5 lít/100km', 4.5, 'Đặc biệt', 'Đài Loan', 1),
('TG15', 'Suzuki Address Fi', 30, '4 thì, 1 xy-lanh, làm mát bằng không khí', '113 cm3', '755 mm', 30000000, NULL, NULL, 'TayGa', '1.86 lít/100km', 5.2, 'Đặc biệt', 'Nhật Bản', 1),
('XS13', 'Suzuki Raider R150', 33, 'DOHC, 4 van, côn tay 6 cấp số', '150 cm3', '765 mm', 50000000, NULL, NULL, 'XeSo', '2.4 lít/100km', 4, 'Đặc biệt', 'Nhật Bản', 1),
('XS14', 'Honda Super Cub C125', 21, 'PGM-FI, 4 kỳ, xy-lanh đơn, làm mát bằng không khí', '123,94 cm3', '780 mm', 85000000, NULL, NULL, 'XeSo', '1.5 lít/100km', 3.7, 'Tiêu chuẩn', 'Nhật Bảnn', 1);


-- --------------------------------------------------------

--
-- Table structure for table  NhaCungCap 
--

CREATE TABLE  NhaCungCap  (
   maNhaCungCap  varchar(50) NOT NULL,
   tenNhaCungCap  varchar(50) DEFAULT NULL,
   Sdt  varchar(50) DEFAULT NULL,
   diaChi  varchar(150) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  NhaCungCap 
--

INSERT INTO  NhaCungCap  ( maNhaCungCap ,  tenNhaCungCap ,  Sdt ,  diaChi ) VALUES
('HONDA', 'Công ty TNHH Honda Motor', '02838361551', 'Tầng 18, Tòa nhà MB Sunny Tower, 259 Trần Hưng Đạo, Quận 1, Hồ Chí Minh'),
('SUZUKI', 'Công ty TNHH Suzuki', '02513838707', 'Đường số 2, Khu công nghiệp Long Bình, Biên Hòa, Đồng Nai'),
('YAMAHA', 'Công ty TNHH Yamaha Motor', '02873023456', 'Xã Trung Giã, Huyện Sóc Sơn, Thành Phố Hà Nội'),
('CNYAMAHA', 'Chi nhánh Yamaha', '02435824900', 'Lô 48-54, 59-68, Khu Công nghiệp Nội Bài, Huyện Sóc Sơn, Hà Nội'),
('XUANTRUNG', 'Cửa hàng xe máy Xuân Trung', '0788889393', '33 Phạm Hùng, Q. Cẩm Lệ, TP. Đà Nẵng'),
('PIAGGIO', 'Công ty TNHH Piaggio', '02439352030', '46 Hoàng Quốc Việt, phường Nghĩa Đô, quận Cầu Giấy, thành phố Hà Nội'),
('DATRACO', 'Cửa hàng Head đại lý Honda Datraco1', '02363752359', '18-20 Hoàng Hoa Thám, Tân Chính, Thanh Khê, TP. Đà Nẵng'),
('HOAIMINH', 'Công ty TNHH Hoài Minh', '0663831961', '16 Hùng Vương, TT. Hòa Thành, H. Hòa Thành, Tây Ninh');

-- --------------------------------------------------------

--
-- Table structure for table  PhieuNhap 
--

CREATE TABLE  PhieuNhap  (
   maPhieu  varchar(50) NOT NULL,
   thoiGianTao timestamp NULL DEFAULT NULL,
   nguoiTao  varchar(50) DEFAULT NULL,
   maNhaCungCap  varchar(50) DEFAULT NULL,
   tongTien  double NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  PhieuNhap 
--

INSERT INTO PhieuNhap (maPhieu, thoiGianTao, nguoiTao, maNhaCungCap, tongTien)
VALUES 
    ('PN1', '2024-01-01 13:59', 'admin', 'YAMAHA', 188000000),
    ('PN10', '2024-02-07 18:04', 'admin', 'XUANTRUNG', 266000000),
    ('PN11', '2024-02-07 18:48', 'admin', 'YAMAHA', 668000000),
    ('PN12', '2024-02-16 02:19', 'admin', 'CNYAMAHA', 69000000),
    ('PN13', '2024-02-16 02:19', 'admin', 'PIAGGIO', 40000000),
    ('PN14', '2024-02-08 12:28', 'admin', 'YAMAHA', 94500000),
    ('PN15', '2024-02-08 12:36', 'admin', 'YAMAHA', 105000000),
    ('PN16', '2024-02-08 16:30', 'admin', 'XUANTRUNG', 233000000),
    ('PN17', '2024-02-09 14:29', 'admin', 'YAMAHA', 65500000),
    ('PN18', '2024-02-09 17:08', 'admin', 'YAMAHA', 321500000),
    ('PN19', '2024-02-12 07:09', 'admin', 'PIAGGIO', 163500000),
    ('PN2', '2024-01-01 13:59', 'admin', 'YAMAHA', 78000000),
    ('PN20', '2024-03-13 19:46', 'admin', 'PIAGGIO', 471500000),
    ('PN21', '2024-03-14 11:54', 'admin', 'PIAGGIO', 3380000000),
    ('PN22', '2024-03-14 12:32', 'admin', 'YAMAHA', 246000000),
    ('PN23', '2024-03-14 14:28', 'admin', 'YAMAHA', 403000000),
    ('PN24', '2024-03-14 14:41', 'admin', 'YAMAHA', 1700000000),
    ('PN25', '2024-03-14 15:18', 'admin', 'HONDA', 87000000),
    ('PN26', '2024-03-14 20:01', 'admin', 'HONDA', 42000000),
    ('PN27', '2024-03-14 20:02', 'admin', 'HONDA', 1450000000),
    ('PN28', '2024-03-15 10:43', 'admin', 'HONDA', 64000000),
    ('PN29', '2024-04-16 02:19', 'admin', 'SUZUKI', 27500000),
    ('PN3', '2024-01-03 03:58', 'admin', 'YAMAHA', 153000000),
    ('PN30', '2024-05-15 23:13', 'admin', 'HONDA', 88000000),
    ('PN31', '2024-05-15 23:14', 'baohoang', 'HONDA', 125500000),
    ('PN32', '2024-05-16 02:19', 'admin', 'XUANTRUNG', 349000000),
    ('PN33', '2024-05-16 13:09', 'baohoang', 'HOAIMINH', 238500000),
    ('PN34', '2024-05-16 15:31', 'admin', 'XUANTRUNG', 597000000),
    ('PN35', '2024-05-16 15:36', 'admin', 'XUANTRUNG', 146500000),
    ('PN36', '2024-05-16 15:40', 'admin', 'HONDA', 760000000),
    ('PN37', '2024-05-17 01:02', 'admin', 'HONDA', 206500000),
    ('PN38', '2024-05-17 01:08', 'admin', 'HONDA', 2080000000),
    ('PN4', '2024-01-03 03:58', 'admin', 'DATRACO', 203500000),
    ('PN5', '2024-01-06 17:51', 'admin', 'YAMAHA', 82500000),
    ('PN6', '2024-01-06 18:50', 'admin', 'YAMAHA', 45000000),
    ('PN7', '2024-01-06 18:59', 'admin', 'PIAGGIO', 276000000),
    ('PN8', '2024-01-06 19:15', 'admin', 'YAMAHA', 105500000),
    ('PN9', '2024-01-06 19:20', 'admin', 'YAMAHA', 67000000);


-- --------------------------------------------------------

--
-- Table structure for table  PhieuXuat 
--

CREATE TABLE  PhieuXuat  (
   maPhieu  varchar(50) NOT NULL,
   thoiGianTao timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
   nguoiTao  varchar(50) NOT NULL,
   tongTien  double NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  PhieuXuat 
--

INSERT INTO PhieuXuat (maPhieu, thoiGianTao, nguoiTao, tongTien)
VALUES 
    ('PX1', '2024-01-01 14:10', 'admin', '661000000'),
    ('PX10', '2024-02-07 18:41', 'admin', '188500000'),
    ('PX12', '2024-02-07 19:06', 'admin', '124500000'),
    ('PX13', '2024-02-08 12:31', 'admin', '672000000'),
    ('PX14', '2024-02-08 16:30', 'admin', '183000000'),
    ('PX15', '2024-02-12 22:31', 'admin', '319500000'),
    ('PX16', '2024-02-14 15:04', 'admin', '426000000'),
    ('PX17', '2024-02-14 15:34', 'admin', '98000000'),
    ('PX18', '2024-02-15 20:32', 'admin', '339000000'),
    ('PX19', '2024-02-16 02:20', 'Admin', '216000000'),
    ('PX2', '2024-01-04 16:45', 'admin', '145000000'),
    ('PX20', '2024-03-16 13:26', 'Admin', '186000000'),
    ('PX21', '2024-03-16 13:36', 'Admin', '240500000'),
    ('PX22', '2024-03-16 16:39', 'Admin', '185000000'),
    ('PX23', '2024-03-16 17:18', 'Admin', '239500000'),
    ('PX24', '2024-03-16 17:25', 'Admin', '150000000'),
    ('PX25', '2024-03-16 18:51', 'Admin', '152500000'),
    ('PX26', '2024-03-17 00:19', 'Admin', '275000000'),
    ('PX3', '2024-01-04 16:45', 'admin', '131500000'),
    ('PX4', '2024-01-04 16:45', 'admin', '64500000'),
    ('PX5', '2024-01-06 19:10', 'admin', '277500000'),
    ('PX6', '2024-01-06 19:19', 'admin', '113000000'),
    ('PX7', '2024-01-06 19:25', 'admin', '271500000'),
    ('PX8', '2024-01-07 18:39', 'admin', '308500000'),
    ('PX9', '2024-01-07 18:40', 'admin', '133500000');

--
-- Table structure for table  ChiTietPhieuNhap 
--

CREATE TABLE ChiTietPhieuNhap (
   maPhieu varchar(50) NOT NULL,
   maXe  varchar(50) NOT NULL,
   soLuong  int(11) DEFAULT NULL,
   donGia  double DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  ChiTietPhieuNhap 
--

INSERT INTO ChiTietPhieuNhap (maPhieu, maXe, soLuong, donGia)
VALUES 
    ('PN1', 'TG1', 1, 150000000),
    ('PN1', 'TG3', 1, 38000000),
    ('PN10', 'TG5', 1, 57000000),
    ('PN10', 'TG2', 1, 49000000),
    ('PN10', 'TG11', 4, 40000000),
    ('PN11', 'TG13', 8, 77500000),
    ('PN11', 'TG8', 1, 20000000),
    ('PN11', 'XS5', 1, 28000000),
    ('PN12', 'XS11', 1, 47000000),
    ('PN12', 'TG7', 1, 22000000),
    ('PN13', 'XS9', 1, 18000000),
    ('PN13', 'TG7', 1, 22000000),
    ('PN14', 'TG4', 1, 29000000),
    ('PN14', 'XS8', 1, 27500000),
    ('PN14', 'TG3', 1, 38000000),
    ('PN15', 'XS3', 1, 87000000),
    ('PN15', 'XS9', 1, 18000000),
    ('PN16', 'TG10', 1, 145000000),
    ('PN16', 'TG12', 1, 60000000),
    ('PN16', 'XS5', 1, 28000000),
    ('PN17', 'XS8', 1, 27500000),
    ('PN17', 'TG3', 1, 38000000),
    ('PN18', 'TG10', 1, 145000000),
    ('PN18', 'XS9', 1, 18000000),
    ('PN18', 'TG12', 1, 60000000),
    ('PN18', 'TG13', 1, 77500000),
    ('PN18', 'XS4', 1, 21000000),
    ('PN19', 'TG12', 1, 60000000),
    ('PN19', 'TG7', 1, 22000000),
    ('PN19', 'XS8', 1, 27500000),
    ('PN19', 'XS6', 1, 54000000),
    ('PN2', 'TG4', 1, 29000000),
    ('PN2', 'XS7', 1, 49000000),
    ('PN20', 'TG10', 1, 145000000),
    ('PN20', 'TG13', 1, 77500000),
    ('PN20', 'TG8', 10, 20000000),
    ('PN20', 'TG2', 1, 49000000),
    ('PN21', 'XS11', 25, 47000000),
    ('PN21', 'TG2', 45, 49000000),
    ('PN22', 'TG1', 1, 150000000),
    ('PN22', 'XS9', 1, 18000000),
    ('PN22', 'TG5', 1, 57000000),
    ('PN22', 'XS4', 1, 21000000),
    ('PN23', 'TG10', 2, 145000000),
    ('PN23', 'XS10', 2, 18500000),
    ('PN23', 'TG3', 2, 38000000),
    ('PN24', 'XS14', 20, 85000000),
    ('PN25', 'XS3', 1, 87000000),
    ('PN26', 'XS4', 2, 21000000),
    ('PN27', 'TG10', 10, 145000000),
    ('PN28', 'TG7', 1, 22000000),
    ('PN28', 'XS4', 2, 21000000),
    ('PN29', 'XS8', 1, 27500000),
    ('PN3', 'TG5', 1, 57000000),
    ('PN3', 'TG8', 1, 20000000),
    ('PN3', 'XS8', 2, 27500000),
    ('PN3', 'XS4', 1, 21000000),
    ('PN30', 'TG7', 1, 22000000),
    ('PN30', 'TG9', 1, 17000000),
    ('PN30', 'TG2', 1, 49000000),
    ('PN31', 'XS3', 1, 87000000),
    ('PN31', 'XS10', 1, 18500000),
    ('PN31', 'TG8', 1, 20000000),
    ('PN32', 'TG10', 1, 145000000),
    ('PN32', 'XS14', 1, 85000000),
    ('PN32', 'XS6', 1, 54000000),
    ('PN32', 'TG11', 1, 40000000),
    ('PN32', 'XS12', 1, 25000000),
    ('PN33', 'XS3', 1, 87000000),
    ('PN33', 'TG5', 1, 57000000),
    ('PN33', 'TG13', 1, 77500000),
    ('PN33', 'TG9', 1, 17000000),
    ('PN34', 'XS9', 20, 18000000),
    ('PN34', 'XS11', 1, 47000000),
    ('PN34', 'TG8', 7, 20000000),
    ('PN34', 'XS12', 2, 25000000),
    ('PN35', 'XS11', 1, 47000000),
    ('PN35', 'XS13', 1, 50000000),
    ('PN35', 'TG7', 1, 22000000),
    ('PN35', 'XS8', 1, 27500000),
    ('PN36', 'TG3', 20, 38000000),
    ('PN37', 'XS11', 3, 47000000),
    ('PN37', 'XS8', 1, 27500000),
    ('PN37', 'TG3', 1, 38000000),
    ('PN38', 'XS9', 30, 18000000),
    ('PN38', 'TG6', 20, 77000000),
    ('PN4', 'TG10', 1, 145000000),
    ('PN4', 'XS10', 1, 18500000),
    ('PN4', 'TG11', 1, 40000000),
    ('PN5', 'XS8', 3, 27500000),
    ('PN6', 'TG9', 1, 17000000),
    ('PN6', 'XS5', 1, 28000000),
    ('PN7', 'XS11', 5, 47000000),
    ('PN7', 'TG8', 1, 20000000),
    ('PN7', 'XS4', 1, 21000000),
    ('PN8', 'XS8', 1, 27500000),
    ('PN8', 'TG3', 1, 38000000),
    ('PN8', 'TG11', 1, 40000000),
    ('PN9', 'XS9', 1, 18000000),
    ('PN9', 'XS7', 1, 49000000);


-- --------------------------------------------------------

--
-- Table structure for table  ChiTietPhieuXuat 
--

CREATE TABLE  ChiTietPhieuXuat  (
   maPhieu  varchar(50) NOT NULL,
   maXe  varchar(50) NOT NULL,
   soLuong  int(11) DEFAULT NULL,
   donGia  double DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table  ChiTietPhieuXuat 
--

INSERT INTO ChiTietPhieuXuat (maPhieu, maXe, soLuong, donGia)
VALUES 
    ('PX1', 'TG1', 1, 150000000),
    ('PX1', 'TG9', 1, 17000000),
    ('PX1', 'TG3', 13, 38000000),
    ('PX10', 'XS11', 1, 47000000),
    ('PX10', 'TG12', 1, 60000000),
    ('PX10', 'TG4', 1, 29000000),
    ('PX10', 'XS8', 1, 27500000),
    ('PX10', 'XS12', 1, 25000000),
    ('PX12', 'XS9', 1, 18000000),
    ('PX12', 'TG13', 1, 77500000),
    ('PX12', 'TG4', 1, 29000000),
    ('PX13', 'TG10', 2, 145000000),
    ('PX13', 'XS9', 1, 18000000),
    ('PX13', 'TG13', 4, 77500000),
    ('PX13', 'XS6', 1, 54000000),
    ('PX14', 'XS11', 1, 47000000),
    ('PX14', 'TG12', 1, 60000000),
    ('PX14', 'TG4', 1, 29000000),
    ('PX14', 'TG7', 1, 22000000),
    ('PX14', 'XS12', 1, 25000000),
    ('PX15', 'TG10', 1, 145000000),
    ('PX15', 'TG13', 1, 77500000),
    ('PX15', 'TG4', 1, 29000000),
    ('PX15', 'XS5', 1, 28000000),
    ('PX15', 'TG11', 1, 40000000),
    ('PX16', 'XS3', 4, 87000000),
    ('PX16', 'TG4', 1, 29000000),
    ('PX16', 'XS7', 1, 49000000),
    ('PX17', 'XS7', 2, 49000000),
    ('PX18', 'XS11', 2, 47000000),
    ('PX18', 'TG2', 5, 49000000),
    ('PX19', 'TG6', 1, 77000000),
    ('PX19', 'TG12', 1, 60000000),
    ('PX19', 'TG14', 1, 25000000),
    ('PX19', 'XS6', 1, 54000000),
    ('PX2', 'XS9', 2, 18000000),
    ('PX2', 'TG12', 1, 60000000),
    ('PX2', 'XS7', 1, 49000000),
    ('PX20', 'XS9', 2, 18000000),
    ('PX20', 'TG12', 1, 60000000),
    ('PX20', 'TG14', 2, 25000000),
    ('PX20', 'TG11', 1, 40000000),
    ('PX21', 'XS10', 1, 18500000),
    ('PX21', 'TG6', 1, 77000000),
    ('PX21', 'TG12', 2, 60000000),
    ('PX21', 'XS12', 1, 25000000),
    ('PX22', 'TG10', 1, 145000000),
    ('PX22', 'TG11', 1, 40000000),
    ('PX23', 'TG6', 1, 77000000),
    ('PX23', 'TG12', 1, 60000000),
    ('PX23', 'TG13', 1, 77500000),
    ('PX23', 'TG14', 1, 25000000),
    ('PX24', 'XS11', 1, 47000000),
    ('PX24', 'TG14', 1, 25000000),
    ('PX24', 'TG3', 1, 38000000),
    ('PX24', 'TG11', 1, 40000000),
    ('PX25', 'XS10', 2, 18500000),
    ('PX25', 'TG13', 1, 77500000),
    ('PX25', 'TG3', 1, 38000000),
    ('PX26', 'TG10', 1, 145000000),
    ('PX26', 'XS9', 1, 18000000),
    ('PX26', 'TG5', 1, 57000000),
    ('PX26', 'TG9', 1, 17000000),
    ('PX26', 'TG3', 1, 38000000),
    ('PX3', 'XS11', 1, 47000000),
    ('PX3', 'TG5', 1, 57000000),
    ('PX3', 'XS8', 1, 27500000),
    ('PX4', 'XS9', 1, 18000000),
    ('PX4', 'XS10', 1, 18500000),
    ('PX4', 'XS5', 1, 28000000),
    ('PX5', 'TG10', 1, 145000000),
    ('PX5', 'XS10', 1, 18500000),
    ('PX5', 'TG14', 1, 25000000),
    ('PX5', 'TG2', 1, 49000000),
    ('PX5', 'TG11', 1, 40000000),
    ('PX6', 'XS1', 1, 17500000),
    ('PX6', 'XS2', 1, 46500000),
    ('PX6', 'XS4', 1, 21000000),
    ('PX6', 'XS5', 1, 28000000),
    ('PX7', 'TG10', 1, 145000000),
    ('PX7', 'TG13', 1, 77500000),
    ('PX7', 'XS7', 1, 49000000),
    ('PX8', 'TG10', 1, 145000000),
    ('PX8', 'XS11', 1, 47000000),
    ('PX8', 'TG13', 1, 22000000),
    ('PX8', 'TG9', 1, 17000000),
    ('PX9', 'TG5', 1, 57000000),
    ('PX9', 'XS7', 1, 49000000),
    ('PX9', 'XS8', 1, 27500000);


-- --------------------------------------------------------



-- Indexes for dumped tables
--

--
-- Indexes for table  Account 
--
ALTER TABLE  Account 
  ADD PRIMARY KEY ( userName ) USING BTREE;

--
-- Indexes for table  ChiTietPhieuNhap 
--
ALTER TABLE  ChiTietPhieuNhap 
  ADD PRIMARY KEY ( maPhieu , maXe ),
  ADD KEY  FK_ChiTietPhieuNhap_XeMay  ( maXe );

--
-- Indexes for table  ChiTietPhieuXuat 
--
ALTER TABLE  ChiTietPhieuXuat 
  ADD PRIMARY KEY ( maPhieu , maXe ),
  ADD KEY  FK_ChiTietPhieuXuat_XeMay  ( maXe );

--
-- Indexes for table  MayTinh 
--
ALTER TABLE  XeMay 
  ADD PRIMARY KEY ( maXe );

--
-- Indexes for table  NhaCungCap 
--
ALTER TABLE  NhaCungCap 
  ADD PRIMARY KEY ( maNhaCungCap );

--
-- Indexes for table  PhieuNhap 
--
ALTER TABLE  PhieuNhap 
  ADD PRIMARY KEY ( maPhieu ),
  ADD KEY  FK_PhieuNhap_NhaCungCap  ( maNhaCungCap ),
  ADD KEY  FK_PhieuNhap_Account  ( nguoiTao );

--
-- Indexes for table  PhieuXuat 
--
ALTER TABLE  PhieuXuat 
  ADD PRIMARY KEY ( maPhieu ),
  ADD KEY  FK_PhieuXuat_Account  ( nguoiTao );

--
-- Constraints for dumped tables
--

--
-- Constraints for table  ChiTietPhieuNhap 
--
ALTER TABLE  ChiTietPhieuNhap 
  ADD CONSTRAINT  FK_ChiTietPhieuNhap_XeMay  FOREIGN KEY ( maXe ) REFERENCES  XeMay  ( maXe ) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT  FK_ChiTietPhieuNhap_PhieuNhap  FOREIGN KEY ( maPhieu ) REFERENCES  PhieuNhap  ( maPhieu ) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table  ChiTietPhieuXuat 
--
ALTER TABLE  ChiTietPhieuXuat 
  ADD CONSTRAINT  FK_ChiTietPhieuXuat_XeMay  FOREIGN KEY ( maXe ) REFERENCES  XeMay  ( maXe ) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT  FK_ChiTietPhieuXuat_PhieuXuat  FOREIGN KEY ( maPhieu ) REFERENCES  PhieuXuat  ( maPhieu ) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table  PhieuNhap 
--
ALTER TABLE  PhieuNhap 
  ADD CONSTRAINT  FK_PhieuNhap_Account  FOREIGN KEY ( nguoiTao ) REFERENCES  Account  ( userName ) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT  FK_PhieuNhap_NhaCungCap  FOREIGN KEY ( maNhaCungCap ) REFERENCES  NhaCungCap  ( maNhaCungCap ) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table  PhieuXuat 
--
ALTER TABLE  PhieuXuat 
  ADD CONSTRAINT  FK_PhieuXuat_Account  FOREIGN KEY ( nguoiTao ) REFERENCES  Account  ( userName ) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


