package com.codecafe.tdd.junit.basics.shape;

public class Rectangle {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }


    public double area() {
        return this.length * this.height;
    }

    public double perimeter() {
        return 2 * (this.length + this.height);
    }

}
