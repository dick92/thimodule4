package com.example.thimodule4.service;

import com.example.thimodule4.entity.KhachHang;
import com.example.thimodule4.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService   {
    @Autowired
    private KhachHangRepository khachHangRepository;


    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }


    public void save(KhachHang s) {
        khachHangRepository.save(s);
    }


    public void update(Long id, KhachHang s) {

    }

    public void remove(Long id) {
        khachHangRepository.deleteById(id);
    }


    public KhachHang findById(Long id) {
        return khachHangRepository.findById(id).orElse(null);
    }


    public List<KhachHang> findByName(String name) {
        return null;
    }


}