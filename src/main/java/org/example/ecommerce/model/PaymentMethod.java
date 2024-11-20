package org.example.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.regex.*;

@Entity
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String cardHolderFirstName;
    @NotNull
    private String cardHolderLastName;
    @NotNull
    private String cardType;
    @NotNull
    private String cardNumber;
    @NotNull
    private String zipCode;
    @NotNull
    private String cvv;

    private String getCardHolderFirstName() {
        return cardHolderFirstName;
    }

    private void setCardHolderFirstName(String cardHolderFirstName) {
        this.cardHolderFirstName = cardHolderFirstName;
    }

    private String getCardHolderLastName() {
        return cardHolderLastName;
    }

    private void setCardHolderLastName(String cardHolderLastName) {
        this.cardHolderLastName = cardHolderLastName;
    }

    private String getCardNumber() {
        return cardNumber;
    }

    private void setCardNumberAndType(String cardNumber) {
        Pattern visaPattern = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
        Pattern mastercardPattern = Pattern.compile("^5[1-5][0-9]{14}$");
        Pattern amexPattern = Pattern.compile("^3[47][0-9]{13}$");
        Pattern discoverPattern = Pattern.compile("^6(?:011|5[0-9]{2})[0-9]{12}$");

        if (visaPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "Visa";
        } else if (mastercardPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "Mastercard";
        } else if (amexPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "American Express";
        } else if(discoverPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "Discover";

        } else {
            throw new IllegalArgumentException("Error. Invalid card type");
        }
    }

    private String getCardType() {
        return cardType;
    }

    private String getZipCode() {
        return zipCode;
    }

    private void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private String getCvv() {
        return cvv;
    }

    private void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
