package com.example.thimodule4.controller;

import com.example.thimodule4.entity.GiaoDich;
import com.example.thimodule4.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@   RestController
@RequestMapping("/api/giaodich")
public class GiaoDichController {
    private final GiaoDichService giaoDichService;

    @Autowired
    public GiaoDichController(GiaoDichService giaoDichService) {
        this.giaoDichService = giaoDichService;
    }

    @GetMapping
    public List<GiaoDich> getAllGiaoDich() {
        return giaoDichService.getAllGiaoDich();
    }

    @GetMapping("/{id}")
    public Optional<GiaoDich> getGiaoDichById(@PathVariable Long id) {
        return giaoDichService.getGiaoDichById(id);
    }
}