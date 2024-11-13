package org.example.ecommerce.model;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
public class Product {
    /**
     * Product class.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
}
