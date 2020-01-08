package com.thejavauniversity.designpatterns.flyweight;

public class Driver {

    private static String[] colors = {"RED", "GREEN", "BLUE"};

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        for(int i = 0; i < 10; i++) {
            Square square = (Square) shapeFactory.getSquare(getRandomColor());
            square.setSideLength(getRandomSideLength());
            square.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomSideLength() {
        return (int)(Math.random()*100 );
    }

}
