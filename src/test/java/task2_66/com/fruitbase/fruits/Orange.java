package task2_66.com.fruitbase.fruits;


import java.math.BigDecimal;

public class Orange extends Fruit {

    public Orange(double weight, BigDecimal price, String name) {
        super(weight, price, name);
    }
    public Orange(double weight, BigDecimal price, String name, Freshness freshness) {
        super(weight, price, name, freshness);
    }

    @Override
    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
