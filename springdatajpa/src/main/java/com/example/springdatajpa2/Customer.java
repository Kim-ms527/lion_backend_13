package com.example.springdatajpa2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "jpa_customer")
@Getter@Setter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
