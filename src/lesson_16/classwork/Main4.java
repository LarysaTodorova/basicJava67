package lesson_16.classwork;

public class Main4 {
    public static void main(String[] args) {

        String str = "world!";
        System.out.println(str);

        str = "qwertyuiop";
        System.out.println(str);

        String str1 = "Hello";
        String str2 = "java!";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        String str4 = str1 + "  " + str2.toUpperCase();
        System.out.println(str4);

        int age = 10;
        double weight = 45.5;

        String result = "Возраст: " + age + " вес: " + weight;
        System.out.println(result);
    }

}
