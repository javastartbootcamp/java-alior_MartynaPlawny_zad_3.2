package pl.javastart.task;

public class Rectangle {
    private double rectangleA;
    private double rectangleB;

    public Rectangle(double rectangleA, double rectangleB) {
        this.rectangleA = rectangleA;
        this.rectangleB = rectangleB;
    }

    public double getRectangleA() {
        return rectangleA;
    }

    public double getRectangleB() {
        return rectangleB;
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.getRectangleA() * 2 + rectangle.getRectangleB() * 2;
    }
}
