package com.example.gym.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gym.model.User;

public interface UserRepo extends JpaRepository <User, Long>{

}
