package practiceLoop;

public class Task1 {
    public static void main(String[] args) {

        /*
        Дан массив целых чисел:
        int[] numbers = {4, 7, 10, 3, 8, 5};
        Нужно:
        Вывести ВСЕ элементы, которые стоят на чётных индексах
        Вывести ВСЕ элементы, которые имеют чётное значение
        Посчитать сумму элементов, стоящих на нечётных индексах
         */

        int[] numbers = {4, 7, 10, 3, 8, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }

}
/*
«Я иду по массиву с помощью индекса i.
Если проверяю i, то работаю с индексом.
Если проверяю numbers[i], то работаю со значением элемента.»
 */
