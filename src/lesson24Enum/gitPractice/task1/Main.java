package lesson24Enum.gitPractice.task1;

public class Main {
    public static void main(String[] args) {

        DayOfWeek day = DayOfWeek.SUNDAY;

        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Сегодня " + day.getDayOfWeek() + ", рабочий день № " + day.getOrderNumber());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Сегодня " + day.getDayOfWeek() + ", выходной день");
                break;
        }
    }
}
