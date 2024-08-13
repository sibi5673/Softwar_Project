package com.example.gym.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gym.model.Admin;

public interface AdminRepo extends JpaRepository <Admin, Long> {
}
