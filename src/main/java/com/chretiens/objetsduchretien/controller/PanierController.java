package com.chretiens.objetsduchretien.controller;


import com.chretiens.objetsduchretien.Service.CategoryService;
import com.chretiens.objetsduchretien.Service.PanierService;
import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Panier;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.dto.PanierRequestDto;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PanierController {

    @Autowired
    private PanierService panierService;

    @PostMapping("/api/v1/panier")
    public ResponseEntity<Panier> create(@RequestBody PanierRequestDto dto) {
        Panier panier = panierService.add(dto.getUserName(), dto.getStatusPaiement());
        return ResponseEntity.status(201).body(panier);

    }
}
