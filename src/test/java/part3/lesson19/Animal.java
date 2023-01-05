package part3.lesson19;

public abstract class Animal {
    private String name;
    private String food;
    private int foodCounter;
    private String location;
    private int counter;
    private String health;
    private int howMuchAnimalEats;

    public Animal(String name, String food, int foodCounter, String location, int counter, String health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public void makeSound(String sound) {
        System.out.println(sound);
    }

    public void eat(int foodCounter, int howMuchAnimalEats, String name) {
        System.out.println("Животное ест");
        foodCounter = foodCounter - howMuchAnimalEats;
        System.out.printf("Еды осталось %s", foodCounter);
    }

    public void sleep(String name) {
        this.name = name;
        System.out.printf("%s спит \n", name);
    }

    @Override
    public String toString() {
        return "<Кличка> " + name + '\n' +
                "Страна обитания: " + location + '\n' +
                "Состояние здоровья: " + counter + '\n' +
                "Состояние здоровья: " + health + '\n';
    }
}
