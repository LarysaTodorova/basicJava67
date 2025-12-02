package lesson_15.homework;

public class Task01 {

    public static void main(String[] args) {
        /*
    Создайте новый класс. Создайте метод main.
    Исходные данные: Цена за один билет в кино составляет 4 у.е. У вас 19 у.е.

     Напишите программу, которая сохраняет эти данные в переменных,
     вычисляет и выводит в консоль, сколько билетов вы можете купить.
     Сколько денег у вас останется, после покупки максимально возможного количества билетов.
         */

        int ticketPrice = 4;
        int myMoney = 19;
        int ticketCount = myMoney / ticketPrice;
        int restMoney = myMoney % ticketPrice;


        System.out.println("I can buy " + ticketCount + " tickets!");
        System.out.println("I have " + restMoney + " euros left");


    }

}
