package com.chretiens.objetsduchretien.controller;


import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.Service.RoleService;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.domain.Role;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import com.chretiens.objetsduchretien.dto.RoleRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/api/v1/roles")
    public ResponseEntity<Role> create(@RequestBody RoleRequestDto dto){
        Role role = roleService.add(dto.getNameRole(), dto.getNameRole());
        return ResponseEntity.status(201).body(role);

    }
}
