package lesson20.homework;

public class Task2 {
    public static void main(String[] args) {
/*
Бананы стоят 11 у.е., яблоки - 8 у.е. Вам нужно купить два килограмма бананов и три килограмма яблок.
Сохраните все эти данные в переменных. Напишите программу, которая выводит на экран фразу
"Для покупки Х килограммов бананов и Х килограммов яблок мне нужно Х у.е."
В местах, где Х - нужно воспользоваться переменными.
Напишите отдельный метод, который считает и возвращает стоимость продукта
и воспользуйтесь им два раза для расчёта стоимости яблок и бананов.
 */

        int bananaPrice = 11;
        int applePrice = 8;
        int bananaWeight = 2;
        int appleWeight = 3;

        int bananaCost = calculatePrice(bananaPrice, bananaWeight);
        int appleCost = calculatePrice(applePrice, appleWeight);
        int fruitsPrice = bananaCost + appleCost;

        System.out.println("To buy " + bananaWeight + " kilograms of bananas and " + appleWeight + " kilograms of apples, " +
                "I need " + fruitsPrice + " euro.");


    }

    public static int calculatePrice(int price, int weight) {
        return price * weight;
    }
}
