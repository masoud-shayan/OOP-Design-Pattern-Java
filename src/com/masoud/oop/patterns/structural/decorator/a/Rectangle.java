package com.masoud.oop.patterns.structural.decorator.a;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing " + this.getClass().getSimpleName() + " .... ");
    }
}
