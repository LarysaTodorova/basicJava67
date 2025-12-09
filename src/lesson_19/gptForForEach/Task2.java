package lesson_19.gptForForEach;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
     /*
     В массиве заменить все отрицательные числа на 0,
     а все положительные — увеличить в 2 раза.
     Вывести массив до и после изменений.
     */

        int[] numbers = {3, -15, -7, 9, 20, -11};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            } else if (numbers[i] > 0) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
