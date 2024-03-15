package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Commande;
import com.chretiens.objetsduchretien.domain.Panier;
import com.chretiens.objetsduchretien.domain.Product;

public interface PanierService {
    //Ajoute un panier avec le nom spécifié
    Panier add(String name);


    // Ajoute un panier avec le nom d'utilisateur et le statut de paiement spécifiés
    Panier add(String userName, String statusPaiement);
    Panier findById(int id);


    //Cette méthode est utilisée pour récupérer tous les produits
    // @Override
    //public Iterable<Panier> list() {
    // return null;
    // }

    // Cette méthode  spécifique à la logique métier liée à un produit,
    // @Override
    // public Panier decrement(Panier panier) {
    // return null;
    // }
}