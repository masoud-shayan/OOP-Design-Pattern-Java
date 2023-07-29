package com.masoud.oop.patterns.behavioral.command.with.command.d;

import com.masoud.oop.patterns.behavioral.command.with.command.a.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList;

    public Broker() {
        this.orderList = new ArrayList<Order>();
    }

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}