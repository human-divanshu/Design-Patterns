package com.thejavauniversity.designpatterns.flyweight;

public class Square implements Shape {

    private String color;
    private int sideLength;

    Square(String color) {
        this.color = color;
    }

    void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Square drawn");
    }
}
