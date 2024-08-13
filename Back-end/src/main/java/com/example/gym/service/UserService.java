package com.example.gym.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gym.model.User;
import com.example.gym.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
     private UserRepo UserRepo;

     public List<User> findAllUsers() {
        return UserRepo.findAll();
     }

     public User findUserById(Long userId) {
      return UserRepo.findById(userId).orElse(null);
  }

     public User addUser(User user){
        return UserRepo.save(user);
     }

     public User updateUser(Long uid, User updatedUser) {
        if (UserRepo.existsById(uid)) {
            updatedUser.setUid(uid);
            return UserRepo.save(updatedUser);
        } else {
            // Handle the case where the Admin doesn't exist
            throw new RuntimeException("Admin not found with id: " + uid);
        }
    }

     public void deleteUser(Long uid){
      UserRepo.deleteById(uid);
     }
}
