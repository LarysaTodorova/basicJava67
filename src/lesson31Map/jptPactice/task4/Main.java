package lesson31Map.jptPactice.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Есть Map<String, Double> products, где
ключ — название товара
значение — цена
Нужно:
Найти товар с максимальной ценой
Вывести его название и цену
Подсказка: сравнивать значения внутри цикла
         */

        Map<String, Double> products = new HashMap<>();
        products.put("Apple", 4.0);
        products.put("Orange", 6.0);
        products.put("Lemon", 7.0);
        products.put("Banana", 4.50);
        products.put("Kiwi", 7.50);
        products.put("Pineapple", 11.50);

        Double maxPrice = 0.0;

        for (Map.Entry<String, Double> product : products.entrySet()) {
            if (product.getValue() > maxPrice) {
                maxPrice = product.getValue();
            }
        }

        System.out.println("Max price: " + maxPrice);
    }
}
