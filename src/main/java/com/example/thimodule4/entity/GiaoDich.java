package com.example.thimodule4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "giao_dich")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiaoDich {
    @Id
    @Column(name = "ma_giao_dich", unique = true, nullable = false)
    private String maGiaoDich;

    @ManyToOne
    @JoinColumn(name = "ma_khach_hang", nullable = false)
    private KhachHang khachHang;

    @Column(nullable = false)
    private Date ngayGiaoDich;

    @ManyToOne
    @JoinColumn(name = "ma_loai_dich_vu", nullable = false)
    private LoaiDichVu loaiDichVu;

    @Column(nullable = false)
    private Double donGia;

    @Column(nullable = false)
    private Double dienTich;
}