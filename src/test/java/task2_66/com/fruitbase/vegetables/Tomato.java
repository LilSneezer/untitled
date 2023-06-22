package task2_66.com.fruitbase.vegetables;

import task2_66.com.interfaces.Vegetable;

public class Tomato implements Vegetable {
    private final String name;

    public Tomato(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
