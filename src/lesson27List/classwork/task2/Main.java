package lesson27List.classwork.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');

        for (int i = 0; i < letters.size(); i++) {
            System.out.println(i + 1 + ". " + letters.get(i));
        }

        System.out.println();

        int counter = 0;
        for (Character letter : letters) {
            System.out.println(++counter + ". " + letter);
        }



    }
}
