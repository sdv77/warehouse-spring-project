package com.example.warehouse_spring_project.service;

import com.example.warehouse_spring_project.entity.Warehouse;
import com.example.warehouse_spring_project.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    public Optional<Warehouse> getWarehouseById(Long id) {
        return warehouseRepository.findById(id);
    }

    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    public Warehouse updateWarehouse(Long id, Warehouse warehouseDetails) {
        Warehouse warehouse = warehouseRepository.findById(id).orElseThrow(() -> new RuntimeException("Warehouse not found"));
        warehouse.setCell(warehouseDetails.getCell());
        warehouse.setUser(warehouseDetails.getUser());
        return warehouseRepository.save(warehouse);
    }

    public void deleteWarehouse(Long id) {
        warehouseRepository.deleteById(id);
    }
}
