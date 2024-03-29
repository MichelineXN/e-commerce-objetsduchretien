package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    Category findByName(String name);
}
