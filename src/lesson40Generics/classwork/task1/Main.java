package lesson40Generics.classwork.task1;

import lesson23Inheritance.classwork.task03.Animal;
import lesson23Inheritance.classwork.task03.Bird;
import lesson23Inheritance.classwork.task03.Fish;
import lesson33Lambdas.classwork.task2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.getSum(7, 5);
        System.out.println("Result: " + result);

        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        numbers.add(5);
        words.add("Hello");
        cats.add(new Cat("Black", 5, 4.75));

        Integer number = numbers.get(0);
        String word = words.get(0);
        Cat cat = cats.get(0);

        Animal animal1 = new Bird(3.4, 2);
        Animal animal2 = new Fish(3.9);

        Object object1 = "Hello";
        Object object2 = 7;
        Object object3 = new Cat("White", 3, 4.5);
        Object object4 = true;
    }
}
