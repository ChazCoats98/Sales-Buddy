package org.example.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.Set;
import java.util.HashSet;


@Entity
public class User {
    /**
     * User class.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String username;
    @NotNull
    @Email
    private String email;
    @NotNull
    @Pattern(regexp = "/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/\n",
    message = "Invalid password. Password must contain atleast 1 of the following: " +
            "uppercase letter, lowercase letter, number, special character")
    private String password;
    @OneToMany
    private Set<Order> orders = new HashSet<>();

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOrders(Order order) {
        this.orders.add(order);
    }
}
