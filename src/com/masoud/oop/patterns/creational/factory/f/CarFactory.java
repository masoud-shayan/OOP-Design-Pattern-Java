package com.masoud.oop.patterns.creational.factory.f;

import com.masoud.oop.patterns.creational.factory.a.Vehicle;
import com.masoud.oop.patterns.creational.factory.c.Car;
import com.masoud.oop.patterns.creational.factory.d.VehicleFactory;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
