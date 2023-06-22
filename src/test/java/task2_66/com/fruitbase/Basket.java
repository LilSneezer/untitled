package task2_66.com.fruitbase;


import java.util.ArrayList;

public class Basket<T> {
    ArrayList<T> innerArray = new ArrayList<>();
    public void addItem(T item) {
        innerArray.add(item);
    }
}
