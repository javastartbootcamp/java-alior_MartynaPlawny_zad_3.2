package pl.javastart.task;

public class Circle {
    private double circleR;

    public Circle(double circleR) {
        this.circleR = circleR;
    }

    public double getCircleR() {
        return circleR;
    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getCircleR(), 2);
    }
}
