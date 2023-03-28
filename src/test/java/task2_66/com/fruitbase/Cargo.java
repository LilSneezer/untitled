package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.Fruit;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Cargo {
    private ArrayList<Fruit> fruit;

    public Cargo() {
        this.fruit = new ArrayList<>();
    }

    void addFruit(Fruit fruit) {
        this.fruit.add(fruit);
    }

    public ArrayList<Fruit> getFruits() {
        return fruit;
    }

    public ArrayList<Fruit> removeFruit(Fruit fruitName) {
        if (!fruit.contains(fruitName)) {
            System.exit(0);
        } else {
            fruit.remove(fruitName);
        }
        return fruit;
    }

    public double getWeight() {
        double commonWeight = 0;
        for (Fruit fruitToCountWeight: fruit) {
            commonWeight += fruitToCountWeight.getWeight();
        }
        return commonWeight;
    }

    public BigDecimal getPrice() {
        BigDecimal commonPrice = BigDecimal.ZERO;
        for (Fruit fruiToCountPrice: fruit) {
            commonPrice = commonPrice.add(fruiToCountPrice.getPrice());
        }
        return commonPrice;
    }

    @Override
    public String toString() {
        return "-Общий вес: " + getWeight() + "\n" +
                "-Общая стоимость: " + getPrice();
    }
}