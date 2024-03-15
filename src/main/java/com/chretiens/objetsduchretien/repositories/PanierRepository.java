package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.Panier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PanierRepository extends CrudRepository<Panier, Integer> {
}
