package com.Maxim.Bridge;

public class DrawerCircle extends Drawer{
    DrawerCircle(Shape shape) {
        super(shape);
    }

    @Override
    void draw() {
        System.out.print(String.format("Рисую %s",shape.getTypeShape()));
    }
}
