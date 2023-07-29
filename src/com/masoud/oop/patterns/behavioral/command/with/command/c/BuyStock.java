package com.masoud.oop.patterns.behavioral.command.with.command.c;

import com.masoud.oop.patterns.behavioral.command.with.command.a.Order;
import com.masoud.oop.patterns.behavioral.command.with.command.b.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}