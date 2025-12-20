package lesson24Enum.classwork.task3;

public class Main {

    public static void main(String[] args) {

        Month month = Month.JULY;
        System.out.println("Current month: " + month);

        switch (month) {
            case JANUARY:
                System.out.println("The first month is January");
                break;
            case APRIL:
                System.out.println("The forth month is April");
                break;
            case JULY:
                System.out.println("The hottest month is July");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
