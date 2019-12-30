package com.thejavauniversity.designpatterns.abstractFactory;

public class Factory2D implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("Rectangle")) {
            return new Reactangle();
        }
        return null;
    }
}
