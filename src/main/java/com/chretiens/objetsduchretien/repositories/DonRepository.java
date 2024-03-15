package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.Don;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface DonRepository extends CrudRepository<Don, Integer> {
}
