package lesson20.classwork;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 8, 1, 4};

        // Задача: написать метод, который считает и возвращает сумму элементов массива
        System.out.println("Array element summa: " + getSum(numbers));

        // Задача: написать метод, который считает и возвращает сумму элементов массива,
        // начиная с определённого индекса
        System.out.println("Sum elements fron index 2: " + getSum(numbers, 2));

    }

    public static int getSum(int[] array, int start) {
        int sum = 0;
        for (int i = start; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int currentElement : array) {
            sum += currentElement;
        }
        return sum;
    }
}
