package com.masoud.oop.patterns.creational.abstractfactory.secondway.b;

import com.masoud.oop.patterns.creational.abstractfactory.secondway.a.ElectricVehicle;

public class ElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Build Electric Car");
    }
}
