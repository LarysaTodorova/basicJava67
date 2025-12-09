package lesson_19.gptForForEach;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
    /*
    Найдите минимальный и максимальный элементы
    и удвойте оба (но не меняйте местами).
    Выведите массив после изменения.
    */

        int[] numbers = {3, 15, 7, 9, -20, 11, 0};
        System.out.println(Arrays.toString(numbers));

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            } else if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        numbers[minIndex] *= 2;
        numbers[maxIndex] *= 2;
        System.out.println(Arrays.toString(numbers));

    }
}
