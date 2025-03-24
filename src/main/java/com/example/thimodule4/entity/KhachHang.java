package com.example.thimodule4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "khach_hang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_khach_hang", nullable = false)
    private String tenKhachHang;

    @Column(name = "so_dien_thoai", nullable = false, unique = true)
    private String soDienThoai;

    @Column(name = "email", nullable = false, unique = true)
    private String email;
}
