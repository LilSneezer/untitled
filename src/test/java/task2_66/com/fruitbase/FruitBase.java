package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.Fruit;

public class FruitBase {
    private FruitCatalogue fruitCatalogue;

    FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] fruitsFromOrder) {
        Fruit foundFruit;
        Cargo cargo = new Cargo();
        for (int i = 0; i < fruitsFromOrder.length; i++) {
            foundFruit = fruitCatalogue.findFruit(fruitsFromOrder[i]);
            if (foundFruit != null) {
                cargo.addFruit(foundFruit);
            }
        }
        return cargo;
    }
}
