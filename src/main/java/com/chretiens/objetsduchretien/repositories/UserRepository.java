package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
