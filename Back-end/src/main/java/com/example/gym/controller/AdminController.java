package com.example.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gym.model.Admin;
import com.example.gym.service.AdminService;

@RestController
@RequestMapping("/admin")

public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/findAll")
    public List<Admin> findAll(){
        return adminService.findAllAdmin();
    }

    @PostMapping("/add")
    public Admin add(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    @DeleteMapping("/delete/{aid}")
        public void delete(@PathVariable Long aid){
            adminService.deleteAdmin(aid);
        }

      @PutMapping("/update/{aid}")
    public Admin update(@PathVariable Long aid, @RequestBody Admin updatedAdmin) {
        return adminService.updateAdmin(aid, updatedAdmin);
    }

    // Patch endpoint
    @PatchMapping("/patch/{aid}")
    public Admin patch(@PathVariable Long aid, @RequestBody Admin partialAdmin) {
        return adminService.patchAdmin(aid, partialAdmin);
    }
}
