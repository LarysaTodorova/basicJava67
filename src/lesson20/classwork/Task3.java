package lesson20.classwork;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = {6, 3, 8, 1, 4};

        System.out.println("The result of the first method:");
        printSum(numbers);

        System.out.println();

        System.out.println("The result of the second method:");
        int result = getSum(numbers);
        System.out.println("Array element summa: " + result);

    }

    // Задача метода - посчитать сумму чисел массива и вернуть её
    public static void printSum(int[] array) {
        int sum = 0;
        for (int currentElement : array) {
            sum += currentElement;
        }
        System.out.println("Array element summa: " + sum);
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int currentElement : array) {
            sum += currentElement;
        }
        return sum;
    }
}
