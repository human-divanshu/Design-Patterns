package com.thejavauniversity.designpatterns.factoryMethod;

enum ShapeType { CIRCLE, SQUARE};

public class ShapeFactory {

    public Shape getShape(ShapeType type) {
        if(type.equals(ShapeType.CIRCLE)) {
            return new Circle();
        }
        if(type.equals(ShapeType.SQUARE)) {
            return new Square();
        }
        return null;
    }
}
