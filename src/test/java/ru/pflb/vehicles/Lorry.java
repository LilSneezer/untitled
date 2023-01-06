package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car{
    private int loadingAmount;

    public Lorry(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine, int loadingAmount) {
        super(model, vehicleClass, weight, driver, engine);
        this.loadingAmount = loadingAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Грузоподъемность: " + loadingAmount + " кг";
    }
}
