package lesson26Arrays.homework.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте двумерный массив размером 10х10.
Заполните в цикле массив таким образом, чтобы он стал таблицей умножения
(например, ячейка под индексами 4 и 6 должна содержать значение 24).
В следующем цикле выведите таблицу умножения в консоль.
         */

        int[][] numbers2d = new int[10][10];

        for (int i = 0; i < numbers2d.length; i++) {
            for (int j = 0; j < numbers2d[i].length; j++) {
                numbers2d[i][j] = i * j;
            }
        }

        for (int[] row : numbers2d) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
