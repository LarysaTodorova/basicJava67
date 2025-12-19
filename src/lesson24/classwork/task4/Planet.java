package lesson24.classwork.task4;

public enum Planet {

    MERCURY("Меркурий", false),
    VENUS("Венера", false),
    EARTH("Земля", false),
    MARS("Марс", false),
    JUPITER("Юпитер", true),
    SATURN("Сатурн", true),
    URANUS("Уран", true),
    NEPTUNE("Нептун", true);

    private String russianName;
    private boolean isGasGiants;

    Planet(String russianName, boolean isGasGiants) {
        this.russianName = russianName;
        this.isGasGiants = isGasGiants;
    }

    public String getRussianName() {
        return russianName;
    }

    public boolean isGasGiants() {
        return isGasGiants;
    }
}
