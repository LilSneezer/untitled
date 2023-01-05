package part3.lesson19;

public class MainLesson19 {
    public static void main(String[] args) {

        Dog dog = new Dog("Микки", "Корм для собак", 3, "Москва", 1000, "HEALTHY");
        Horse horse = new Horse("Том", "сено", 15, "лес", 2000, "UNHEALTHY");
        Cat cat = new Cat("Барсик", "Корм для кошек", 2, "Москва", 3000, "HEALTHY");
        Vet vet = new Vet();

        //вывод общей инф-ции о каждой особи
        System.out.println(dog);
        System.out.println(horse);
        System.out.println(cat);

        //вызов у каждой особи метода makeSound
        dog.makeSound("Гав!");
        horse.makeSound("Иго-го!");
        cat.makeSound("Мяу!");

        //вызовите метод eat у некоторых животных
        dog.eat(5, 1, "Микки");

        //вызовите метод sleep у некоторых животных
        cat.sleep("Барсик");

        //создайте ветеринара и отведите каждого животного на прием
        vet.treatAnimal(dog);
        vet.treatAnimal(horse);
        vet.treatAnimal(cat);

    }
}
