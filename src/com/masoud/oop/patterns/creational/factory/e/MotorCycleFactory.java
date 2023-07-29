package com.masoud.oop.patterns.creational.factory.e;

import com.masoud.oop.patterns.creational.factory.a.Vehicle;
import com.masoud.oop.patterns.creational.factory.b.Motorcycle;
import com.masoud.oop.patterns.creational.factory.d.VehicleFactory;

public class MotorCycleFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Motorcycle();
    }
}
