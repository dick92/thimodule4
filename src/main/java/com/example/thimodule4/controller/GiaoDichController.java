package com.example.thimodule4.controller;

import com.example.thimodule4.entity.GiaoDich;
import com.example.thimodule4.service.GiaoDichService;
import com.example.thimodule4.service.KhachHangService;
import com.example.thimodule4.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/giaodich")
public class GiaoDichController {
    @Autowired
    private GiaoDichService giaoDichService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private LoaiDichVuService loaiDichVuService;

    @GetMapping("/list")
    public String showList(Model model,
                           @RequestParam(value = "tenKhachHang",required = false)String tenKhachHang,
                           @RequestParam(value = "loaiDichVu",required = false)String loaiDichVu) {
        List<GiaoDich> giaoDichList ;
        if((tenKhachHang==null || tenKhachHang.isEmpty()) && (loaiDichVu==null || loaiDichVu.isEmpty())) {
            giaoDichList = giaoDichService.getAll();
        }else {
            giaoDichList = giaoDichService.search(tenKhachHang,loaiDichVu);
        }
        model.addAttribute("giaoDichList", giaoDichList);
        return "giaodich/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("giaoDich", new GiaoDich());
        model.addAttribute("khachHangList", khachHangService.getAll());
        model.addAttribute("loaiDichVuList", loaiDichVuService.getAll());
        return "giaodich/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("giaoDich")GiaoDich giaoDich,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("giaoDich", giaoDich);
            model.addAttribute("khachHangList", khachHangService.getAll());
            model.addAttribute("loaiDichVuList", loaiDichVuService.getAll());
            return "giaodich/create";
        }
        System.out.println("Dữ liệu nhận được: " + giaoDich); // Kiểm tra dữ liệu từ client

        giaoDichService.save(giaoDich);
        return "redirect:/giaodich/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable("id") String id, Model model) {
        GiaoDich giaoDich = giaoDichService.findById(id);
        if (giaoDich == null) {
            return "redirect:/giaodich/list";
        }
        model.addAttribute("giaoDich", giaoDich);
        return "giaodich/detail";
    }


}
