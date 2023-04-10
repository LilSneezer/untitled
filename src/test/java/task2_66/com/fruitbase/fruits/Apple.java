package task2_66.com.fruitbase.fruits;


import java.math.BigDecimal;

public class Apple extends Fruit {

    public Apple(double weight, BigDecimal price, String name) {
        super(weight, price, name);
    }
    public Apple(double weight, BigDecimal price, String name, Freshness freshness) {
        super(weight, price, name, freshness);
    }
}
