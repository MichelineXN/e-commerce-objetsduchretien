package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Product;





public interface ProductService {

    // Ajoute un produit avec le nom et la quantité en stock spécifiés à l'inventaire
    Product add(String name, int quantiteStock);

    Product findById(int id);

    Iterable<Product> list();

    Product decrement(Product product);

}
