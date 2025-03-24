package com.example.thimodule4.service.impl;

import com.example.thimodule4.entity.GiaoDich;
import com.example.thimodule4.repository.GiaoDichRepository;
import com.example.thimodule4.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class GiaoDichServiceImpl implements GiaoDichService {
    @Autowired
    private GiaoDichRepository giaoDichRepository;

    @Override
    public List<GiaoDich> getAllGiaoDich() {
        return giaoDichRepository.findAll();
    }

    @Override
    public Optional<GiaoDich> getGiaoDichById(Long id) {
        return giaoDichRepository.findById(id);
    }

    @Override
    public GiaoDich saveGiaoDich(GiaoDich giaoDich) {
        return giaoDichRepository.save(giaoDich);
    }

    @Override
    public void deleteGiaoDich(Long id) {
        giaoDichRepository.deleteById(id);
    }
}
