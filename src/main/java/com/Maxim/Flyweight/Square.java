package com.Maxim.Flyweight;

public class Square implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.print("рисуем квадрат с координатами: "+x+y+"\n");
    }
}
