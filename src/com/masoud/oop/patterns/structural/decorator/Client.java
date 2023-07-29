package com.masoud.oop.patterns.structural.decorator;

import com.masoud.oop.patterns.structural.decorator.a.Shape;
import com.masoud.oop.patterns.structural.decorator.a.Rectangle;
import com.masoud.oop.patterns.structural.decorator.c.RedBorderRectangle;
import com.masoud.oop.patterns.structural.decorator.c.RedRectangle;

public class Client {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("\n");

        Shape redRectangle = new RedRectangle(new Rectangle());
        redRectangle.draw();

        System.out.println("\n");

        Shape redBorderRectangle = new RedBorderRectangle(new Rectangle());
        redBorderRectangle.draw();
    }
}
