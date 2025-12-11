package lesson21.classwork;

public class Task3 {
    public static void main(String[] args) {

        String text1 = "Hello";

        StringBuilder text2 = new StringBuilder("Hello");
        System.out.println(text1);
        System.out.println(text2);

        text1 = text1 + "!!!";

        text2.append("!!!");

        System.out.println(text1);
        System.out.println(text2);
    }
}
