package lesson26Arrays.gptPractice.task2;

public class Main {
    public static void main(String[] args) {
        /*
        Дан двумерный массив int[][] matrix = new int[4][4];
Заполните массив так, чтобы:
главная диагональ содержала 1
все остальные элементы — 0
📌 Главная диагональ — это элементы, у которых номер строки равен номеру столбца.
         */

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
