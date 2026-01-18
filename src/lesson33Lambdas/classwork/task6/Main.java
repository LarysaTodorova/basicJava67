package lesson33Lambdas.classwork.task6;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*
        Задача: написать метод, который на вход принимает массив строк,
        преобразует этот массив в сет, при этом попутно обрабатывая каждый
        элемент массива при помощи переданной функции.
        Примеры:
        [AAA, BBBBB, CC, BBBBB]  ->  Set [AAAAAA, BBBBBBBBBB, CCCC]
        [AAA, BBBBB, CC, BBBBB]  ->  Set [AAA 3, BBBBB 5, CC 2]
         */

        String[] array = {"AAA", "BBBBB", "CC", "BBBBB" };

        //  [AAA, BBBBB, CC, BBBBB]  ->  Set [AAAAAA, BBBBBBBBBB, CCCC]
        Set<String> result1 = generateSetFromArray(array, x -> x + x);
        System.out.println("First set: " + result1);

        //  [AAA, BBBBB, CC, BBBBB]  ->  Set [AAA 3, BBBBB 5, CC 2]
        Set<String> result2 = generateSetFromArray(array, x -> x + " " + x.length());
        System.out.println("Second set: " + result2);

        // [AAA, BBBBB, CC, BBBBB]  ->  Set [AAA, BBBBB, CC]
        Set<String> result3 = generateSetFromArray(array, Function.identity());
        System.out.println("Third set: " + result3);

    }

    public static Set<String> generateSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new HashSet<>();
        for (String element : array) {
            String processedElement = function.apply(element);
            result.add(processedElement);
        }
        return result;
    }
}
