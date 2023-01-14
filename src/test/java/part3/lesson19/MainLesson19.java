package part3.lesson19;

public class MainLesson19 {
    public static void main(String[] args) {

        Dog dog = new Dog("Микки", "Корм для собак", 3, "Москва", HealthState.HEALTHY, "Гав!");
        System.out.println(dog);

        System.out.println("----------------------------------");

        Dog dog1 = new Dog("Микки", "Корм для собак", 3, "Москва", HealthState.HEALTHY, "Гав!");

        System.out.println("----------------------------------");

        Horse horse = new Horse("Том", "сено", 15, "лес", HealthState.UNHEALTHY, "Иго-го!");
        System.out.println(horse);

        System.out.println("----------------------------------");

        Cat cat = new Cat("Барсик", "Корм для кошек", 2, "Москва", HealthState.HEALTHY, "Мяу!");
        System.out.println(cat);

        System.out.println("----------------------------------");

        Cat cat1 = new Cat("Барсик", "Корм для кошек", 2, "Москва", HealthState.HEALTHY, "Мяу!");

        Vet vet = new Vet();

        //вызов у каждой особи метода makeSound
        dog.makeSound();
        horse.makeSound();
        cat.makeSound();

        //вызовите метод eat у некоторых животных
        dog.eat(1);
        horse.eat(3);

        //вызовите метод sleep у некоторых животных
        cat.sleep();

        //создайте ветеринара и отведите каждого животного на прием
        vet.treatAnimal(dog);
        vet.treatAnimal(horse);
        vet.treatAnimal(cat);

    }
}
