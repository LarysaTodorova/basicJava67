package lesson21.gptPractice;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        /*
        Есть массив строк:
        ["January", "Feb", "March", "Apr", "May", "June", "July", "August"]
        Нужно:
        Используя StringBuilder
        Используя обычный for
        Вывести ТОЛЬКО названия месяцев:
        длина от 4 до 6 символов включительно
        Сформировать строку вида:
        {January | March | April | June | July}
         */
        String[] months = {"January", "Feb", "March", "Apr", "May", "June", "July", "August" };

        System.out.println("Months before change: " + Arrays.toString(months));

        StringBuilder builder = new StringBuilder();
        builder.append("{");

        int counter = 0;

        for (int i = 0; i < months.length; i++) {
            if (months[i].length() >= 4 && months[i].length() <= 6) {
                if (counter > 0) {
                    builder.append(" | ");
                }
                builder.append(months[i]);
                counter++;
            }
        }
        builder.append("}");
        System.out.println("Months after change: " + builder);
    }
}

/*
NOTE:
По условию длина от 4 до 6 включительно.
January (7) не подходит.
April отсутствует в массиве.
Корректный вывод по условию: {March | June | July | August}
*/

