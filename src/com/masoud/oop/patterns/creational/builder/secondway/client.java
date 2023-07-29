package com.masoud.oop.patterns.creational.builder.secondway;

import com.masoud.oop.patterns.creational.builder.secondway.a.House;
import com.masoud.oop.patterns.creational.builder.secondway.c.LuxuryHouseBuilder;
import com.masoud.oop.patterns.creational.builder.secondway.c.OridinaryHouseBuilder;

public class client {
    public static void main(String[] args) {

        LuxuryHouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        luxuryHouseBuilder.walls();
        luxuryHouseBuilder.rooms();
        luxuryHouseBuilder.kitchen();
        luxuryHouseBuilder.windows();
        luxuryHouseBuilder.swimmingPool();
        luxuryHouseBuilder.parking();
        House luxuryHouse = luxuryHouseBuilder.build();

        System.out.println(luxuryHouse);



        OridinaryHouseBuilder oridanryHouseBuilder = new OridinaryHouseBuilder();
        oridanryHouseBuilder.walls();
        oridanryHouseBuilder.rooms();
        oridanryHouseBuilder.kitchen();
        oridanryHouseBuilder.windows();
        oridanryHouseBuilder.parking();
        House ordinaryHouse = oridanryHouseBuilder.build();

        System.out.println(ordinaryHouse);

    }
}
