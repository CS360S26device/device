package com.example.device;

public abstract class Shape {


    protected int x;
    protected int y;
    String color = "Teal";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}

