package com.example.warehouse_spring_project.repository;

import com.example.warehouse_spring_project.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
