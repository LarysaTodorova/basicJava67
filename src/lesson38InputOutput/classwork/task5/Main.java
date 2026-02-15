package lesson38InputOutput.classwork.task5;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            // Создание потока ввода, который привязан к файлу,
            // имя которого мы передаём в конструктор.
            InputStream in = new FileInputStream("test.txt");

            // Читаем из файла один байт (в виде числа)
            int data = in.read();

            // Прочитанный байт преобразуем в букву по таблице кодировки Unicode
            char symbol = (char) data;

            // Отображаем полученный символ на экране
            System.out.println(symbol);

//            byte[] info = in.readAllBytes();
//
//            for (byte currentByte : info) {
//                System.out.print((char) currentByte);
//            }

            System.out.println("Осталось непрочитанных байт - " + in.available());

            // Пропускаем следующие 10 байт
            in.skip(10);

            System.out.println("Символ после 10 пропущенных байт - " + (char) in.read());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
