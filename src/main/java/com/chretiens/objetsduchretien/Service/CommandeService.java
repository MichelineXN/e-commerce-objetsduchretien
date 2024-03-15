package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Commande;
import com.chretiens.objetsduchretien.domain.Product;

public interface CommandeService {
    Commande add(String name);



    Commande findById(int id);

    //Cette méthode est utilisée pour récupérer tous les produits
    // @Override
    //public Iterable<Commande> list() {
    // return null;
    // }

    // Cette méthode  spécifique à la logique métier liée à un produit,
    // @Override
    // public Category decrement(Commande commande) {
    // return null;
    // }
}
