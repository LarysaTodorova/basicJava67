package lesson26Arrays.classwork.task6;

public class Main {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3},
                {4, 5, 6, 7},
                {8, 9}};

        int[][] clone = numbers.clone();

        int[][] copy = copyArray(numbers);
    }

    public static int[][] copyArray(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}
