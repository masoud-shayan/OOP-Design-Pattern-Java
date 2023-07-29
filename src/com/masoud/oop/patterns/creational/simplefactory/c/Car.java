package com.masoud.oop.patterns.creational.simplefactory.c;

import com.masoud.oop.patterns.creational.simplefactory.a.Vehicle;

public class Car implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
