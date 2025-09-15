package com.somuncu.FoodApp.authusers.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    private String phoneNumber;

    private String profileUrl;

    private String address;

    private Boolean isActive;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @OneToOne()
    private Cart cart;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Payment> payments;

}

