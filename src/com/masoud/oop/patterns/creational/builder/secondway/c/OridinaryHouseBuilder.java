package com.masoud.oop.patterns.creational.builder.secondway.c;

import com.masoud.oop.patterns.creational.builder.secondway.a.House;
import com.masoud.oop.patterns.creational.builder.secondway.b.HouseBuilder;

public class OridinaryHouseBuilder implements HouseBuilder {

    private House house;

    public OridinaryHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void walls() {
        this.house.setWalls("3 White Walls");
    }

    @Override
    public void windows() {
        this.house.setWindows("middle size Windows");
    }

    @Override
    public void rooms() {
        this.house.setRooms("2 Rooms");
    }

    @Override
    public void kitchen() {
        this.house.setKitchen("1 Kitchen !!");
    }

    @Override
    public void swimmingPool() {
        this.house.setSwimmingPool("noting really");
    }

    @Override
    public void parking() {
        this.house.setParking("1 Parking");
    }

    @Override
    public House build() {
        return house;
    }
}
