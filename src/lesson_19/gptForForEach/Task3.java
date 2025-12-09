package lesson_19.gptForForEach;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
     /*
     Дан массив.
     Найдите индекс минимального элемента и переместите его в начало массива,
     сдвинув остальные элементы вправо.
     */

        int[] numbers = {3, 15, 7, 9, -20, 11, 0};
        System.out.println("Before: " + Arrays.toString(numbers));

        int minIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        int minValue = numbers[minIndex];

        for (int i = minIndex; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = minValue;

        System.out.println("After: " + Arrays.toString(numbers));
    }
}
