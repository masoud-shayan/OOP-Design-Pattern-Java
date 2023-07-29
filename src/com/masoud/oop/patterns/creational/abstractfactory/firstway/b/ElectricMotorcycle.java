package com.masoud.oop.patterns.creational.abstractfactory.firstway.b;

import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.ElectricVehicle;

public class ElectricMotorcycle implements ElectricVehicle {

    @Override
    public void build() {
        System.out.println("Build Electric Motorcycle");
    }
}
