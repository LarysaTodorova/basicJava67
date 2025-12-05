package practiceIfElse;

import java.util.Scanner;

public class Task14 {
    /*
    Цвет светофора
Ввод: "red", "yellow", "green"
Вывод: "Stop", "Wait", "Go".
     */
    public static void main(String[] args) {

        String red = "red";
        String yellow = "yellow";
        String green = "green";

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a color: red, yellow or green");
        String color = input.nextLine();

        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Wait");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("Go");
        }else {
            System.out.println("Not a valid color");
        }
    }
}
