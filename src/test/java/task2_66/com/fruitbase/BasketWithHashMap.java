package task2_66.com.fruitbase;


import javax.lang.model.type.NullType;
import java.util.HashMap;
import java.util.Iterator;

public class BasketWithHashMap<T> implements Iterable<T> {
    HashMap<T, NullType> basket = new HashMap<>();

    public void addItem(T item1) {
        basket.put(item1, null);
    }

    public Iterator<T> iterator() {
        return basket.keySet().iterator();
    }
}
