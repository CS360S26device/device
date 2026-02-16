package com.example.device;

public class Triangle extends Shape{
    private int base;
    private int height;
    public Triangle(int x, int y, int base, int height)
    {
        super(x, y);
        this.base = base;
        this.height = height;
    }
    @Override
    public double area()
    {
        return 0.5 * base * height;
    }
}
