package lesson23.classwork.task03;

public class Bird extends Animal implements Flyable {

    private int wings;

    public Bird(double weight, int wings) {
        super(weight);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    @Override
    public void feed() {
        System.out.println("Bird feeds on grains");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird takes off");
    }

    @Override
    public void fly() {
        System.out.println("Bird flys on grains");
    }

    @Override
    public void land() {
        System.out.println("Bird lands on grains");
    }
}
