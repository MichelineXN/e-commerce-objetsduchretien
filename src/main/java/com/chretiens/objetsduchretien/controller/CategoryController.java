package com.chretiens.objetsduchretien.controller;

import com.chretiens.objetsduchretien.Service.CategoryService;
import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class CategoryController {

@Autowired
private CategoryService categoryService;

@Autowired
    private ProductService productService;

    @PostMapping("/api/v1/categories")
    public ResponseEntity<Category> create(@RequestBody ProductRequestDto dto) {
        Category category = categoryService.add(dto.getName(), dto.getDescription());
        return ResponseEntity.status(201).body(category);

    }
    @PostMapping("api/v1/categories/{categoryId}/products/{productId}")
    public ResponseEntity<Category> addProduct(@PathVariable("categoryId") int categoryId, @PathVariable("productId") int productId){
        Category category = categoryService.findById(categoryId);
        Product product = productService.findById(productId);
        categoryService.addProduct(category, product);
        return ResponseEntity.status(200).body(category);

    }
}
