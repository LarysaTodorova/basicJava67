package lesson34StreamAPI.homework.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте класс Customer (покупатель).
Покупатель должен обладать характеристиками: имя, возраст, количество покупок.
Создайте лист и наполните его десятью покупателями с разными именами, в возрасте от 20 до 80 лет,
количество покупок - от 1 до 5.
Представьте, что есть магазин, который проводит акцию. Задача - определить победителей акции и вывести их в консоль.
Условия акции: побеждают два человека пенсионного возраста (от 65 лет включительно),
которые совершили минимум 3 покупки в магазине.
Важное уточнение: одинаковые покупатели два раза к участию в акции не допускаются.
Задание должно быть решено при помощи одного стрима.
         */

        List<Customer> customers = new ArrayList<>(List.of(
                new Customer("Anna", 67, 3),
                new Customer("Robert", 29, 1),
                new Customer("Lukas", 33, 5),
                new Customer("Jack", 79, 2),
                new Customer("Maria", 80, 3),
                new Customer("Olivia", 65, 5),
                new Customer("Max", 55, 1),
                new Customer("Alexa", 40, 2),
                new Customer("John", 69, 4),
                new Customer("Frank", 50, 3)
        ));

        System.out.println("All customers: ");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println();

        List<Customer> winners = customers
                .stream()
                .filter(x -> x.getAge() >= 65 && x.getNumberOfPurchases() >= 3)
                .distinct()
                .limit(2)
                .toList();

        winners.forEach(System.out::println);
    }
}
