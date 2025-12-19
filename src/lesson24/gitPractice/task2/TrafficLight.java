package lesson24.gitPractice.task2;

public enum TrafficLight {

    RED("Красный") {
        @Override
        public void getAction() {
            System.out.println("Стоять");
        }
    },
    YELLOW("Желтый") {
        @Override
        public void getAction() {
            System.out.println("Приготовиться");
        }
    },
    GREEN("Зеленый") {
        @Override
        public void getAction() {
            System.out.println("Можно идти");
        }
    };

    private String colorName;

    TrafficLight(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public abstract void getAction();
}
