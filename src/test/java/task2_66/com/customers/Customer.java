package task2_66.com.customers;

import task2_66.com.fruitbase.Cargo;
import task2_66.com.fruitbase.fruits.Fruit;
import java.util.ArrayList;

public abstract class Customer {
    protected ArrayList<Fruit> purchases;
    protected String name;

    Cargo cargo = new Cargo();

    Customer(String name) {
        purchases = cargo.getFruits();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract ArrayList<Fruit> takeFruits(ArrayList<Fruit> purchases);

    public String printPurchases(ArrayList<Fruit> purchases) {
        String fruits = "";
        for (Fruit fruit: purchases) {
            fruits += fruit.getName() + " ";
        }
        return fruits;
    }
}
