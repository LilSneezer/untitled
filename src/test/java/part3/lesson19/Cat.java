package part3.lesson19;

public class Cat extends Animal {
    private static int animalTypeCounter;

    public Cat(String name, String food, int foodCounter, String location, HealthState health, String sound) {
        super(name, food, foodCounter, location, health, sound);
        animalTypeCounter++;
        System.out.println("Количество особей кошек: " + animalTypeCounter);
    }

    @Override
    public void eat(int howMuchAnimalEats) {
        System.out.printf("%s ест \n", name);
        foodCounter = foodCounter - howMuchAnimalEats;
        System.out.printf("Еды осталось %s кг \n", foodCounter);
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка говорит " + sound);
    }

    @Override
    public void sleep() {
        System.out.printf("%s спит \n", name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
