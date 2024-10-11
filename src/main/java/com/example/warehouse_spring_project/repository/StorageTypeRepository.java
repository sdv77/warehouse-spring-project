package com.example.warehouse_spring_project.repository;

import com.example.warehouse_spring_project.entity.StorageType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageTypeRepository extends JpaRepository<StorageType, Long> {}

