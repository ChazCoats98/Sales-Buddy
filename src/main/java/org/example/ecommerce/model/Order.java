package org.example.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

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
    @NotNull
    private BigDecimal orderTotal;
    @NotNull
    private String status;
    @NotNull
    private Date orderDate;
    @NotNull
    private PaymentMethod paymentMethod;
    @NotNull
    private Address shippingAddress;
    @NotNull
    private Address billingAddress;

    private BigDecimal getOrderTotal() {
        return orderTotal;
    }

    private void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    private String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    private Date getOrderDate() {
        return orderDate;
    }

    private void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    private PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    private void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private Address getShippingAddress() {
        return shippingAddress;
    }

    private void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    private Address getBillingAddress() {
        return billingAddress;
    }

    private void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
