package com.masoud.oop.patterns.creational.abstractfactory.secondway.e;

import com.masoud.oop.patterns.creational.abstractfactory.secondway.c.VehicleAbstractFactory;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.d.ElectricVehicleFactory;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.d.GasolineVehicleFactory;

public class FactoryProvider {
    public static VehicleAbstractFactory getFactory(String choice) {
        switch (choice) {
            case "ELECTRIC":
                return new ElectricVehicleFactory();
            case "GASOLINE":
                return new GasolineVehicleFactory();
            default:
                return null;
        }
    }
}
