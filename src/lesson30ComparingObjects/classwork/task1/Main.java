package lesson30ComparingObjects.classwork.task1;

import lesson25.classwork.task3.Dog;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Ginger", 5, 3.5);
        Cat cat2 = new Cat("Ginger", 5, 3.5);

        boolean result = cat1.equals(cat2);
        System.out.println("Are the cats equals? - " + result);

        Cat cat3 = null;
        Cat cat4 = new Cat("Ginger", 3, 4.9);
        Dog dog1 = new Dog("Ginger", 5, 3.5);

        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(dog1));
        System.out.println(cat1.equals(cat4));

    }
}
