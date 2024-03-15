package com.chretiens.objetsduchretien.controller;


import com.chretiens.objetsduchretien.Service.CommandeService;
import com.chretiens.objetsduchretien.Service.DonService;
import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.domain.Commande;
import com.chretiens.objetsduchretien.domain.Don;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.dto.CommandeRequestDto;
import com.chretiens.objetsduchretien.dto.DonRequestDto;
import com.chretiens.objetsduchretien.dto.ProductRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DonController {

    @Autowired
    private DonService donService;


    @PostMapping("/api/v1/don")
    public ResponseEntity<Don> create(@RequestBody DonRequestDto dto) {
        Don don= donService.add(dto.getNameDonateur(), dto.getObjetDon());
        return ResponseEntity.status(201).body(don);

}
}