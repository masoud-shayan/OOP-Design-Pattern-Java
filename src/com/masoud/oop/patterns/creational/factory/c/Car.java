package com.masoud.oop.patterns.creational.factory.c;

import com.masoud.oop.patterns.creational.factory.a.Vehicle;

public class Car implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
