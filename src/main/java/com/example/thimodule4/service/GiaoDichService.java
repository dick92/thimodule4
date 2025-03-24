package com.example.thimodule4.service;

import com.example.thimodule4.entity.GiaoDich;

import java.util.List;
import java.util.Optional;

public interface GiaoDichService {
    List<GiaoDich> getAllGiaoDich();
    Optional<GiaoDich> getGiaoDichById(Long id);
    GiaoDich saveGiaoDich(GiaoDich giaoDich);
    void deleteGiaoDich(Long id);
}
