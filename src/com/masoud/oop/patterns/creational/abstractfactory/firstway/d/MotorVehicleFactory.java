package com.masoud.oop.patterns.creational.abstractfactory.firstway.d;

import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.ElectricVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.GasolineVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.b.ElectricMotorcycle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.b.GasolineMotorcycle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.c.VehicleAbstractFactory;

public class MotorVehicleFactory extends VehicleAbstractFactory {
    @Override
    public GasolineVehicle createGasolineVehicle() {
        return new GasolineMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new ElectricMotorcycle();
    }
}
