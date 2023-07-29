package com.masoud.oop.patterns.creational.simplefactory.d;

import com.masoud.oop.patterns.creational.simplefactory.a.Vehicle;
import com.masoud.oop.patterns.creational.simplefactory.b.Motorcycle;
import com.masoud.oop.patterns.creational.simplefactory.c.Car;

public class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle getInstance(String vehicleType) {
        switch (vehicleType) {
            case "CAR":
                return new Car();
            case "MOTORCYCLE":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Not supported");
        }
    }
}
