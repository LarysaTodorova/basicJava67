package lesson_19.gptForForEach;

public class Task1 {
    public static void main(String[] args) {
  /*
  Дан массив целых чисел.
  Найдите второй по величине элемент (второй максимум) и выведите его.
  Если максимальный элемент только один — вывести сообщение No second max.
  */
        int[] numbers = {3, 15, 7, 9, 20, 11};

        int max = 0;
        int secondMax = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        for (int number : numbers) {
            if (number > secondMax && number < max) {
                secondMax = number;
            }
        }
        if (secondMax == max) {
            System.out.println("No second max");
        } else {
            System.out.println("Second max: " + secondMax);
        }
    }
}
