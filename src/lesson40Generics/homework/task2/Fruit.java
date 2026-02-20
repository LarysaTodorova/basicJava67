package lesson40Generics.homework.task2;

public abstract class Fruit {

    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void sprinkleFruits();
}
