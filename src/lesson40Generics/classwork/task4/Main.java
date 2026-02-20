package lesson40Generics.classwork.task4;

import lesson33Lambdas.classwork.task2.Dog;

public class Main {
    public static void main(String[] args) {

        Box<String> boxOfWords = new Box<>();
        Box<Dog> boxOfDogs = new Box<>();

        boxOfWords.addItem("Hello");
        boxOfWords.addItem("JavaScript");
        boxOfWords.addItem("Java");

        boxOfDogs.addItem(new Dog("Black", 10, 12.5));
        boxOfDogs.addItem(new Dog("Grey", 3, 5.7));
        boxOfDogs.addItem(new Dog("Ginger", 7, 6.9));

        String word = boxOfWords.getItem();
        Dog dog = boxOfDogs.getItem();
        System.out.println("String's length: " + word.length());
        System.out.println("Dog's color: " + dog.getColor());
    }
}
