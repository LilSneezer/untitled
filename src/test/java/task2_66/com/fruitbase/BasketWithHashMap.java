package task2_66.com.fruitbase;


import javax.lang.model.type.NullType;
import java.util.HashMap;
import java.util.Iterator;

public class BasketWithHashMap<T> {
    HashMap<String, NullType> basket = new HashMap<>();

    public void addItem(String item1) {
        basket.put(item1, null);
    }

    public Iterator<String> iterator() {
        return basket.keySet().iterator();
    }
}
