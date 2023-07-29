package com.masoud.oop.patterns.behavioral.command.without.command.c;

import com.masoud.oop.patterns.behavioral.command.without.command.a.StockOperation;
import com.masoud.oop.patterns.behavioral.command.without.command.b.Stock;

import java.util.HashMap;
import java.util.Map;

public class Broker {
    private Map<StockOperation, Stock> stockMap;

    public Broker() {
        this.stockMap = new HashMap<>();
    }

    public void takeOrder(StockOperation stockOperation, Stock stock) {
        stockMap.put(stockOperation, stock);
    }

    public void placeOrders() {

        stockMap.forEach((x, y) -> {
            if (x.equals(StockOperation.SELL)) {
                y.sell();
            } else {
                y.buy();
            }
        });

        stockMap.clear();
    }
}