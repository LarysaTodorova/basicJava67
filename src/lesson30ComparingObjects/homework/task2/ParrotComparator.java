package lesson30ComparingObjects.homework.task2;

import java.util.Comparator;

public class ParrotComparator implements Comparator<Parrot> {
    /*
    Доработайте логику компаратора так, чтобы при совпадении количества слов попугаи сортировались по цвету.
    Если совпадает и количество слов, и цвет, сортировка должна производиться по возрасту в порядке убывания.
     */
    @Override
    public int compare(Parrot firstParrot, Parrot secondParrot) {

        if (firstParrot.getNumberOfWords() - secondParrot.getNumberOfWords() != 0) {
            return firstParrot.getNumberOfWords() - secondParrot.getNumberOfWords();
        }

        if (firstParrot.getColor().compareTo(secondParrot.getColor()) != 0) {
            return firstParrot.getColor().compareTo(secondParrot.getColor());
        }

        return secondParrot.getAge() - firstParrot.getAge();
    }
}
