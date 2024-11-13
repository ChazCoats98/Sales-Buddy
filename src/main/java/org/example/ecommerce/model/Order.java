package org.example.ecommerce.model;

import jakarta.persistence.*;
import java.util.Date;
import java.math.BigDecimal;

@Entity
public class Order {
    /**
     * Order class.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private BigDecimal orderTotal;
    private String status;
    private Date orderDate;
    private String paymentMethod;
}
