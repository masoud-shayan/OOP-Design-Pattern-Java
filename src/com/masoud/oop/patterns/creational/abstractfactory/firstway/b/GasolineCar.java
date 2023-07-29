package com.masoud.oop.patterns.creational.abstractfactory.firstway.b;

import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.GasolineVehicle;

public class GasolineCar implements GasolineVehicle {
    @Override
    public void build() {
        System.out.println("Build Gasoline Car");
    }
}
