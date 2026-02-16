package com.example.device;

public class Heart extends Shape {
     private int size;
     public Heart(int x, int y, int size)
     {
         super(x,y);
         this.size = size;
     }

     @Override
     public double area()
     {
         return 2.65*size*size; //approximate
     }

}
