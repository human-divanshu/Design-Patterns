package com.thejavauniversity.designpatterns.prototype;

public class Driver {

    public static void main(String[] args) {

        Car car1 = new Car("123", Color.RED, Type.SEDAN, 10, 4, 3);
        Car car2 = (Car) car1.clone();
        car2.licensePlateNumber = "789";

        System.out.println(car1);
        System.out.println(car2);

    }
}
