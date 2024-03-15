package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeRepository extends CrudRepository<Commande, Integer> {
}
