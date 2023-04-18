package task2_66.com.customers;


import task2_66.com.fruitbase.Cargo;
import task2_66.com.fruitbase.Delivery;
import task2_66.com.fruitbase.fruits.Fruit;
import java.util.ArrayList;

public abstract class Customer {
    protected ArrayList<Fruit> purchases;
    protected String name;

    Customer(String name) {
        purchases = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void takeFruits(Delivery cargo);

    public static void actualizeCargo(ArrayList<Fruit> purchases, Delivery cargo) {
        for (int i = 0; i < purchases.size(); i++) {
            cargo.removeFruit(purchases.get(i));
        }
    }

    public void printPurchases() {
        String fruits = "";
        for (Fruit fruit: purchases) {
            fruits += fruit.getName() + " ";
        }
        System.out.println(fruits);
    }
}
