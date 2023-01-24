package task2_39;

public class Cat extends NewAnimal{
    protected int yearCount;
    protected String eyesColor;
    protected double weight;
    protected String woolColor;


    public Cat() {
    }

    public Cat(int yearCount) {
        this.yearCount = yearCount;
    }

    public Cat(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    public Cat(int yearCount, String eyesColor, double weight, String woolColor) {
        this.yearCount = yearCount;
        this.eyesColor = eyesColor;
        this.weight = weight;
        this.woolColor = woolColor;
    }

    public Cat(int yearCount, String eyesColor) {
        this.yearCount = yearCount;
        this.eyesColor = eyesColor;
    }

    public Cat(String eyesColor, double weight) {
        this.eyesColor = eyesColor;
        this.weight = weight;
    }

    public Cat(double weight, String woolColor) {
        this.weight = weight;
        this.woolColor = woolColor;
    }

    public Cat(int yearCount, String eyesColor, double weight) {
        this.yearCount = yearCount;
        this.eyesColor = eyesColor;
        this.weight = weight;
    }

    public Cat(int yearCount, double weight, String woolColor) {
        this.yearCount = yearCount;
        this.weight = weight;
        this.woolColor = woolColor;
    }

    public Cat(String eyesColor, double weight, String woolColor) {
        this.eyesColor = eyesColor;
        this.weight = weight;
        this.woolColor = woolColor;
    }

    public Cat(int yearCount, String eyesColor, String woolColor) {
        this.yearCount = yearCount;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
    }

    public Cat(String eyesColor, int yearCount, String woolColor) {
        this.yearCount = yearCount;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
    }

    public Cat(String eyesColor, String woolColor, int yearCount) {
        this.yearCount = yearCount;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
    }

    public Cat(String woolColor, String eyesColor, double weight) {
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
    }

    public Cat(double weight, String woolColor, String eyesColor) {
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.woolColor = woolColor;
    }

    @Override
    public String toString() {
        return "Возраст: " + yearCount + "\n" +
                "Цвет глаз: " + eyesColor + "\n" +
                "Вес: " + weight + "\n" + 
                "Цвет шерсти: " + woolColor + "\n";

    }
}
