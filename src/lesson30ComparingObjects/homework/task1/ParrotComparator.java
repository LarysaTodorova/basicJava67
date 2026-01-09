package lesson30ComparingObjects.homework.task1;

import java.util.Comparator;

public class ParrotComparator implements Comparator<Parrot> {

    @Override
    public int compare(Parrot firstParrot, Parrot secondParrot) {
        return firstParrot.getNumberOfWords() -  secondParrot.getNumberOfWords();
    }
}
