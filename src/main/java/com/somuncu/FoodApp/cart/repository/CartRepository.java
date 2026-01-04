package com.somuncu.FoodApp.cart.repository;

import com.somuncu.FoodApp.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Long> {

    public Optional<Cart> findCartByUserId(Long id);
}
