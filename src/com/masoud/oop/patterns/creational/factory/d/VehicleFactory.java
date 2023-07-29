package com.masoud.oop.patterns.creational.factory.d;

import com.masoud.oop.patterns.creational.factory.a.Vehicle;

public abstract class VehicleFactory {
    public Vehicle getInstance() {
        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;
    }
    protected abstract Vehicle createVehicle();
}
