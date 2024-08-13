package com.example.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gym.model.User;
import com.example.gym.service.UserService;

@RestController
@RequestMapping("/users")

public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAllUsers();
    }

    @GetMapping("/findById/{uId}")
    public User findById(@PathVariable Long userId) {
        return userService.findUserById(userId);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userService.addUser(user);
    }

       @PutMapping("/update/{uid}")
    public User update(@PathVariable Long uid, @RequestBody User updatedUser) {
        return userService.updateUser(uid, updatedUser);
    }

     @DeleteMapping("/delete/{uid}")
    public void delete(@PathVariable Long uid) {
        userService.deleteUser(uid);
    }
}
