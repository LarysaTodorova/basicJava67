package lesson31Map.jptPactice.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Есть Map<String, String> phoneBook, где
ключ — имя
значение — номер телефона
Нужно:
Добавить 5–6 записей
Вывести номер телефона по имени
Изменить номер существующего контакта
Проверить, есть ли контакт с именем "Anna"
         */

        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Max", "12895634");
        phoneBook.put("Jack", "953124800");
        phoneBook.put("Olivia", "12895634");
        phoneBook.put("Alexa", "649237459");
        phoneBook.put("Lukas", "456697236");

        System.out.println(phoneBook);

        String phone = phoneBook.get("Alexa");
        System.out.println(phone);

        phoneBook.replace("Lukas", "556677332211");
        System.out.println(phoneBook);

        boolean hasAnna = phoneBook.containsKey("Anna");
        System.out.println(hasAnna);
    }
}
