package lesson34StreamAPI.jptPractice.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Дан List<Integer> с повторами.
➡ Посчитать, сколько уникальных элементов в списке.
         */

        List<Integer> numbers = new ArrayList<>(List.of(11, 22, 63, 11, 40, 15, 7, 15, 19, 22, 99));

        long uniqueCount = numbers.stream()
                .distinct()
                .count();

        System.out.println(uniqueCount);
    }
}
