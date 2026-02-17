package lesson39InputOutput.homework.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте два файла из задания 1, но не вручную, а при помощи класса File.
Перед созданием проверьте, существуют ли файлы, и выведите результат в консоль.
При самом создании файлов - также проверьте результат создания, и тоже выведите результат в консоль
(метод создания файла возвращает boolean, используйте эту особенность).
После создания файлов поместите фразу This is my homework! в файл-источник (программно или вручную - на Ваш выбор).
Скопируйте содержимое файла hw_source.txt в файл hw_target.txt, заменив пробелы символами подчёркивания.
Используйте буферизованные потоки ввода/вывода.
         */

        File inFile = new File("hw_source.txt");
        File outFile = new File("hw_target.txt");
        System.out.println("Does inFile exist on the hard drive? " + inFile.exists());
        System.out.println("Does outFile exist on the hard drive? " + outFile.exists());

        try {

            boolean createdIn = inFile.createNewFile();
            System.out.println("Was created in file? " + createdIn);
            boolean createdOut = outFile.createNewFile();
            System.out.println("Was created out file? " + createdOut);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try (BufferedOutputStream sourceFile = new BufferedOutputStream(new FileOutputStream(inFile))) {

            String text = "This is my homework!";

            sourceFile.write(text.getBytes());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile))) {

            while (true) {

                int data = in.read();
                if (data == -1) {
                    break;
                }
                if (data == ' ') {
                    data = '_';
                }
                out.write(data);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
