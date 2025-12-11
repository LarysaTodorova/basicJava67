package lesson21.classwork;

public class Task4 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder);

        builder.append(", world!");
        System.out.println(builder);

        String text1 = "Hello, my name is";
        String text2 = "and I'm";
        String text3 = "years";
        String name = "Max";
        int age = 20;

        StringBuilder builder1 = new StringBuilder();
        builder1
                .append(text1)
                .append(" ")
                .append(name)
                .append(" ")
                .append(text2)
                .append(" ")
                .append(age)
                .append(" ")
                .append(text3)
                .append(".");

        System.out.println(builder1);
    }
}
