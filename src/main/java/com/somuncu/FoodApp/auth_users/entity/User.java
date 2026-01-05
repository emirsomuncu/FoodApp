package com.somuncu.FoodApp.auth_users.entity;

import com.somuncu.FoodApp.cart.entity.Cart;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SoftDelete;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(unique = true)
    private String email;

    @NotBlank(message = "password is required")
    private String password;

    private String phoneNumber;

    private String profileUrl;

    private String address;

    private Boolean active;

    private LocalDateTime  createdAt;
    private LocalDateTime updatedAt;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(mappedBy = "user" ,  cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "user" ,  cascade = CascadeType.ALL)
    private List<Payment> payments;

    @OneToOne(mappedBy = "user" ,   cascade = CascadeType.ALL)
    private Cart cart ;


}
