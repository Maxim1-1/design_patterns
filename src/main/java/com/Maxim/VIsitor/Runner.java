package com.Maxim.VIsitor;

public class Runner {
    public static void main(String[] args) {
        AreaCalculatingShapeVisitor areaCalculatingShapeVisitor = new AreaCalculatingShapeVisitor();
        AreaCalculatingShapeVisitor areaCalculatingShapeVisitor2 = new AreaCalculatingShapeVisitor();

        areaCalculatingShapeVisitor.visitCircle(new Circle(111));
        areaCalculatingShapeVisitor2.visitSquare(new Square(111));

        System.out.print("Площадь круга: "+areaCalculatingShapeVisitor.getResult()+"\n");
        System.out.print("Площадь квадрата: "+areaCalculatingShapeVisitor2.getResult()+"\n");



        PerimeterCalculatingShapeVisitor perimeterCalculatingShapeVisitor = new PerimeterCalculatingShapeVisitor();
        PerimeterCalculatingShapeVisitor perimeterCalculatingShapeVisitor1 = new PerimeterCalculatingShapeVisitor();


        perimeterCalculatingShapeVisitor.visitSquare(new Square(111));
        perimeterCalculatingShapeVisitor1.visitCircle(new Circle(111));


        System.out.print("Периметр круга: "+perimeterCalculatingShapeVisitor1.getResult()+"\n");
        System.out.print("Периметр квадрата: "+perimeterCalculatingShapeVisitor.getResult()+"\n");



    }
}
