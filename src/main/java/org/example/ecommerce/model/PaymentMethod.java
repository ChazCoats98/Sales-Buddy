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

    private void setCardNumber(String cardNumber) {
        Pattern visaPattern = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
        Pattern mastercardPattern = Pattern.compile("^5[1-5][0-9]{14}$");
        Pattern amexPattern = Pattern.compile("^3[47][0-9]{13}$");

        if (visaPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "Visa";
        } else if (mastercardPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "Mastercard";
        } else if (amexPattern.matcher(cardNumber).find()) {
            this.cardNumber = cardNumber;
            this.cardType = "American Express";
        }


    }


}
