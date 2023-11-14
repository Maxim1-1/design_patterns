package com.Maxim.Bridge;

public class DrawerLine extends Drawer{

    DrawerLine(Shape shape) {
        super(shape);
    }

    @Override
    void draw() {
        System.out.print(String.format("Рисую %s",shape.getTypeShape()));
    }
}
