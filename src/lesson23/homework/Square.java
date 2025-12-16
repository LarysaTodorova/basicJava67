package lesson23.homework;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double perimeter() {
        System.out.println("Perimeter of Square:");
        return 4 * side;
    }

    @Override
    public double area() {
        System.out.println("Area of Square:");
        return side * side;
    }
}
