package lesson23.classwork.task03;

public class Cat extends LandAnimal {

    public Cat(double weight, String furColor) {
        super(weight, furColor);
    }

    @Override
    public void feed() {
        System.out.println("Cat feed on meat");
    }
}
