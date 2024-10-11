package com.example.warehouse_spring_project.service;

import com.example.warehouse_spring_project.entity.StorageType;
import com.example.warehouse_spring_project.repository.StorageTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageTypeService {
    private final StorageTypeRepository storageTypeRepository;

    public StorageTypeService(StorageTypeRepository storageTypeRepository) {
        this.storageTypeRepository = storageTypeRepository;
    }

    public List<StorageType> getAllStorageTypes() {
        return storageTypeRepository.findAll();
    }

    public StorageType saveStorageType(StorageType storageType) {
        return storageTypeRepository.save(storageType);
    }

    public void deleteStorageType(Long id) {
        storageTypeRepository.deleteById(id);
    }

    public StorageType getStorageTypeById(Long id) {
        return storageTypeRepository.findById(id).orElse(null);
    }
}
