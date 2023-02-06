package task2_39;

public class Main239 {
    public static void main(String[] args) {
        //Задание 1
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Зеленый");
        Cat cat3 = new Cat(4, "Карие", 3.0, "Белый");
        Cat cat4 = new Cat("Голубые", 4.5, "Черный");
        Cat cat5 = new Cat(5.4, "Рыжий");

        System.out.println(cat1);
        System.out.println("---------------------");
        System.out.println(cat2);
        System.out.println("---------------------");
        System.out.println(cat3);
        System.out.println("---------------------");
        System.out.println(cat4);
        System.out.println("---------------------");
        System.out.println(cat5);

        //-----------------------------------------------------------------------------
        //Задание 2
        Summa s = new Summa();
        Integer i = 34;
        Integer j = 54;
        System.out.println("сумма int от 2х переменных int: " + s.sum(3, 4));
        System.out.println("сумма double от 3х переменных int: " + s.sum(3, 4, 5));
        System.out.println("сумма double от 2х переменных double: " + s.sum(2.5, 5.3));
        System.out.println("сумма double от 3х переменных double: " + s.sum(2.5, 5.3, 4.4));
        System.out.println("сумма double от 1 int и от 2х переменных double: " + s.sum(6, 5.3, 5.4));
        System.out.println("сумма double от 2х переменных Integer: " + s.sum(i, j));

        //-----------------------------------------------------------------------------
        //Задание 3
        System.out.println(Cat.testStaticMethod());
        System.out.println(cat1.testStaticMethod());
        System.out.println(NewAnimal.testStaticMethod());

        //Задание 4
        System.out.println(Cat.planet);
        Cat.planet = "Луна";
        System.out.println(Cat.planet);
    }
}
