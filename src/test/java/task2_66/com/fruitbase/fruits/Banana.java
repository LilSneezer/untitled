package task2_66.com.fruitbase.fruits;


import java.math.BigDecimal;

public class Banana extends Fruit {

    public Banana(double weight, BigDecimal price, String name) {
        super(weight, price, name);
        this.weight = weight;
        this.price = price;
        this.name = name;
    }
}
