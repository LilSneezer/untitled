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

    public Fruit removeFruit(Fruit fruitToRemove) {
        if (!fruit.contains(fruitToRemove)) {
            return null;
        } else {
            fruit.remove(fruitToRemove);
        }
        return fruitToRemove;
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
