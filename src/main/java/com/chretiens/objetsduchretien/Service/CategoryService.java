package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.exceptions.CategoryExistsException;

public interface CategoryService {
    Category add(String name) throws CategoryExistsException;

    Category add(String name, String description);

    Category addProduct(Category category, Product product);


    Category addProduct();

    Category findById(int id);


}


    //Cette méthode est utilisée pour récupérer tous les produits
   // @Override
    //public Iterable<Category> list() {
       // return null;
   // }

    // Cette méthode  spécifique à la logique métier liée à un produit,
   // @Override
   // public Category decrement(Category category) {
       // return null;
   // }
