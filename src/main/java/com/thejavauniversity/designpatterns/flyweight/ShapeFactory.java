package com.thejavauniversity.designpatterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static HashMap<String, Square> cache = new HashMap<>();

    public Shape getSquare(String color) {
        Square square = cache.get(color);

        if(square == null) {
            square = new Square(color);
            cache.put(color, square);
            System.out.println("Creating new square");
        }

        return square;
    }
}
