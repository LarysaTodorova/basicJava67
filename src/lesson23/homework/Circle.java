package lesson23.homework;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter of Circle:");
        return 2 * Math.PI * radius ;
    }

    @Override
    public double area() {
        System.out.println("Area of Circle:");
        return Math.PI * radius * radius;
    }
}
