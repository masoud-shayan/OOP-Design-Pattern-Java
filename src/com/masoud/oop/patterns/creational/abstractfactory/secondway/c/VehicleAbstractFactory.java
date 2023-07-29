package com.masoud.oop.patterns.creational.abstractfactory.secondway.c;

public interface VehicleAbstractFactory<T> {
    T createVehicle(String vehicleType);
}
