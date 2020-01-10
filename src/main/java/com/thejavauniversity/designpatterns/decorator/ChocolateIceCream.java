package com.thejavauniversity.designpatterns.decorator;

public class ChocolateIceCream extends IceCreamDecorator {
    ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }
    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
