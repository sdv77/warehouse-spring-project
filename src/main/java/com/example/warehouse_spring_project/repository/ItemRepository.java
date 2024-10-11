package com.example.warehouse_spring_project.repository;

import com.example.warehouse_spring_project.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {}
