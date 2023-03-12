package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.Fruit;
import java.math.BigDecimal;

public class FruitBase {
    private FruitCatalogue fruitCatalogue;

    FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    public String takeOrder(String[] fruitsFromOrder) {
        double commonWeight;
        BigDecimal commonPrice;
        Fruit foundFruit;
        Cargo cargo = new Cargo();
        for (int i = 0; i < fruitsFromOrder.length; i++) {
            foundFruit = fruitCatalogue.findFruit(fruitsFromOrder[i]);
            if (foundFruit != null) {
                cargo.addFruit(foundFruit);
            }
        }

        commonWeight = cargo.getWeight(cargo.getFruit());
        commonPrice = cargo.getPrice(cargo.getFruit());

        return "Общий вес: " + commonWeight + "\n" + "Общая стоимость: " + commonPrice;
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        System.out.println(fruitBase.takeOrder(args));
    }
}
