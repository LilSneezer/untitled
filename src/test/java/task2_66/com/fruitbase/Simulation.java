package task2_66.com.fruitbase;


import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;

import java.io.IOException;

public class Simulation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (args.length == 0) {
            System.exit(1);
        }
        FruitBase fruitBase = new FruitBase();
        selectMethodByFlag(args, fruitBase);
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

    public static void selectMethodByFlag(String[] args, FruitBase fruitBase) throws IOException, ClassNotFoundException {
        for (String elem: args) {
            if (elem.equals("-e") || (elem.equals("--export"))) {
                fruitBase.exportCatalogue();
            } else if (elem.equals("-i") || (elem.equals("--import"))) {
                fruitBase.importCatalogue();
            }
        }
    }
}
