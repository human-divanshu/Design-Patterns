package com.thejavauniversity.designpatterns.facade;

public class ShapeMaker {
    private Square square;
    private Circle circle;

    public ShapeMaker() {
        square = new Square();
        circle = new Circle();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}
