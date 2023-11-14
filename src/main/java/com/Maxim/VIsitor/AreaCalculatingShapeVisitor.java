package com.Maxim.VIsitor;

class AreaCalculatingShapeVisitor implements ShapeVisitor {

    public double getResult() {
        return result;
    }

    private double result;

    @Override
    public void visitSquare(Square square) {
        this.result = square.getSide() * square.getSide();
    }

    @Override
    public void visitCircle(Circle circle) {
        this.result =Math.PI * circle.getRadius() * circle.getRadius();
    }
}
