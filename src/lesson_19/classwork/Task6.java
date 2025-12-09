package lesson_19.classwork;

public class Task6 {
    public static void main(String[] args) {

        // Задача: вывести на экран только те имена из массива, которые не начинаются на А

        String[] names = {"Leo", "Alex", "Max", "Alexa", "Robert"};

//        for (String name : names) {
//            if (!name.contains("A")) {
//                System.out.println(name);
//            }
//        }

        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }

    }
}
