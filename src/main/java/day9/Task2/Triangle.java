package day9.Task2;

public class Triangle extends Figure {
    public double t1;
    public double t2;
    public double t3;

    public Triangle(double t1, double t2, double t3, String color) {
        super(color);
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }


    public double perimeter() {
        return t1 + t2 + t3;
    }

    public double area() {
        double perimeterHalf = perimeter() / 2;
        return Math.sqrt(perimeterHalf * (perimeterHalf - t1) * (perimeterHalf - t2) * (perimeterHalf - t3));
    }
}
