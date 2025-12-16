package lesson23.classwork.task03;

public class Airplane implements Flyable {

    @Override
    public void takeOff() {
        System.out.println("Airplane takes off");
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }

    @Override
    public void land() {
        System.out.println("Airplane landing");
    }
}
