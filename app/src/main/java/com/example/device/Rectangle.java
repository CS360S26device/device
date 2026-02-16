package com.example.device;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int x, int y, int length, int width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length *width;
    }
}
