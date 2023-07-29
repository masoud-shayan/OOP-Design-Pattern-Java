package com.masoud.oop.patterns.creational.abstractfactory.firstway;


import com.masoud.oop.patterns.creational.abstractfactory.firstway.c.VehicleAbstractFactory;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.d.CarVehicleFactory;
import com.masoud.oop.patterns.creational.abstractfactory.firstway.d.MotorVehicleFactory;

public class Client {
    public static void main(String[] args) {

        VehicleAbstractFactory carVehicleFactory = new CarVehicleFactory();
        carVehicleFactory.createElectricVehicle().build();
        carVehicleFactory.createGasolineVehicle().build();


        VehicleAbstractFactory motorVehicleFactory = new MotorVehicleFactory();
        motorVehicleFactory.createElectricVehicle().build();
        motorVehicleFactory.createGasolineVehicle().build();

    }
}
