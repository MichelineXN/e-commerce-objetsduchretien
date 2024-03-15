package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.RoleService;
import com.chretiens.objetsduchretien.domain.Role;
import com.chretiens.objetsduchretien.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role add(String nameRole, String name) {
        Role role = new Role();
        role.setNameRole(name);
        return roleRepository.save(role);
    }

    @Override
    public Role findById(int id) {
        return roleRepository.findById(id).orElse(null);
    }
}
