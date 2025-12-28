package lesson26Arrays.classwork.task4;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        // создание двумерного массива
        int[][] numbers2d = new int[4][3];

        numbers[3] = 7;
        numbers2d[2][1] = 9;

        System.out.println(numbers[3]);
        System.out.println(numbers2d[2][1]);

        int[] numbers1 = {1, 2, 5, 9, 10,};
        int[][] numbers2d1 = {{1, 2, 3},
                              {5, 7, 3, 6},
                              {9, 8}};

    }
}
