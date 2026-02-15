package lesson38InputOutput.homework.task2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте в корне проекта файл cat.txt
Поместите в файл вручную следующую информацию - Hello! I am cat! My name is Jasper.
I like to eat and my human named Eva.
Создайте поток ввода из этого файла.
Пропустите 36 байт информации из файла (метод skip).
Следующие 7 байт преобразуйте в символы и выведите в консоль в одну строку.
Создайте второй поток ввода из этого же файла.
При помощи второго потока пропустите 28 байт, затем в эту же строку выведите 2 следующих символа,
пропустите 40 байт, и ещё 2 символа выведите в эту же строку.
         */

        File file = new File("cat.txt");
        try {
            file.createNewFile();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
