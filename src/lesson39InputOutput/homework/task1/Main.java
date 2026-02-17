package lesson39InputOutput.homework.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        /*
        В корне проекта вручную создайте два файла: hw_source.txt и hw_target.txt
В файл hw_source.txt вручную поместите фразу - This is my homework!
Скопируйте содержимое файла hw_source.txt в файл hw_target.txt
Используйте обычные небуферизованные потоки ввода/вывода.
         */

        try (InputStream in = new FileInputStream("hw_source.txt");
             OutputStream out = new FileOutputStream("hw_target.txt")) {

            byte[] data = in.readAllBytes();
            out.write(data);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
