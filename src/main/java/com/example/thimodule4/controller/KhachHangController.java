package com.example.thimodule4.controller;

import com.example.thimodule4.entity.KhachHang;
import com.example.thimodule4.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/khachhang")
public class KhachHangController {
    private final KhachHangService khachHangService;

    @Autowired
    public KhachHangController(KhachHangService khachHangService) {
        this.khachHangService = khachHangService;
    }
    @GetMapping("/khachhang")
    public String listKhachHang(Model model) {
        List<KhachHang> khachHangs = khachHangService.getAllKhachHang();
        model.addAttribute("khachHangs", khachHangs);
        return "index"; // Trả về file index.html trong thư mục templates
    }
    @GetMapping
    public List<KhachHang> getAllKhachHang() {
        return khachHangService.getAllKhachHang();
    }

    @GetMapping("/{id}")
    public Optional<KhachHang> getKhachHangById(@PathVariable Long id) {
        return khachHangService.getKhachHangById(id);
    }
}