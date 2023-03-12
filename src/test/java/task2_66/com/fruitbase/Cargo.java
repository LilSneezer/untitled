package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.Fruit;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Cargo {
    private ArrayList<Fruit> fruit;

    Cargo() {
        this.fruit = new ArrayList<>();
    }

    void addFruit(Fruit fruit) {
        this.fruit.add(fruit);
    }

    public ArrayList<Fruit> getFruit() {
        return fruit;
    }

    public double getWeight(ArrayList<Fruit> fruit) {
        double commonWeight = 0;
        for (Fruit fruitToCountWeight: fruit) {
            commonWeight += fruitToCountWeight.getWeight();
        }
        return commonWeight;
    }

    public BigDecimal getPrice(ArrayList<Fruit> fruit) {
        BigDecimal commonPrice = new BigDecimal("0");
        for (Fruit fruiToCountPrice: fruit) {
            commonPrice = commonPrice.add(fruiToCountPrice.getPrice());
        }
        return commonPrice;
    }
}
