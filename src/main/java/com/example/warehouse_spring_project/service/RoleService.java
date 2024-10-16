package com.example.warehouse_spring_project.service;

import com.example.warehouse_spring_project.entity.Role;
import com.example.warehouse_spring_project.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    public Role updateRole(Long id, Role roleDetails) {
        Role existingRole = roleRepository.findById(id).orElse(null);
        if (existingRole != null) {
            existingRole.setName(roleDetails.getName()); // Предположим, у вас есть поле 'name' в Role
            return roleRepository.save(existingRole);
        }
        return null; // или выбросьте исключение, если хотите
    }
}
