package com.masoud.oop.patterns.creational.abstractfactory.secondway.d;

import com.masoud.oop.patterns.creational.abstractfactory.secondway.a.GasolineVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.b.GasolineCar;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.b.GasolineMotorcycle;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.c.VehicleAbstractFactory;

public class GasolineVehicleFactory implements VehicleAbstractFactory<GasolineVehicle> {

    @Override
    public GasolineVehicle createVehicle(String vehicleType) {

        switch (vehicleType) {
            case "MOTORCYCLE":
                return new GasolineMotorcycle();
            case "CAR":
                return new GasolineCar();
            default:
                return null;
        }
    }
}
