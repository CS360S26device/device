package com.example.device;

public class Square extends Shape {
    private int side;
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}
