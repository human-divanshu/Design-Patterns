package com.thejavauniversity.designpatterns.abstractFactory;

public class FactoryProducer {

    public AbstractFactory getFactory(boolean is2D) {
        if(is2D) {
            return new Factory2D();
        }
        return new Factory3D();
    }
}
