package com.Maxim.Flyweight;

public class Cicrle implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.print("рисуем круг с координатами: "+x+y+"и радиусом: "+100+"\n");
    }
}
