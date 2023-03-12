package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.*;
import java.math.BigDecimal;

public class FruitCatalogue {
    private Fruit[] fruit;

    FruitCatalogue() {
        Apple apple = new Apple(10.0, new BigDecimal("200"), "Apple");
        Banana banana = new Banana(15.0, new BigDecimal("300"), "Banana");
        Orange orange = new Orange(20.0, new BigDecimal("150"), "Orange");
        Pineapple pineapple = new Pineapple(25.0, new BigDecimal("350"), "Pineapple");

        fruit = new Fruit[] {apple, banana, orange, pineapple};
    }

    Fruit findFruit(String fruitToFind) {
        int i = 0;
        Fruit foundFruit = null;
        do {
            if (fruit[i].getName().equals(fruitToFind)) {
                foundFruit = fruit[i];
            }
            i++;
        } while (i < fruit.length);
        return foundFruit;
    }
}
