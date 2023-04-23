package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;

public class FruitCatalogue implements Serializable {
    private Fruit[] fruit;
    private static final long serialVersionUID = 1L;

    FruitCatalogue() {
        Apple apple = new Apple(30.0, new BigDecimal("500"), "Apple");
        Banana banana = new Banana(35.0, new BigDecimal("500"), "Banana");
        Orange orange = new Orange(30.0, new BigDecimal("550"), "Orange");
        Pineapple pineapple = new Pineapple(35.0, new BigDecimal("550"), "Pineapple");

        fruit = new Fruit[] {apple, banana, orange, pineapple};
    }

    Fruit findFruit(String fruitToFind) {
        int i = 0;
        Fruit foundFruit = null;
        do {
            if (fruit[i].getName().equals(fruitToFind)) {
                foundFruit = fruit[i];
                break;
            }
            i++;
        } while (i < fruit.length);
        return foundFruit;
    }

    @Override
    public String toString() {
        return Arrays.toString(fruit);
    }
}
