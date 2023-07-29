package com.masoud.oop.patterns.behavioral.command.without.command;


import com.masoud.oop.patterns.behavioral.command.without.command.a.StockOperation;
import com.masoud.oop.patterns.behavioral.command.without.command.b.Stock;
import com.masoud.oop.patterns.behavioral.command.without.command.c.Broker;

public class Client {
    public static void main(String[] args) {

        // without Command Design pattern
        // if you look more the Broker class must know which Operation should execute but with command pattern we didi not need it .
        Stock abcStock = new Stock();

        Broker broker = new Broker();
        broker.takeOrder(StockOperation.BUY,abcStock);
        broker.takeOrder(StockOperation.SELL,abcStock);

        broker.placeOrders();

    }
}
