package part3.lesson19;

public class Horse extends Animal {
    private String sound;
    private String name;
    private String location;
    private int counter;
    private String health;
    private int foodCounter;
    private int howMuchAnimalEats;

    public Horse(String name, String food, int foodCounter, String location, int counter, String health) {
        super(name, food, foodCounter, location, counter, health);
    }

    @Override
    public void eat(int foodCounter, int howMuchAnimalEats, String name) {
        this.foodCounter = foodCounter;
        this.howMuchAnimalEats = howMuchAnimalEats;
        this.name = name;
        System.out.printf("%s ест \n", name);
        foodCounter = foodCounter - howMuchAnimalEats;
        System.out.printf("Еды осталось %s кг \n", foodCounter);

    }

    @Override
    public void makeSound(String sound) {
        this.sound = sound;
        System.out.println("Лошадь говорит " + sound);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
