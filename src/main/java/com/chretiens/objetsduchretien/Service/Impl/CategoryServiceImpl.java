package com.chretiens.objetsduchretien.Service.Impl;

import com.chretiens.objetsduchretien.Service.CategoryService;
import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.exceptions.CategoryExistsException;
import com.chretiens.objetsduchretien.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {


    // Je récupère le Rpository, je prneds l'objet
    @Autowired
    private CategoryRepository categoryRepository;



    @Override
    public Category add(String name) throws CategoryExistsException {
        Category exixtingCategory = categoryRepository.findByName(name);
        if (exixtingCategory != null) {
            throw  new CategoryExistsException();

        }
        Category category = new Category();
        category.setName(name);
        category.setDescription(name);

        return categoryRepository.save(category);
    }

    @Override
    public Category add(String name, String description) {
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }

    @Override
    public Category addProduct(Category category, Product product) {
        category.getProducts().add(product);
        return categoryRepository.save(category);
    }

    @Override
    public Category addProduct() {
        return null;
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
