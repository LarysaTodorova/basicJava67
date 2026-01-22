package lesson34StreamAPI.jptPractice.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Дан List<Integer> numbers.
➡ Найти сумму только чётных чисел, используя стримы.
         */

        List<Integer> numbers = new ArrayList<>(List.of(11, 32, 63, 40, 5, 7, 15, 19, 22, 99));

        System.out.println("Origin list: " + numbers);

        int sum = numbers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
