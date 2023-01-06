package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Car {
    private String model;
    private VehicleClass vehicleClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", класс: " + vehicleClass + "\n" +
                "Характеристики: \n" +
                "вес: " + weight + " кг \n" +
                "двигатель: " + engine.toString() + "\n" +
                "Водитель: " + driver.toString();
    }
}
