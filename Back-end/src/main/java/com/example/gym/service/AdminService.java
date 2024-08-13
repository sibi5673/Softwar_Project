package com.example.gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gym.model.Admin;
import com.example.gym.repo.AdminRepo;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepo adminRepo;

    public List<Admin> findAllAdmin(){
        return adminRepo.findAll();
    }

    public Admin addAdmin(Admin admin){
        return adminRepo.save(admin);
    }

      // Update method
      public Admin updateAdmin(Long aid, Admin updatedAdmin) {
        if (adminRepo.existsById(aid)) {
            updatedAdmin.setAid(aid);
            return adminRepo.save(updatedAdmin);
        } else {
            // Handle the case where the Admin doesn't exist
            throw new RuntimeException("Admin not found with id: " + aid);
        }
    }

     public Admin patchAdmin(Long aid, Admin partialAdmin) {
        Optional<Admin> existingAdminOpt = adminRepo.findById(aid);
        if (existingAdminOpt.isPresent()) {
            Admin existingAdmin = existingAdminOpt.get();

            if (partialAdmin.getAname() != null) {
                existingAdmin.setAname(partialAdmin.getAname());
            }
            // Add more fields to update as needed

            return adminRepo.save(existingAdmin);
        } else {
            // Handle the case where the Admin doesn't exist
            throw new RuntimeException("Admin not found with id: " + aid);
        }
    }

    public void deleteAdmin(Long aid){
        adminRepo.deleteById(aid);
    }
    
}
