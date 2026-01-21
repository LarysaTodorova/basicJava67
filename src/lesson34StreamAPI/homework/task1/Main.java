package lesson34StreamAPI.homework.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте лист чисел и заполните его произвольными значениями от 0 до 20 (10 значений).
Посчитайте сумму всех элементов листа. Выведите результат в консоль.
Определите, сколько чисел в листе делятся нацело на 5. Выведите результат в консоль.
Задание должно быть решено при помощи стримов.
         */

        List<Integer> numbers = List.of(5, 9, 10, 1, 8, 15, 11, 20, 7, 3);
        System.out.println("All numbers: " + numbers);

        int sum = numbers
                .stream()
//                .mapToInt(x -> x)
//                .sum();
                .reduce(0, (x, y) -> x +y);

        System.out.println("Sum: " + sum);

        long count = numbers
                .stream()
                .filter(x -> x % 5 == 0)
                .count();

        System.out.println("Count divisible by 5: " + count);

    }
}
