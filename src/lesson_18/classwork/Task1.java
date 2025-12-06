package lesson_18.classwork;

public class Task1 {

    public static void main(String[] args) {

        int number = 0;

        switch (number) {
            case 1:
                System.out.println("Переменная равна единице");
                break;
            case 2:
                System.out.println("Переменная равна двойке");
                break;
            case 3:
                System.out.println("Переменная равна тройке");
                break;
        }

        String word = "Thanks";

        switch (word) {
            case "Hello":
                System.out.println("You said hello");
                break;
            case "Bye":
                System.out.println("You said goodbye");
                break;
            case "Thanks":
                System.out.println("You thanked");
                break;
        }
    }
}
