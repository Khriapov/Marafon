package day9.Task2;

public class Circle extends Figure {
    public double circleRadius;

    public Circle(double circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }


    public double area() {
        return Math.pow(circleRadius, 2) * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * circleRadius;
    }
}
