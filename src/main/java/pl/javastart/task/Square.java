package pl.javastart.task;

public class Square {
    private double squareA;

    public Square(double squareA) {
        this.squareA = squareA;
    }

    public double getSquareA() {
        return squareA;
    }

    double calculateSquareArea(Square square) {
        return Math.pow(square.getSquareA(), 2);
    }
}
