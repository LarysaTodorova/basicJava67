package lesson23.homework;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter of Rectangle:");
        return (a + b) * 2;
    }

    @Override
    public double area() {
        System.out.println("Area of Rectangle:");
        return a * b;
    }
}
