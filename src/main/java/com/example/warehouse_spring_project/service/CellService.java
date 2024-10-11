package com.example.warehouse_spring_project.service;

import com.example.warehouse_spring_project.entity.Cell;
import com.example.warehouse_spring_project.repository.CellRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CellService {
    private final CellRepository cellRepository;

    public CellService(CellRepository cellRepository) {
        this.cellRepository = cellRepository;
    }

    public List<Cell> getAllCells() {
        return cellRepository.findAll();
    }

    public Cell saveCell(Cell cell) {
        return cellRepository.save(cell);
    }

    public void deleteCell(Long id) {
        cellRepository.deleteById(id);
    }

    public Cell getCellById(Long id) {
        return cellRepository.findById(id).orElse(null);
    }
}
