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
                {4, 5, 6, 7},
                {8, 9}};

        int[][] numbers2d2 = new int[3][];
        numbers2d2[0] = new int[3];
        numbers2d2[1] = new int[4];
        numbers2d2[2] = new int[2];

        System.out.println("Number of lines: " + numbers2d2.length);

        System.out.println("Cells per row 0: " + numbers2d2[0].length);
        System.out.println("Cells per row 1: " + numbers2d2[1].length);
        System.out.println("Cells per row 2: " + numbers2d2[2].length);

        System.out.println();

        for (int i = 0; i < numbers2d1.length; i++) {
            for (int j = 0; j < numbers2d1[i].length; j++) {
                System.out.print(numbers2d1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] row : numbers2d1) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
