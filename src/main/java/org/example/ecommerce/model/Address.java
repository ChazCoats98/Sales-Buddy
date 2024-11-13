package org.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Address {
    /**
     * Address class.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String state;
    private String city;
    private String street;
    private int zipCode;
}
