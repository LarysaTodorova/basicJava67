package lesson39InputOutput.classwork.task4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        // Задача: информация о документе находится в файле в следующем формате:
        // 005|   CREATED|Invoice
        // Нужно вывести на экран сведения о названии документа и его номере:
        // Ожидаемый результат: Invoice 005
        // Статус документа отображать не нужно, он просто пропускается.

        try (InputStream in = new FileInputStream("document.txt")) {

            if (in.available() == 0) {
                System.err.println("Error! File is empty!");
                return;
            }

            StringBuilder docNumber = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                char symbol = (char) in.read();
                docNumber.append(symbol);
            }

            in.skip(12);

            StringBuilder docTitle = new StringBuilder();
            while (true) {
                int data = in.read();
                if (data == -1) {
                    break;
                }
                docTitle.append((char) data);
            }

            docTitle.append(" ").append(docNumber);
            System.out.println(docTitle);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
