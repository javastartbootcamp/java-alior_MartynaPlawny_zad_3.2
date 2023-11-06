package pl.javastart.task;

public class ShapeCalculator {
    double calculateSquareArea(Square square) {
        return Math.pow(square.getSquareA(), 2);
    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getCircleR(), 2);
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getTriangleA() + triangle.getTriangleB() + triangle.getTriangleC();
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.getRectangleA() * 2 + rectangle.getRectangleB() * 2;
    }
}
