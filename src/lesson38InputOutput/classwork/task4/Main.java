package lesson38InputOutput.classwork.task4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("test.txt");
        System.out.println("Does such a file exist on the hard drive? " + file.exists());

        try {
            boolean created = file.createNewFile();
            System.out.println("Was created file? " + created);

            File dir = new File("test_folder");
            dir.mkdir();

            File innerFile = new File("test_folder/another_test.txt");
            innerFile.createNewFile();

            System.out.println(dir.isDirectory());
            System.out.println(dir.isFile());

            System.out.println(innerFile.isDirectory());
            System.out.println(innerFile.isFile());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
