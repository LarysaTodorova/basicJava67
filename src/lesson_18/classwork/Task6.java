package lesson_18.classwork;

public class Task6 {
    public static void main(String[] args) {
        // Задача: вывести на экран числа от 0 до 10

        int number = 0;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }


        System.out.println();
        number = 0;

        while (number <= 10) {
            System.out.print(number++ + " ");
        }

        System.out.println();
        number = 0;

        while (true) {
            System.out.print(number + " ");
            number++;
            if (number == 11) {
                break;
            }
        }
    }
}
