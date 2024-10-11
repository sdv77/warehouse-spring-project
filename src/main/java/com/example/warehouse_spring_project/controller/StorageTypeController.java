package com.example.warehouse_spring_project.controller;

import com.example.warehouse_spring_project.entity.StorageType;
import com.example.warehouse_spring_project.service.StorageTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storage-types")
public class StorageTypeController {
    private final StorageTypeService storageTypeService;

    public StorageTypeController(StorageTypeService storageTypeService) {
        this.storageTypeService = storageTypeService;
    }

    @GetMapping
    public List<StorageType> getAllStorageTypes() {
        return storageTypeService.getAllStorageTypes();
    }

    @GetMapping("/{id}")
    public StorageType getStorageTypeById(@PathVariable Long id) {
        return storageTypeService.getStorageTypeById(id);
    }

    @PostMapping
    public StorageType createStorageType(@Validated @RequestBody StorageType storageType) {
        return storageTypeService.saveStorageType(storageType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStorageType(@PathVariable Long id) {
        storageTypeService.deleteStorageType(id);
        return ResponseEntity.noContent().build();
    }
}
