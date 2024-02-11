package com.security.springJWT.repositories;

import com.security.springJWT.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    //method for search user with name
    Optional<UserEntity> findByUsername(String username);
    //methor for verifity a user exist y db
    Boolean existsByUsername(String username);

}
