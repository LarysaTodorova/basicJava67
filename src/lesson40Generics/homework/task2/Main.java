package lesson40Generics.homework.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        *** Задача 2 (необязательная, повышенной сложности, для желающих):
Есть классы Fruit (абстрактный), его наследники —-> Apple, Orange
Класс Box в который можно складывать фрукты (и только фрукты), коробки типизируются по типу фрукта,
* поэтому в одну коробку должно быть нельзя сложить и яблоки, и апельсины
Для хранения фруктов внутри коробки можете использовать ArrayList
Не забываем про метод добавления фрукта в коробку.
Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
* (вес яблока - 1.0, апельсина - 1.5, не важно в каких это единицах)
Менять вес фруктов должно быть нельзя, их вес строго фиксирован!
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
* (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
* соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке
         */

        Box<Apple> applesBox = new Box<>();
        applesBox.add(new Apple());
        applesBox.add(new Apple());
        applesBox.add(new Apple());
        applesBox.add(new Apple());
        double appleWeight = applesBox.getWeight();
        System.out.println("Apple Weight: " + appleWeight);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        double orangeWeight = orangeBox.getWeight();
        System.out.println("Orange Weight: " + orangeWeight);

        Box<Orange> sprinkledOrangesBox = new Box<>();
        orangeBox.sprinkleFruits(sprinkledOrangesBox);

        orangeBox.printData();
        sprinkledOrangesBox.printData();

    }
}
