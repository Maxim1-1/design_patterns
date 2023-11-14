package com.Maxim.Bridge;

import java.awt.*;

public abstract class Drawer {

    Shape shape;

    Drawer(Shape shape) {
        this.shape = shape;

    }

    abstract void draw();
}
