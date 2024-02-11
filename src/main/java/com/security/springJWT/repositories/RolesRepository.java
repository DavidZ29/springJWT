package com.security.springJWT.repositories;

import com.security.springJWT.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Long> {
    //method for search a rol for name in db
    Optional<Roles> findByName(String name);
}
