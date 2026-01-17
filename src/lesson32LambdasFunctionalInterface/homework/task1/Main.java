package lesson32LambdasFunctionalInterface.homework.task1;

import java.util.ArrayList;
import java.util.List;

import static lesson32LambdasFunctionalInterface.homework.task1.CatUtils.*;

public class Main {
    public static void main(String[] args) {
        /*
        Написать класс Кот.
Каждый кот должен обладать цветом, весом (дробным) и возрастом (целочисленным).
Написать класс Main, в методе main создать список из семи котов разных характеристик.
Вывести всех котов в консоль.
Написать функциональный интерфейс, задача которого - фильтровать котов.
Написать метод, который на вход принимает список котов и объект фильтра котов и выводит в консоль только тех котов,
которые удовлетворяют условию фильтра.
Реализовать три фильтра для котов (по параметрам на Ваш выбор) -
при помощи обычного класса, анонимного класса и лямбда-выражения.
Результат работы всех трёх фильтров вывести в консоль.
         */

        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Black", 4.7, 3));
        cats.add(new Cat("Ginger", 3.2, 2));
        cats.add(new Cat("Black", 2.5, 1));
        cats.add(new Cat("White", 4.7, 5));
        cats.add(new Cat("Grey", 6.1, 7));
        cats.add(new Cat("Grey", 5.5, 5));
        cats.add(new Cat("White", 4.6, 3));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();

        System.out.println("Filtered cats by color: ");
        printFilteredCats(cats, new FilterCatByColor("Grey"));

        System.out.println("Filtered cats by color and age: ");
        printFilteredCats(cats, new Filter() {
            @Override
            public boolean test(Cat cat) {
                return cat.getColor().equals("Black") && cat.getAge() < 3;
            }
        });

        System.out.println("Filtered cats by weight: ");
        printFilteredCats(cats, x -> x.getWeight() > 5);
    }
}
