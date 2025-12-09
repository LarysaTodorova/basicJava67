package lesson20.classwork;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // Задача: вывести каждый массив на экран таким образом,
        // чтобы каждый элемент был выведен с новой строки,
        // а строки при этом пронумерованы.
        // Ожидаемый результат:
        // 1. Яблоко
        // 2. Банан
        // ... и так далее

        String[] fruits = {"Apple", "Lemon", "Banana", "Pear", "Strawberry"};
        String[] names = {"Alex", "Robert", "Olivia", "Jack", "Anna", "Max"};

        printArray(fruits);
        System.out.println();
        printArray(names);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". " + array[i]);
        }
    }
}
