package lesson23.classwork.task03;

public class Dog extends LandAnimal {

    public Dog(double weight, String furColor) {
        super(weight, furColor);
    }

    @Override
    public void feed() {
        System.out.println("Dog feed on meat");
    }
}
