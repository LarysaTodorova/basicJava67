package lesson26Arrays.gptPractice.task1;

public class Main {
    public static void main(String[] args) {

        /*
        Создай двумерный массив 5×5.
        Заполни его так, чтобы:
        в каждой ячейке было квадрат значения индекса столбца
        (то есть j * j)
        Выведи массив в консоль, используя for-each.
         */

        int[][] numbers = new int[5][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = j * j;
            }
        }

        for (int[] row : numbers) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
