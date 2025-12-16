package lesson23.classwork.task03;

public class Fish extends Animal {

    public Fish(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("The fish feeds on algae");
    }
}
