package com.scahith.onlineFoodOrdering.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resturant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}