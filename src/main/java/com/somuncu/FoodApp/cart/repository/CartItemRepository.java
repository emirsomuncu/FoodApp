package com.somuncu.FoodApp.cart.repository;

import com.somuncu.FoodApp.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
}
