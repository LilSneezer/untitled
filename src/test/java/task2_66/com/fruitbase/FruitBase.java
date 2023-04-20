package task2_66.com.fruitbase;


import task2_66.com.fruitbase.fruits.Fruit;

import java.io.*;

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

    public void exportCatalogue() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("fruitCatalog.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(fruitCatalogue);
        objectOutputStream.close();
        System.out.println("каталог экспортирован");
    }

    public void importCatalogue() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("fruitCatalog.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        fruitCatalogue = (FruitCatalogue) objectInputStream.readObject();
        System.out.println("Импортированный каталог: \n" + fruitCatalogue);
        System.out.println("каталог импортирован");
    }

    @Override
    public String toString() {
        return "Каталог - " + fruitCatalogue;
    }
}
