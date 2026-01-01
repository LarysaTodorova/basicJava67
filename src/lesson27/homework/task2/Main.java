package lesson27.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте список чисел и заполните его несколькими значениями (5-10 значений).
        Создайте целочисленную переменную и при помощи цикла запишите в неё сумму всех элементов списка.
        Выведите в консоль список и значение переменной, проконтролируйте результат.
         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(50);
        numbers.add(15);

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(numbers);
        System.out.println(sum);
    }
}
