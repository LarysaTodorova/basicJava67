package lesson40Generics.classwork.task5;

import lesson23Inheritance.classwork.task03.Animal;

import java.util.ArrayList;
import java.util.List;

public class Transport<T extends Animal> {

    private List<T> animals = new ArrayList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void deliver(String destination) {
        System.out.println("Next animals:");
        animals.forEach(x -> System.out.println(x.getClass().getSimpleName()));
        System.out.println("Delivered to " + destination);
    }
}
