package com.Maxim.VIsitor;

class Square implements Shape {

    Square (double newside){
        side=newside;
    }

    private double side;

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitSquare(this);
    }

    public double getSide() {
        return side*side;
    }
}