package lesson26Arrays.gptPractice.task3;

public class Main {
    public static void main(String[] args) {
        /*
        1️⃣ Найди минимальный элемент и его координаты [i][j]
        2️⃣ Найди максимальный элемент и его координаты [i][j]
         */

        int[][] matrix = {
                {7, -3, 15, 0},
                {22, 5, -8, 4},
                {9, 18, 1, -12},
                {6, 2, 14, -1}
        };

        int min = matrix[0][0];
        int max = matrix[0][0];

        int minI = 0, minJ = 0;
        int maxI = 0, maxJ = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];

                if (value < min) {
                    min = value;
                    minI = i;
                    minJ = j;
                }
                if (value > max) {
                    max = value;
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println("min: " + min + " , " + minI + " , " + minJ);
        System.out.println("max: " + max + " , " + maxI + " , " + maxJ);
    }
}
