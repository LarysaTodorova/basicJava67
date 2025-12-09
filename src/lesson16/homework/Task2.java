package lesson16.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Room length: ");
        double roomLength = scanner.nextDouble();
        System.out.println("Room width: ");
        double roomWidth = scanner.nextDouble();
        System.out.println("Parquet area in one package: ");
        double parquetArea = scanner.nextDouble();

        double roomSquare = roomLength * roomWidth;
        double parquetPackages = roomSquare / parquetArea;
        double parquetInt = (int) parquetPackages;

        System.out.println("Room square " + roomSquare + " m. are needed " + parquetInt + " packages.");

    }
}
