package com.chretiens.objetsduchretien.controller;


import com.chretiens.objetsduchretien.Service.CommandeService;
import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.domain.Commande;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.dto.CommandeRequestDto;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import com.chretiens.objetsduchretien.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class CommandeContriller {

    @Autowired
    private CommandeService commandeService;

    @PostMapping("/api/v1/commande")
    public ResponseEntity<Commande> create(@RequestBody CommandeRequestDto dto){
        Commande commande = commandeService.add(dto.getDetailsCommande());
        return ResponseEntity.status(201).body(commande);

    }
}
