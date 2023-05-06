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

    public void exportCatalogue(String filePath) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(fruitCatalogue);
            objectOutputStream.close();
            System.out.println("каталог экспортирован");
        } catch (FileNotFoundException ex) {
            System.out.printf("Не найден файл %s \n", filePath);
            System.exit(1);
        } catch (IOException ex) {
            System.out.printf("Ошибка при экспорте файла %s \n", filePath);
            System.exit(1);
        } catch (RuntimeException ex) {
            System.out.printf("Непредвиденная ошибка при экспорте каталога из файла %s\n", filePath);
            System.exit(1);
        }
    }

    public void importCatalogue(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            fruitCatalogue = (FruitCatalogue) objectInputStream.readObject();
            System.out.println("Импортированный каталог: \n" + fruitCatalogue);
            System.out.println("каталог импортирован");
        } catch (InvalidClassException ex) {
            System.out.printf("Невозможно импортировать каталог из файла %s: неподдерживаемая версия\n", filePath);
            System.exit(1);
        } catch (FileNotFoundException ex) {
            System.out.printf("Не найден файл %s \n", filePath);
            System.exit(1);
        } catch (IOException ex) {
            System.out.printf("Ошибка при импорте файла %s \n", filePath);
            System.exit(1);
        } catch (RuntimeException | ClassNotFoundException ex) {
            System.out.printf("Непредвиденная ошибка при импорте каталога из файла %s\n", filePath);
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Каталог - " + fruitCatalogue;
    }
}
