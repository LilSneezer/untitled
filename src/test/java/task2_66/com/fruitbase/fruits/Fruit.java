package task2_66.com.fruitbase.fruits;


import java.math.BigDecimal;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;
    protected Freshness freshness;

    {
        freshness = Freshness.FRESH;
    }

    Fruit(double weight, BigDecimal price, String name, Freshness freshness) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.freshness = freshness;
    }

    Fruit(double weight, BigDecimal price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract boolean isFresh();
}
