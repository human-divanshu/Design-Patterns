package com.thejavauniversity.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {

        IceCream iceCream = new SimpleIceCream();
        IceCream vanilla = new VanillaIceCream(iceCream);

        System.out.println("Cost of vanilla ice cream = " + vanilla.cost());

        IceCream chocolate = new ChocolateIceCream(iceCream);
        System.out.println("Cost of chocolate ice cream = " + chocolate.cost());

        IceCream chocoVanilla = new ChocolateIceCream(vanilla);
        System.out.println("Cost of choco-vanilla ice cream = " + chocoVanilla.cost());
    }
}
