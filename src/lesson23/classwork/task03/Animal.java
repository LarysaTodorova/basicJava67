package lesson23.classwork.task03;

public abstract class Animal {

    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void feed();
}
