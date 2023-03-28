package task2_66.com.customers;


import task2_66.com.fruitbase.fruits.Fruit;
import java.util.ArrayList;

public class UniqueCustomer extends Customer {

    public UniqueCustomer(String name) {
        super(name);
    }

    ArrayList<Fruit> uniqueFruits = new ArrayList<>();

    public ArrayList<Fruit> takeFruits(ArrayList<Fruit> purchases) {
        int i = 0;
        while (i < purchases.size()) {
            if (uniqueFruits.contains(purchases.get(i))) {
                i++;
            } else {
                uniqueFruits.add(purchases.get(i));
//                purchases = cargo.removeFruit(purchases.get(i));
            }
            i++;
        }
        return uniqueFruits;
    }
}
