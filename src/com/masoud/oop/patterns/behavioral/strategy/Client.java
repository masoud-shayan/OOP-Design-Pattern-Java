package com.masoud.oop.patterns.behavioral.strategy;

import com.masoud.oop.patterns.behavioral.strategy.b.CreditCardStrategy;
import com.masoud.oop.patterns.behavioral.strategy.b.PayPalStrategy;
import com.masoud.oop.patterns.behavioral.strategy.c.ShoppingCart;

public class Client {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardStrategy("1234 5678 9012 3456", "12/24", "123"));
        cart.checkout(100.00);

        cart.setPaymentStrategy(new PayPalStrategy("example@example.com", "password123"));
        cart.checkout(50.00);
    }
}
