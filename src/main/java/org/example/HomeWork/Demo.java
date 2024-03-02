package org.example.HomeWork;

public class Demo {
    public static void main(String[] args) {
        PrintShape printShape = new PrintShape();
        Circle circle = new Circle();
        Cube cube = new Cube();
        Ellipse ellipse = new Ellipse();
        Rectangle rectangle = new Rectangle();
        Squad squad = new Squad();
        printShape.printNameShape(circle);
        printShape.printNameShape(cube);
        printShape.printNameShape(ellipse);
        printShape.printNameShape(rectangle);
        printShape.printNameShape(squad);
    }
}
