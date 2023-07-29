package com.masoud.oop.patterns.creational.abstractfactory.secondway.b;

import com.masoud.oop.patterns.creational.abstractfactory.secondway.a.GasolineVehicle;

public class GasolineMotorcycle implements GasolineVehicle {

    @Override
    public void build() {
        System.out.println("Build Gasoline Motorcycle");
    }
}
