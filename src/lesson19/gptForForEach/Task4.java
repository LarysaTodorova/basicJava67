package lesson19.gptForForEach;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
    /*
    Поменять местами:
    максимальный элемент → в ** начало массива**
    минимальный элемент → в конец массива
    (не между собой, как раньше!)
    */

        int[] numbers = {3, 15, 7, 9, -20, 11, 0};
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        int minValue = numbers[minIndex];
        int maxValue = numbers[maxIndex];

        numbers[maxIndex] = numbers[0];
        numbers[0] = maxValue;

        numbers[minIndex] = numbers.length - 1;
        numbers[numbers.length - 1] = minValue;

        System.out.println(Arrays.toString(numbers));
    }
}
