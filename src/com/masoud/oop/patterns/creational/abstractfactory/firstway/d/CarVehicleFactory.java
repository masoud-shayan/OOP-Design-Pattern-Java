package com.masoud.oop.patterns.creational.abstractfactory.firstway.d;

import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.ElectricVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.GasolineVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.b.ElectricCar;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.b.GasolineCar;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.c.VehicleAbstractFactory;

public class CarVehicleFactory extends VehicleAbstractFactory {
    @Override
    public GasolineVehicle createGasolineVehicle() {
        return new GasolineCar();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ElectricCar();
    }
}
