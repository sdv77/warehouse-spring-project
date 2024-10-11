package com.example.warehouse_spring_project.repository;

import com.example.warehouse_spring_project.entity.CellItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellItemRepository extends JpaRepository<CellItem, Long> {}
