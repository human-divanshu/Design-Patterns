package com.thejavauniversity.designpatterns.prototype;

enum Color { RED, WHITE;}
enum Type { HATCHBACK, SEDAN;}

public class Car implements Prototype {

    public String licensePlateNumber;
    public Color color;
    public Type type;
    public float length;
    public float width;
    public float heigth;

    public Car(String plateNumber, Color c, Type t, float l, float w, float h) {
        this.licensePlateNumber = plateNumber;
        this.color = c;
        this.type = t;
        this.length = l;
        this.width = w;
        this.heigth = h;
    }

    @Override
    public Prototype clone() {
        return new Car(licensePlateNumber, color, type, length, width, heigth);
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlateNumber='" + licensePlateNumber + '\'' +
                ", color=" + color +
                ", type=" + type +
                ", length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}
