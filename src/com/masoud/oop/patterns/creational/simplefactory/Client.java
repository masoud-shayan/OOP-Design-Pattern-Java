package com.masoud.oop.patterns.creational.simplefactory;

import com.masoud.oop.patterns.creational.simplefactory.a.Vehicle;
import com.masoud.oop.patterns.creational.simplefactory.d.VehicleFactory;

public class Client {
    public static void main(String[] args) {


        Vehicle car = VehicleFactory.getInstance("CAR");
        car.build();


        Vehicle motorcycle = VehicleFactory.getInstance("MOTORCYCLE");
        motorcycle.build();
    }
}
