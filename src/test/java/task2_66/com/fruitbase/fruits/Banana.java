package task2_66.com.fruitbase.fruits;


import java.math.BigDecimal;

public class Banana extends Fruit implements task2_66.com.interfaces.Fruit {

    public Banana(double weight, BigDecimal price, String name) {
        super(weight, price, name);
    }
    public Banana(double weight, BigDecimal price, String name, Freshness freshness) {
        super(weight, price, name, freshness);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
