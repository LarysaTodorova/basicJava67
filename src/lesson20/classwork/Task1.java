package lesson20.classwork;

public class Task1 {
    public static void main(String[] args) {
        // Задача: вывести каждый массив на экран таким образом,
        // чтобы каждый элемент был выведен с новой строки,
        // а строки при этом пронумерованы.
        // Ожидаемый результат:
        // 1. Яблоко
        // 2. Банан
        // ... и так далее

        String[] fruits = {"Apple", "Lemon", "Banana", "Pear", "Strawberry"};
        String[] names = {"Alex", "Robert", "Olivia", "Jack", "Anna", "Max"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + 1 + ". " + fruits[i]);
        }

        System.out.println();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + 1 + ". " + names[i]);
        }
    }
}
