package com.chretiens.objetsduchretien.controller;


import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/api/v1/products")

    public ResponseEntity<Product> create(@RequestBody ProductRequestDto dto) {
        Product product=productService.add(dto.getName(), dto.getQuantiteStock());
        return ResponseEntity.status(201).body(product);

       // Product product = productService.add(dto.getName(), dto.getPrice());
        //productService.add(dto.getDescription(), dto.getDescription();
       // productService.add(dto.getPrice(1.2), dto.getPrice());
    }
   // Modiffie
    @GetMapping("/api/V1/products")
    public ResponseEntity<Iterable<Product>> list() {
        Iterable<Product> products = productService.list();
        return ResponseEntity.status(200).body(products);


        //  1.    Modiffiele produit
        //  PUT  /api/v1/products/{id]
        //  2.    Modifie le stock du produit
        //  PUT  /api/v1/products/{id]/stock
        //  3.   On décrimente le stock du produit
        // POST /api/v1/products/{id]/decrement

        @PostMapping("/api/v1/products/{id}/decrement")
        public ResponseEntity<Product> decrement(@PathVariable("id") int id) {
          Product product = productService.findById(id);
          product = productService.decrement(product);
          return ResponseEntity.status(200).body(Collections.singleton(product));
        }
    }
    }