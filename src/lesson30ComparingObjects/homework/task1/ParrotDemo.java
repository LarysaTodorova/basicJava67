package lesson30ComparingObjects.homework.task1;

import java.util.Set;
import java.util.TreeSet;

public class ParrotDemo {
    public static void main(String[] args) {
        /*
        Создайте класс Parrot (попугай).
У попугая должны быть две целочисленные характеристики - возраст и количество слов, которые он знает.
Попугаи должны уметь сравнивать сами себя с другими попугаями по возрасту
(вспомните, какой интерфейс для этого нужен).
Создайте TreeSet из нескольких попугаев и выведите его в консоль.
Ожидаемый результат - попугаи отсортированы по возрасту.
Требуется реализовать сортировку попугаев по количеству слов.
Создайте для этого ParrotComparator (вспомните, какой интерфейс для этого нужен).
Компаратор попугаев должен уметь сравнивать попугаев по количеству слов.
Создайте TreeSet попугаев, передав туда объект компаратора, и выведите его в консоль.
Ожидаемый результат - попугаи отсортированы по количеству слов.
         */

        Set<Parrot> parrots = new TreeSet<>();

        parrots.add(new Parrot(5, 10));
        parrots.add(new Parrot(15, 85));
        parrots.add(new Parrot(3, 7));
        parrots.add(new Parrot(18, 63));
        parrots.add(new Parrot(9, 35));

        for (Parrot parrot : parrots) {
            System.out.println(parrot);
        }

        System.out.println();

        Set<Parrot> parrots1 = new TreeSet<>(new ParrotComparator());

        parrots1.add(new Parrot(5, 7));
        parrots1.add(new Parrot(15, 85));
        parrots1.add(new Parrot(3, 10));
        parrots1.add(new Parrot(18, 63));
        parrots1.add(new Parrot(9, 35));

        for (Parrot parrot : parrots1) {
            System.out.println(parrot);
        }
    }
}
