package com.scahith.onlineFoodOrdering.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scahith.onlineFoodOrdering.dto.ResturantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String password;

    private USER_ROLE role;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    private List<ResturantDto> favorites = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Address> addresses = new ArrayList<>();
}