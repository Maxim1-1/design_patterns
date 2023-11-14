package com.Maxim.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(shapeFactory.getShape("квадрат"));
        shapeList.add(shapeFactory.getShape("круг"));
        shapeList.add(shapeFactory.getShape("круг"));
        shapeList.add(shapeFactory.getShape("квадрат"));
        shapeList.add(shapeFactory.getShape("круг"));

        for (Shape shape: shapeList){

            shape.draw(1,1);
        }

    }
}
