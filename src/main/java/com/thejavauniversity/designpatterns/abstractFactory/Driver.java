package com.thejavauniversity.designpatterns.abstractFactory;

public class Driver {

    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory factory2D = factoryProducer.getFactory(true);
        AbstractFactory factory3D = factoryProducer.getFactory(false);

        Shape square = factory2D.getShape("square");
        square.draw();

        Shape cube = factory3D.getShape("cube");
        cube.draw();
    }
}
