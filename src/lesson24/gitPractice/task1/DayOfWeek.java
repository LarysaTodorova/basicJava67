package lesson24.gitPractice.task1;

public enum DayOfWeek {
    SUNDAY("Воскресенье", 7),
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6);

    private String dayOfWeek;
    private int orderNumber;

    DayOfWeek(String dayOfWeek, int orderNumber) {
        this.dayOfWeek = dayOfWeek;
        this.orderNumber = orderNumber;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
