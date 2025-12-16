package lesson23.classwork.task03;

public class Elephant extends LandAnimal {

    public Elephant(double weight, String furColor) {
        super(weight, furColor);
    }

    @Override
    public void feed() {
        System.out.println("Elephant feed on vegetation");
    }
}
