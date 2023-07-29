package com.masoud.oop.patterns.creational.abstractfactory.firstway.c;

import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.ElectricVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.a.GasolineVehicle;

public abstract class VehicleAbstractFactory {
    public abstract GasolineVehicle createGasolineVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}
