package com.chretiens.objetsduchretien.controller;


import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.Service.UserService;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.domain.User;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import com.chretiens.objetsduchretien.dto.UserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/api/v1/users")

    public ResponseEntity<User> create(@RequestBody UserRequestDto dto){
        User user = userService.add(dto.getName(), dto.getDateInscription());
        return ResponseEntity.status(201).body(user);

    }
}



