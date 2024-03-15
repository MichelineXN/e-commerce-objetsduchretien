package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Don;
import com.chretiens.objetsduchretien.domain.Product;

public interface DonService {

    Don add(String name);

    Don add(String nameDonateur, String objetDon);

    Don findById(int id);

    //Cette méthode est utilisée pour récupérer tous les produits
    // @Override
    //public Iterable<Don> list() {
    // return null;
    // }

    // Cette méthode  spécifique à la logique métier liée à un produit,
    // @Override
    // public Category decrement(Don don) {
    // return null;
    // }
}
