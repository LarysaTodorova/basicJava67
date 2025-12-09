package lesson19.classwork;

public class Task5 {
    public static void main(String[] args) {

        // Задача: найти первое попавшееся в массиве отрицательное число и вывести его на экран

        int[] numbers = {3, 9, -5, 6, -1, 50};

        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number);
                break;
            }
        }

    }
}
