package com.masoud.oop.patterns.creational.factory.b;

import com.masoud.oop.patterns.creational.factory.a.Vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
