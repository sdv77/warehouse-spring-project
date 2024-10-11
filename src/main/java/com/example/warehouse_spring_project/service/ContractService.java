package com.example.warehouse_spring_project.service;

import com.example.warehouse_spring_project.entity.Contract;
import com.example.warehouse_spring_project.repository.ContractRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public void deleteContract(Long id) {
        contractRepository.deleteById(id);
    }

    public Contract getContractById(Long id) {
        return contractRepository.findById(id).orElse(null);
    }
}
