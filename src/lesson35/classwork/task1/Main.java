package lesson35.classwork.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] numbers1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] numbers2 = {
                {10, 20, 30},
                {40, 50},
                {60, 70, 80, 90, 100},
                {110}
        };

        printArray(numbers1);
        printArray(numbers2);

        int[] result = convertArray(numbers1);
        System.out.println("Result 1: " + Arrays.toString(result));

        result = convertArray(numbers2);
        System.out.println("Result 2: " + Arrays.toString(result));

        result = Arrays.stream(numbers1).flatMapToInt(x -> Arrays.stream(x)).toArray();
        System.out.println("Result 3: " + Arrays.toString(result));

        result = Arrays.stream(numbers2).flatMapToInt(Arrays::stream).toArray();
        System.out.println("Result 4: " + Arrays.toString(result));

    }

    public static int[] convertArray(int[][] array) {
        int size = 0;
        for (int[] line : array) {
            size += line.length;
        }

        int[] result = new int[size];

        int index = 0;

        for (int[] line : array) {
            for (int cell : line) {
                result[index++] = cell;
            }
        }
        return result;
    }

    public static void printArray(int[][] array) {
        for (int[] line : array) {
            for (int cell : line) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
