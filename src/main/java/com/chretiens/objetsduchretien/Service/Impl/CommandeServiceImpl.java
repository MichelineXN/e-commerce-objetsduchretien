package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.CommandeService;
import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Commande;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.repositories.CategoryRepository;
import com.chretiens.objetsduchretien.repositories.CommandeRepository;
import com.chretiens.objetsduchretien.repositories.ProductRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;


    @Override
    public Commande add(String name) {
        Commande commande = new Commande();
        commande.setName(name);
        return commandeRepository.save(commande);



    }

    @Override
    public Commande findById(int id) {

        return commandeRepository.findById(id).orElse(null);
    }

}