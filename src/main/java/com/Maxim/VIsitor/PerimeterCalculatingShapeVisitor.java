package com.Maxim.VIsitor;

public class PerimeterCalculatingShapeVisitor implements ShapeVisitor{

    private double result;
    @Override
    public void visitSquare(Square square) {
        this.result = square.getSide()*4;
    }

    @Override
    public void visitCircle(Circle circle) {
        this.result = circle.getRadius()*Math.PI*2;
    }

    public double getResult() {
        return result;
    }
}
