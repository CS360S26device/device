package com.example.device;

public abstract class Shape {

    String colour = "Blue";

    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}

