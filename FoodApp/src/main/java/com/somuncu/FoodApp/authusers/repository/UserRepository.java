package com.somuncu.FoodApp.authusers.repository;

import com.somuncu.FoodApp.authusers.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {

    public Optional<User> findUserByEmail(String email);
    public boolean existsByEmail(String email);
}
