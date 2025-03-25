package com.example.thimodule4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maKhachHang;
    @Column(nullable = false)
    private String tenKhachHang;

    @Column(nullable = false, unique = true)
    private String soDienThoai;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GiaoDich> giaoDichs;
}
