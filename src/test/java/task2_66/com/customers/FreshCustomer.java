package task2_66.com.customers;


import task2_66.com.fruitbase.fruits.Fruit;
import java.util.ArrayList;

public class FreshCustomer extends Customer {

    public FreshCustomer(String name) {
        super(name);
    }

    private ArrayList<Fruit> freshFruits = new ArrayList<>();

    public ArrayList<Fruit> takeFruits(ArrayList<Fruit> purchases) {
        for (Fruit fruit: purchases) {
            if (fruit.isFresh()) {
                freshFruits.add(fruit);
//                purchases = cargo.removeFruit(fruit);
            }
        }
        return freshFruits;
    }
}
