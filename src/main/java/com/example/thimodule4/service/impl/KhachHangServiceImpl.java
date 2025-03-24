package com.example.thimodule4.service.impl;

import com.example.thimodule4.entity.KhachHang;
import com.example.thimodule4.repository.KhachHangRepository;
import com.example.thimodule4.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    private final KhachHangRepository khachHangRepository;

    @Autowired
    public KhachHangServiceImpl(KhachHangRepository khachHangRepository) {
        this.khachHangRepository = khachHangRepository;
    }

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public Optional<KhachHang> getKhachHangById(Long id) {
        return khachHangRepository.findById(id);
    }
}
