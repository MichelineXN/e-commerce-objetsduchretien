package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.PanierService;
import com.chretiens.objetsduchretien.domain.Panier;
import com.chretiens.objetsduchretien.repositories.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PanierServiceImpl implements PanierService {

    @Autowired
    private PanierRepository panierRepository;

    @Override
    public Panier add(String name) {
        Panier panier = new Panier();
        panier.setUserName(name);
        return panierRepository.save(panier);
    }

    @Override
    public Panier add(String userName, String statusPaiement) {
        Panier panier = new Panier();

        return panierRepository.save(panier);
    }

    @Override
    public Panier findById(int id) {
        return panierRepository.findById(id).orElse(null);
    }
}
