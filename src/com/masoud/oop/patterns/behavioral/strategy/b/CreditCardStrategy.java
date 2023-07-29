package com.masoud.oop.patterns.behavioral.strategy.b;

import com.masoud.oop.patterns.behavioral.strategy.a.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using credit card.");
        // Code to process payment using credit card
    }
}





