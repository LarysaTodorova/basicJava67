package lesson28.gptPractice.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Что выведет код и почему?

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            int x = it.next();
//            if (x % 2 == 0) {
//                it.remove();
//            }
//        }
//        System.out.println(list);

    }
}
/*
Итератор проходит по списку слева направо.
it.remove() удаляет последний элемент, который вернул next().
Удаляются элементы, где x % 2 == 0 → это 2 и 4.
Удаление через Iterator.remove() безопасно (не будет ConcurrentModificationException).
Итог: остаются 1, 3, 5.
 */
