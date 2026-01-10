package lesson30ComparingObjects.gptPractice.task3;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    /*
    Написать ProductComparator, который сортирует:
1️⃣ сначала доступные товары
2️⃣ среди них — по категории
3️⃣ если категория одинаковая — по цене (по возрастанию)
4️⃣ если цена одинаковая — по названию
💡 Подсказка: boolean тоже можно сравнивать 😉
     */

    @Override
    public int compare(Product product1, Product product2) {

        if (Boolean.compare(product2.isAvailable(), product1.isAvailable()) != 0) {
            return Boolean.compare(product2.isAvailable(), product1.isAvailable());
        }

        if (product1.getCategory().compareTo(product2.getCategory()) != 0) {
            return product1.getCategory().compareTo(product2.getCategory());
        }

        if (Double.compare(product1.getPrice(), product2.getPrice()) != 0) {
            return Double.compare(product1.getPrice(), product2.getPrice());
        }

        return product1.getName().compareTo(product2.getName());
    }
}
