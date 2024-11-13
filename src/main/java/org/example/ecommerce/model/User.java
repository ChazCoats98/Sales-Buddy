package org.example.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


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
}
