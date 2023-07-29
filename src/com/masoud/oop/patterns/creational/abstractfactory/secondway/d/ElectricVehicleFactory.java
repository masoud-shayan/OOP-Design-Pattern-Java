package com.masoud.oop.patterns.creational.abstractfactory.secondway.d;

import com.masoud.oop.patterns.creational.abstractfactory.secondway.a.ElectricVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.b.ElectricCar;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.b.ElectricMotorcycle;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.c.VehicleAbstractFactory;

public class ElectricVehicleFactory implements VehicleAbstractFactory<ElectricVehicle> {

    @Override
    public ElectricVehicle createVehicle(String vehicleType) {

        switch (vehicleType) {
            case "MOTORCYCLE":
                return new ElectricMotorcycle();
            case "CAR":
                return new ElectricCar();
            default:
                return null;
        }
    }
}
