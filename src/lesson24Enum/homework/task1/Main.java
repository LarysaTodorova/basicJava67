package lesson24Enum.homework.task1;

public class Main {
    /*
    Создайте перечисление с днями недели.
У каждого дня недели должно быть название на русском (или любом другом удобном) языке, например - "Среда".
В методе main создайте переменную, которая может содержать один день недели и инициализируйте её каким-нибудь днём.
Напишите switch, который в будни выводит в консоль фразу - "Сегодня - <здесь_название_дня_на_вашем_языке>". Название следует не писать руками, а брать из объекта при помощи геттера.
В любой из выходных дней фраза должна быть одинаковая - "Сегодня выходной день".
     */
    public static void main(String[] args) {

        DayOfWeek someDay = DayOfWeek.SATURDAY;

        switch (someDay) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Сегодня выходной день");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Сегодня - " + someDay.getDayOfWeek());
                break;
        }
    }
}
