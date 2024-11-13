package org.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class User {
    /**
     * User class.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
}
