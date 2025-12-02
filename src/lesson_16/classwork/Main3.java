package lesson_16.classwork;

public class Main3 {
    public static void main(String[] args) {

        String myString = "Hello Java!";
        System.out.println("Длина строки: " + myString.length());

        char first = myString.charAt(0);
        System.out.println("Первый символ: " + first);

        int lastSymbolIndex = myString.length() - 1;
        char last = myString.charAt(lastSymbolIndex);
        System.out.println("Последний символ: " + last);

        myString = myString.toUpperCase();
        System.out.println(myString);
    }
}
