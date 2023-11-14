package com.Maxim.VIsitor;

class Circle implements Shape {

    Circle (double newradius){
        radius=newradius;
    }

    private double radius;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }

    public double getRadius() {
        return radius;
    }
}
