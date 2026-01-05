package com.somuncu.FoodApp.menu.entity;

import com.somuncu.FoodApp.cart.entity.CartItem;
import com.somuncu.FoodApp.category.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "menus")
public class Menu implements Serializable {  //means food

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "menu" , cascade =  CascadeType.ALL)
    private List<OrderItem> orderItems;

    @OneToMany(mappedBy = "menu" , cascade =  CascadeType.ALL , orphanRemoval = true)
    private List<Review> reviews;

}
