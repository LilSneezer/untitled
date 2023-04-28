package task2_66.com.fruitbase;


import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;
import task2_66.com.exceptions.ImportException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.rmi.server.ExportException;

public class Simulation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(1);
        }
        FruitBase fruitBase = new FruitBase();
        try {
            selectMethodByFlag(args, fruitBase);
        } catch (FileNotFoundException ex) {
            System.out.printf("Не найден файл %s \n", args[args.length - 1]);
            System.exit(1);
        } catch (InvalidClassException ex) {
            System.out.printf("Невозможно импортировать каталог из файла %s: неподдерживаемая версия\n", args[args.length - 1]);
            System.exit(1);
        } catch (ExportException ex) {
            System.out.printf("Ошибка при экспорте файла %s \n", args[args.length - 1]);
            System.exit(1);
        } catch (ImportException ex) {
            System.out.printf("Ошибка при импорте файла %s \n", args[args.length - 1]);
            System.exit(1);
        } catch (Exception ex) {
            System.out.println("Непредведенная ошибка при импорте/экспорте каталога из файла");
            System.exit(1);
        }

        FreshCustomer freshCustomer = new FreshCustomer("Свежие");
        UniqueCustomer uniqueCustomer = new UniqueCustomer("Уникальные");
        Customer[] customers = new Customer[]{freshCustomer, uniqueCustomer};
        Cargo cargo = fruitBase.takeOrder(args);
        System.out.println("Информация о сформированном грузе: \n" + cargo);
        for (Customer customer: customers) {
            customer.takeFruits(cargo);
            System.out.printf("Покупатель %s выбрал из груза: ", customer.getName());
            customer.printPurchases();
            System.out.println(cargo.toString());
        }
    }

    public static void selectMethodByFlag(String[] args, FruitBase fruitBase) throws IOException, ClassNotFoundException, ImportException {
        if (args[args.length - 1].equals("-e") || args[args.length - 1].equals("--export")) {
            fruitBase.exportCatalogue("defaultFruitCatalogExport.ser");
        } else if (args[args.length - 1].equals("-i") || args[args.length - 1].equals("--import")) {
            fruitBase.importCatalogue("defaultFruitCatalogExport.ser");
        } else if ((args[args.length - 3].equals("-e") || (args[args.length - 3].equals("--export"))) && args[args.length - 2].equals("=") && !args[args.length - 1].equals("")) {
            fruitBase.exportCatalogue(args[args.length - 1]);
        } else if (args[args.length - 1].equals("=") & args[args.length - 2].equals("-e") || args[args.length - 2].equals("--export")) {
            throw new ExportException("");
        } else if ((args[args.length - 3].equals("-i") || (args[args.length - 3].equals("--import"))) && args[args.length - 2].equals("=") && !args[args.length - 1].equals("")) {
            fruitBase.importCatalogue(args[args.length - 1]);
        } else if (args[args.length - 1].equals("=") & (args[args.length - 2].equals("-i") || args[args.length - 2].equals("--import"))) {
            throw new ImportException("");
        }
    }
}
