package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Square square = new Square(34);
        Circle circle = new Circle(21);
        Triangle triangle = new Triangle(4, 3, 5);
        Rectangle rectangle = new Rectangle(45, 64.8);

        double squareArea = square.calculateSquareArea(square);
        double circleArea = circle.calculateCircleArea(circle);
        double trianglePerimeter = triangle.calculateTrianglePerimeter(triangle);
        double rectPerimeter = rectangle.calculateRectPerimeter(rectangle);
        System.out.println("Pole kwadratu wynosi: " + squareArea);
        System.out.println("Pole koła wynosi: " + circleArea);
        System.out.println("Obwód trójkąta wynosi: " + trianglePerimeter);
        System.out.println("Obwód prostokąta wynosi: " + rectPerimeter);
    }
}