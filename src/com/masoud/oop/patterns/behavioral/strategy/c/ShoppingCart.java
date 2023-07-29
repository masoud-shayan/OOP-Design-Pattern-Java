package com.masoud.oop.patterns.behavioral.strategy.c;

import com.masoud.oop.patterns.behavioral.strategy.a.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        // Code to calculate total amount

        // Process payment using the chosen strategy
        paymentStrategy.pay(amount);
    }
}