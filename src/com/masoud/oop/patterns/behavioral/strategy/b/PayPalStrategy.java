package com.masoud.oop.patterns.behavioral.strategy.b;

import com.masoud.oop.patterns.behavioral.strategy.a.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
        // Code to process payment using PayPal
    }
}