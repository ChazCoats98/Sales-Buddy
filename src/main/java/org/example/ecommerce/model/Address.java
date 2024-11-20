package org.example.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Address {
    /**
     * Address class.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String country;
    @NotNull
    private String state;
    @NotNull
    private String city;
    @NotNull
    private String street;
    @NotNull
    private String zipCode;

    private String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    private String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }

    private String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private String getZipCode() {
        return zipCode;
    }

    private void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
