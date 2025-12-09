package lesson20.classwork;

public class Task5 {
    public static void main(String[] args) {

        System.out.println(getSum(5, 7, 9, 1, 4, -50, 80));
        System.out.println(getSum(5, 9, 1, 80));

    }
    // Метод с переменным количеством аргументов (varargs).
    // В такой метод мы можем передать сколько угодно аргументов.
    // При этом аргументы будут упакованы в массив, и этот массив
    // запишется в формальный параметр метода.

    public static int getSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
