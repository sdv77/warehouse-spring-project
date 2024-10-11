package com.example.warehouse_spring_project.repository;

import com.example.warehouse_spring_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}

