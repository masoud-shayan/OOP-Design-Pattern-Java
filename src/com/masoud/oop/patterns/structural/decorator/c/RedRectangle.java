package com.masoud.oop.patterns.structural.decorator.c;

import com.masoud.oop.patterns.structural.decorator.a.Shape;
import com.masoud.oop.patterns.structural.decorator.b.ShapeDecorator;

public class RedRectangle extends ShapeDecorator {

    public RedRectangle(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawColor();
    }

    private void drawColor() {
        String[] className = this.getClass().getSimpleName().split("(?=\\p{Lu})");
        System.out.println("Drawing Color " + className[0] + " for the " + className[1] + " .... ");
    }
}
