package lesson21.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    /*
    Создать массив типа String из семи ячеек.
    Наполнить его названиями фруктов - Apple, Banana, Orange, Peach, Lemon, Cherry, Melon.
    При помощи StringBuilder и цикла преобразовать этот массив в строку - "[Apple, Banana, Orange, Peach, Lemon, Cherry, Melon]".
    Квадратные скобки - это тоже часть строки, и они должны в ней присутствовать.
    Вывести получившуюся строку в консоль.
     */

        String[] fruits = {
                "Apple",
                "Banana",
                "Orange",
                "Peach",
                "Lemon",
                "Cherry",
                "Melon"
        };

        System.out.println("Array before change: " + Arrays.toString(fruits));
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < fruits.length; i++) {
            builder.append(fruits[i]);
            if (i < fruits.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        System.out.println("Array after change: " + builder);
    }
}
