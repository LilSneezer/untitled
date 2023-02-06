package part3.lesson19;

public abstract class Animal {
    protected String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected static int counter;
    protected HealthState health;
    protected String sound;

    public Animal(String name, String food, int foodCounter, String location, HealthState health, String sound) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.health = health;
        this.sound = sound;

        counter++;
        System.out.println("Текущее количество животных: " + counter);
    }

    public String getHealth() {
        return health.name();
    }

    public void setHealth(HealthState health) {
        this.health = health;
    }

    public abstract void makeSound();

    public abstract void eat(int howMuchAnimalEats);

    public abstract void sleep();

    @Override
    public String toString() {
        return "<Кличка> " + name + '\n' +
                "Страна обитания: " + location + '\n' +
//                "Количество особей: " + counter + '\n' +
                "Состояние здоровья: " + health + "\n";
    }
}
