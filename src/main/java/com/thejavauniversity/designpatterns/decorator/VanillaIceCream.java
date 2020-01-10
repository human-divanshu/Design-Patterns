package com.thejavauniversity.designpatterns.decorator;

public class VanillaIceCream extends IceCreamDecorator {
    VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }
    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
