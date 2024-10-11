package com.example.warehouse_spring_project.repository;

import com.example.warehouse_spring_project.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {}
