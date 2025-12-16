package lesson23.classwork.task03;

public abstract class LandAnimal extends Animal {

    private String furColor;

    public LandAnimal(double weight, String furColor) {
        super(weight);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

}
