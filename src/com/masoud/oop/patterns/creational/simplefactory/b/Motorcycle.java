package com.masoud.oop.patterns.creational.simplefactory.b;

import com.masoud.oop.patterns.creational.simplefactory.a.Vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
