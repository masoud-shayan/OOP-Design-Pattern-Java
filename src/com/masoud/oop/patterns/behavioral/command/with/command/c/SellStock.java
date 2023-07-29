package com.masoud.oop.patterns.behavioral.command.with.command.c;

import com.masoud.oop.patterns.behavioral.command.with.command.a.Order;
import com.masoud.oop.patterns.behavioral.command.with.command.b.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}