package task2_66.com.fruitbase;


import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;

public class Simulation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(1);
        }
        FruitBase fruitBase = new FruitBase();
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
}
