package task2_66.com.fruitbase.fruits;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class Fruit implements Serializable {
    protected double weight;
    protected BigDecimal price;
    protected String name;
    protected Freshness freshness;


    public Fruit(double weight, BigDecimal price, String name, Freshness freshness) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.freshness = freshness;
    }

    public Fruit(double weight, BigDecimal price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        freshness = Freshness.FRESH;
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

    @Override
    public boolean equals(Object obj) {
        Fruit fruitObj = (Fruit) obj;
        return obj != null &&
                obj.getClass() == this.getClass() &&
                (Objects.equals(this.name, fruitObj.name)) &&
                this.weight == fruitObj.weight &&
                (Objects.equals(this.price, fruitObj.price)) &&
                (Objects.equals(this.freshness, fruitObj.freshness));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) weight;
        result = prime * result + (price != null ? price.hashCode() : 0);
        result = prime * result + (name != null ? name.hashCode() : 0);
        result = prime * result + (freshness != null ? freshness.hashCode() : 0);
        return result;
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }

    @Override
    public String toString() {
        return "\nНазвание: " + name + "\n" +
                "Вес: " + weight + "\n" +
                "Цена: " + price + "\n";
    }
}
