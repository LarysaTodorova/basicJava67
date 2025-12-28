package lesson26Arrays.classwork.task2;


public class Main {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Orange", "Strawberry"};

        printFruits(fruits);
    }

    // Задача: написать метод, который на вход принимает массив строк
    // и выводит его на консоль так, что каждый элемент выводится с новой строки,
    // при этом строки нумеруются от 1 и по возрастанию:
    // Пример:
    // 1. Яблоко
    // 2. Лимон
    // 3. Апельсин

//    public static void printFruits(String[] fruits) {
//        int counter = 0;
//        for (String fruit : fruits) {
//            counter++;
//            System.out.println(counter + ". " + fruit);
//        }
//    }

    public static void printFruits(String[] fruits) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + 1 + ". " + fruits[i]);
        }
    }
}
