package com.masoud.oop.patterns.creational.abstractfactory.secondway;


import com.masoud.oop.patterns.creational.abstractfactory.secondway.a.ElectricVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.a.GasolineVehicle;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.c.VehicleAbstractFactory;
import com.masoud.oop.patterns.creational.abstractfactory.secondway.e.FactoryProvider;

public class Client {
    public static void main(String[] args) {

        VehicleAbstractFactory electricFactory = FactoryProvider.getFactory("ELECTRIC");
        ElectricVehicle electricCar = (ElectricVehicle) electricFactory.createVehicle("CAR");
        ElectricVehicle electricMotor = (ElectricVehicle) electricFactory.createVehicle("MOTORCYCLE");
        electricCar.build();
        electricMotor.build();


        VehicleAbstractFactory gasolineFactory = FactoryProvider.getFactory("GASOLINE");
        GasolineVehicle gasolineCar = (GasolineVehicle) gasolineFactory.createVehicle("CAR");
        GasolineVehicle gasolineMotor = (GasolineVehicle) gasolineFactory.createVehicle("MOTORCYCLE");
        gasolineCar.build();
        gasolineMotor.build();

    }
}
