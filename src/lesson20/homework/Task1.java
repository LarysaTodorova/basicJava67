package lesson20.homework;

public class Task1 {
    public static void main(String[] args) {
/*
Напишите программу, которая хранит в переменных данные, какой сейчас по счёту день в году (например, 48),
и название следующего года (например, "Год Тигра").
Программа должна посчитать, сколько дней осталось до следующего года и вывести на экран фразу по образцу -
"Через 123 дня наступит Год Тигра".
Для упрощения считайте, что в году всегда 365 дней.
Оформите расчёт остатка количества дней до конца года в виде отдельного метода(с одним параметром).
Также в программе должен быть второй метод, куда Вы передаёте количество оставшихся дней и название года,
а он выводит требуемую строку на экран.
 */

        int dayOfYear = 345;
        String nextYear = "Year of the Tiger";

        int remainingDays = getRemainingDays(dayOfYear);
        printData(nextYear, remainingDays);

    }

    public static void printData(String yearName, int remainingDays) {
        System.out.println("In " + remainingDays + " days the " + yearName + " will begin.");
    }

    public static int getRemainingDays(int numberOfDay) {
        int daysCount = 365;
        return daysCount - numberOfDay;
    }

}
