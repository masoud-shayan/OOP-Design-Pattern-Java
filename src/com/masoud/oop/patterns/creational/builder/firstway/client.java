package com.masoud.oop.patterns.creational.builder.firstway;

public class client {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .walls("White Walls")
                .windows("3 windows")
                .kitchen("1 big Kitchen")
                .rooms("4 rooms")
                .swimmingPool("1 Big Swimming pool")
                .parking("3 parking")
                .build();

        System.out.println(house);
    }
}
