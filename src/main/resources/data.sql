-- Tạo database
CREATE DATABASE quan_ly_giao_dich;
USE quan_ly_giao_dich;

-- Tạo bảng khách hàng
CREATE TABLE khach_hang (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            ten_khach_hang VARCHAR(255) NOT NULL,
                            so_dien_thoai VARCHAR(20) NOT NULL UNIQUE,
                            email VARCHAR(255) NOT NULL UNIQUE
);

-- Tạo bảng giao dịch
CREATE TABLE giao_dich (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           khach_hang_id BIGINT NOT NULL,
                           ngay_giao_dich DATE NOT NULL,
                           loai_dich_vu VARCHAR(255) NOT NULL,
                           don_gia DOUBLE NOT NULL,
                           dien_tich DOUBLE NOT NULL,
                           FOREIGN KEY (khach_hang_id) REFERENCES khach_hang(id) ON DELETE CASCADE
);
SELECT DATABASE();
