package org.example.ecommerce.model;

import java.math.BigDecimal;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Product {
    /**
     * Product class.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    @PositiveOrZero
    private BigDecimal price;
    @NotNull
    @PositiveOrZero
    private int stock;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private boolean getInStock() {
        return stock == 0;
    }
}
