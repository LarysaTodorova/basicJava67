package lesson28Iterator.gptPractice.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Дан список чисел.
        Идя слева направо, удалять все числа, кратные 3,
        пока не встретится число больше 20.
        Число > 20 не удалять и после него ничего не делать.
         */

        List<Integer> numbers = new ArrayList<>(List.of(3, 6, 7, 9, 22, 12, 18));
        System.out.println("List before delete: ");
        System.out.println(numbers);
        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();

            if (number > 20) {
                break;
            }

            if (number % 3 == 0) {
                iterator.remove();
            }
        }

        System.out.println("List after delete: ");
        System.out.println(numbers);
    }
}
/*
Сначала проверяю условие остановки,
потому что элементы после границы и сама граница
не должны участвовать в удалении.
 */
