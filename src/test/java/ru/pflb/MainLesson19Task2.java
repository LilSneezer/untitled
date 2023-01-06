package ru.pflb;

import part3.lesson19.Cat;
import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;
import ru.pflb.vehicles.Car;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;
import ru.pflb.vehicles.VehicleClass;

public class MainLesson19Task2 {
    public static void main(String[] args) {

        //инфо о грузовиках
        Driver driver = new Driver("10 лет", "12345678", "34 года", "Иванов И.И");
        Engine engine = new Engine(300, "mercedes");
        Lorry lorry = new Lorry("Scania", VehicleClass.LARGE, 5, driver, engine, 20);

        System.out.println(lorry);
        System.out.println("----------------------------------------");

        //инфо о спорткарах
        Driver racer = new Driver("15 лет", "42345134", "40 лет", "Шумахер");
        Engine powerEngine = new Engine(650, "BMW");
        SportCar sportCar = new SportCar("BMW", VehicleClass.SPORTS_CAR, 1000, racer, powerEngine, 300);

        System.out.println(sportCar);
        System.out.println("----------------------------------------");

        //инфо об обычной машине
        Driver simpleDriver = new Driver("4 года", "4444444", "25 лет", "Петров П.П");
        Engine simpleEngine = new Engine(120, "KIA");
        Car car = new Car("KIA", VehicleClass.MEDIUM, 1300, simpleDriver, simpleEngine);

        System.out.println(car);
    }
}
