package com.example.thimodule4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "giao_dich")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GiaoDich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "khach_hang_id", nullable = false)
    private KhachHang khachHang;

    @Column(name = "ngay_giao_dich", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ngayGiaoDich;

    @Column(name = "loai_dich_vu", nullable = false)
    private String loaiDichVu;

    @Column(name = "don_gia", nullable = false)
    private Double donGia;

    @Column(name = "dien_tich", nullable = false)
    private Double dienTich;
}