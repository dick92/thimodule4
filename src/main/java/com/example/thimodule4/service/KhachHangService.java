package com.example.thimodule4.service;

import com.example.thimodule4.entity.KhachHang;

import java.util.List;
import java.util.Optional;

public interface KhachHangService {
    List<KhachHang> getAllKhachHang();
    Optional<KhachHang> getKhachHangById(Long id);
}
