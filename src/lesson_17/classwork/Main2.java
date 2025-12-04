package lesson_17.classwork;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = "hello";
        String str2 = "hello";
        System.out.println("Enter a string: ");
        String str3 = scanner.nextLine();

        boolean isEquals1 = str1.equals(str2);   //str1 == str2;
        boolean isEquals2 = str1.equals(str3);   //str1 == str3;
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("equals strings str1 == str2 result: " + isEquals1);
        System.out.println("equals strings str1 == str3 result: " + isEquals2);

    }

}
