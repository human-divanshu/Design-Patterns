package com.thejavauniversity.designpatterns.decorator;

public class IceCreamDecorator implements IceCream {
    IceCream iceCream;
    IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public double cost() {
        return iceCream.cost();
    }
}
