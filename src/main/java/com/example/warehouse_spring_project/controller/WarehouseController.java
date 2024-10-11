package com.example.warehouse_spring_project.controller;

import com.example.warehouse_spring_project.entity.Warehouse;
import com.example.warehouse_spring_project.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/warehouses")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    // Get all warehouses
    @GetMapping
    public List<Warehouse> getAllWarehouses() {
        return warehouseService.getAllWarehouses();
    }

    // Get warehouse by ID
    @GetMapping("/{id}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable Long id) {
        Optional<Warehouse> warehouse = warehouseService.getWarehouseById(id);
        return warehouse.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new warehouse
    @PostMapping
    public Warehouse createWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseService.createWarehouse(warehouse);
    }

    // Update a warehouse
    @PutMapping("/{id}")
    public ResponseEntity<Warehouse> updateWarehouse(@PathVariable Long id, @RequestBody Warehouse warehouseDetails) {
        Warehouse updatedWarehouse = warehouseService.updateWarehouse(id, warehouseDetails);
        return ResponseEntity.ok(updatedWarehouse);
    }

    // Delete a warehouse
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWarehouse(@PathVariable Long id) {
        warehouseService.deleteWarehouse(id);
        return ResponseEntity.noContent().build();
    }
}
