package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.Fruit;
import java.math.BigDecimal;
import java.util.ArrayList;

public interface Delivery {
    double getWeight();
    BigDecimal getPrice();
    void addFruit(Fruit fruit);
    ArrayList<Fruit> getFruits();
    Fruit removeFruit(Fruit fruit);
}
