package com.masoud.oop.patterns.creational.builder.secondway.b;

import com.masoud.oop.patterns.creational.builder.secondway.a.House;

public interface HouseBuilder {

    void walls();

    void windows();

    void rooms();

    void kitchen();

    void swimmingPool();

    void parking();

    House build();
}
