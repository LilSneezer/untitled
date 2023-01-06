package ru.pflb.details;

public class Engine {
    private int power;
    private String vendor;

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Произодитель - " + vendor + ", " + "Мощность - " + power + " л.с.";
    }
}
