package com.masoud.oop.patterns.creational.builder.secondway.c;

import com.masoud.oop.patterns.creational.builder.secondway.a.House;
import com.masoud.oop.patterns.creational.builder.secondway.b.HouseBuilder;

public class LuxuryHouseBuilder implements HouseBuilder {

    private House house;

    public LuxuryHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void walls() {
        this.house.setWalls("Many Great Walls");
    }

    @Override
    public void windows() {
        this.house.setWindows("Very Tall Windows");
    }

    @Override
    public void rooms() {
        this.house.setRooms("8 Rooms !!");
    }

    @Override
    public void kitchen() {
        this.house.setKitchen("3 Kitchen !!");
    }

    @Override
    public void swimmingPool() {
        this.house.setSwimmingPool("Multiple Swimming Poll");
    }

    @Override
    public void parking() {
        this.house.setParking("Multiple Parking");
    }

    @Override
    public House build() {
        return house;
    }
}
