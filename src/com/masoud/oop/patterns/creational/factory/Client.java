package com.masoud.oop.patterns.creational.factory;

import com.masoud.oop.patterns.creational.factory.a.Vehicle;
import com.masoud.oop.patterns.creational.factory.d.VehicleFactory;
import com.masoud.oop.patterns.creational.factory.e.MotorCycleFactory;
import com.masoud.oop.patterns.creational.factory.f.CarFactory;


public class Client {
    public static void main(String[] args) {


        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.getInstance();


        VehicleFactory motorFactory = new MotorCycleFactory();
        Vehicle motor = motorFactory.getInstance();

    }
}
