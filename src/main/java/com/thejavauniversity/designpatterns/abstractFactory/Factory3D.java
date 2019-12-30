package com.thejavauniversity.designpatterns.abstractFactory;

public class Factory3D implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Cube")) {
            return new Cube();
        }
        if(shapeType.equalsIgnoreCase("Cuboid")) {
            return new Cuboid();
        }
        return null;
    }
}
