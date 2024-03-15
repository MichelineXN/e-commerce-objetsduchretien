package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRpository extends CrudRepository<Product, Integer> {
}
