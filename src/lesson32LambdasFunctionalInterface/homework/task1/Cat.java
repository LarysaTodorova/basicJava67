package lesson32LambdasFunctionalInterface.homework.task1;

import java.util.Objects;

public class Cat {

    private String color;
    private double weight;
    private int age;

    public Cat(String color, double weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Double.compare(weight, cat.weight) == 0 && age == cat.age && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
