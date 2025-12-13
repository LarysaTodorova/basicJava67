package lesson22.classwork.task05;

public class Parrot {

    private String color;
    private int words;

    public Parrot(String color, int words) {
        this.color = color;
        this.words = words;
    }

    public int getWords() {
        return words;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWords(int words) {
        if (words < 0) {
            System.out.println("Error: words must be greater than zero");
            return;
        }
        this.words = words;
    }
}
