package pl.javastart.task;

public class Triangle {
    private double triangleA;
    private double triangleB;
    private double triangleC;

    public Triangle(double triangleA, double triangleB, double triangleC) {
        this.triangleA = triangleA;
        this.triangleB = triangleB;
        this.triangleC = triangleC;
    }

    public double getTriangleA() {
        return triangleA;
    }

    public double getTriangleB() {
        return triangleB;
    }

    public double getTriangleC() {
        return triangleC;
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getTriangleA() + triangle.getTriangleB() + triangle.getTriangleC();
    }
}
