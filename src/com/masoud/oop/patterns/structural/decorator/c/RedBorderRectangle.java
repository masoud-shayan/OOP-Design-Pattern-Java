package com.masoud.oop.patterns.structural.decorator.c;

import com.masoud.oop.patterns.structural.decorator.a.Shape;
import com.masoud.oop.patterns.structural.decorator.b.ShapeDecorator;

public class RedBorderRectangle extends ShapeDecorator {

    public RedBorderRectangle(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorderColor();
    }

    private void drawBorderColor() {
        String[] className = this.getClass().getSimpleName().split("(?=\\p{Lu})");
        System.out.println("Drawing Border Color " + className[0] + " for the " + className[2] + " .... ");
    }
}
