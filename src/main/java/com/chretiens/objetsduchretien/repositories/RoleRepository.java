package com.chretiens.objetsduchretien.repositories;

import com.chretiens.objetsduchretien.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
