package com.example.warehouse_spring_project.controller;

import com.example.warehouse_spring_project.entity.Cell;
import com.example.warehouse_spring_project.service.CellService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cells")
public class CellController {
    private final CellService cellService;

    public CellController(CellService cellService) {
        this.cellService = cellService;
    }

    @GetMapping
    public List<Cell> getAllCells() {
        return cellService.getAllCells();
    }

    @GetMapping("/{id}")
    public Cell getCellById(@PathVariable Long id) {
        return cellService.getCellById(id);
    }

    @PostMapping
    public Cell createCell(@Validated @RequestBody Cell cell) {
        return cellService.saveCell(cell);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCell(@PathVariable Long id) {
        cellService.deleteCell(id);
        return ResponseEntity.noContent().build();
    }
}

