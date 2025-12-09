package lesson_19.homework;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создайте массив, который содержит несколько названий фруктов.
        Выведите его на экран так, чтобы каждое название выводилось с новой строки.
         */

        String[] fruits = {"Apple", "Orange", "Lemon", "Banana", "Watermelon"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
