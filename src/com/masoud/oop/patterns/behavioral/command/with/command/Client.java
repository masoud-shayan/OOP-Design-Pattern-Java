package com.masoud.oop.patterns.behavioral.command.with.command;

import com.masoud.oop.patterns.behavioral.command.with.command.b.Stock;
import com.masoud.oop.patterns.behavioral.command.with.command.c.BuyStock;
import com.masoud.oop.patterns.behavioral.command.with.command.c.SellStock;
import com.masoud.oop.patterns.behavioral.command.with.command.d.Broker;

public class Client {
    public static void main(String[] args) {

        // with Command Design pattern
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

    }
}
