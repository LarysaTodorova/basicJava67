package lesson32.classwork.task1;

public enum Degree {
    BACHELOR("Бакалавр"),
    MASTER("Магистр");

    private String russianDescription;

    Degree(String russianDescription) {
        this.russianDescription = russianDescription;
    }

    public String getRussianDescription() {
        return russianDescription;
    }
}
