package lesson_17.classwork;

public class Main {
    public static void main(String[] args) {

        boolean isEvening = true;
        System.out.println("Is it evening now ? " + isEvening);

        boolean isMorning = false;
        System.out.println("Is it morning now ? " + isMorning);

        int a = 13;
        boolean isEven = a % 2 == 0;
        System.out.println("Is it " + a + " even ? " + isEven);

        int b = 10;
        int c = 7;
        boolean bool1 = b >= a * c;
        System.out.println("b >= a * c: " + bool1);

        System.out.println("isEven && isMorning = " + (isEvening && isMorning));
        System.out.println("isEven && isMorning = " + (isEvening || isMorning));
        System.out.println("isEven && isMorning = " + (isEvening && !isMorning));

        boolean isSummer = true;
        boolean isWinter = false;

        boolean isWinterOrSummerEvening = isEvening && isWinter || isEvening && isSummer;
        System.out.println("isEvening && isSummer || isEvening && isWinter = " + isWinterOrSummerEvening);

    }

}
