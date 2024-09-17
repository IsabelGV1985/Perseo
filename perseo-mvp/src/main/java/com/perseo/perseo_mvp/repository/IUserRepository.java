package com.perseo.perseo_mvp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.perseo.models.User;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);


}