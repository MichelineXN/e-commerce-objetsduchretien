package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.ProductService;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.repositories.ProductRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRpository productRpository;

    @Override
    public Product add(String name, int quantiteStock) {
        Product product = new Product();
        product.setName(name);
        product.setQuantiteStock(quantiteStock);
        return productRpository.save (product);
        }

    @Override
    public Product findById(int id) {
        return productRpository.findById(id).orElse(null);
    }


    //Cette méthode est utilisée pour récupérer tous les produits
    @Override
    public Iterable<Product> list() {
        return null;
    }

   // Cette méthode  spécifique à la logique métier liée à un produit,
    @Override
    public Product decrement(Product product) {
        return null;
    }
}

