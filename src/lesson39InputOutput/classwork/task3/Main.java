package lesson39InputOutput.classwork.task3;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        // Задача: прочитать первую букву из файла test.txt
        // и вывести её на экран. Обязательное требование:
        // Поток ввода, связанный с файлом, обязательно должен быть закрыт.

        try (InputStream in = new FileInputStream("test.txt")) {
            System.out.println((char) in.read());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
