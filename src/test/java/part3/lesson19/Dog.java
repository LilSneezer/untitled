package part3.lesson19;

public class Dog extends Animal {
    private static int animalTypeCounter;

    public Dog(String name, String food, int foodCounter, String location, HealthState health, String sound) {
        super(name, food, foodCounter, location, health, sound);
        animalTypeCounter++;
        System.out.println("Количество особей собак: " + animalTypeCounter);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака говорит " + sound);
    }

    @Override
    public void eat(int howMuchAnimalEats) {
        System.out.printf("%s ест \n", name);
        foodCounter = foodCounter - howMuchAnimalEats;
        System.out.printf("Еды осталось %s кг \n", foodCounter);

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

