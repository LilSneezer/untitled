package task2_66.com.fruitbase;

import task2_66.com.fruitbase.fruits.Fruit;
import task2_66.com.interfaces.Vegetable;

import java.util.ArrayList;

public class Basket<T> {
    ArrayList<T> innerArray = new ArrayList<>();
    public void addItem(T item) {
        innerArray.add(item);
    }
}
