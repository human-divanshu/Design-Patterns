package com.thejavauniversity.designpatterns.facade;

public class Driver {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
    }
}
