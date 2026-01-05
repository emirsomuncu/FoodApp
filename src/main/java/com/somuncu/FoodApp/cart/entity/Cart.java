package com.somuncu.FoodApp.cart.entity;

import com.somuncu.FoodApp.auth_users.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "carts")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String promoCode;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart" ,  cascade = CascadeType.ALL , orphanRemoval = true)
    private List<CartItem> cartItems;


}
