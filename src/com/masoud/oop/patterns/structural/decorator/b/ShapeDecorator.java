package com.masoud.oop.patterns.structural.decorator.b;

import com.masoud.oop.patterns.structural.decorator.a.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape shapeToBeDecorated;

    public ShapeDecorator(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }

    @Override
    public void draw() {
        shapeToBeDecorated.draw();
    }
}
