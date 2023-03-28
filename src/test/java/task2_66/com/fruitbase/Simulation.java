package task2_66.com.fruitbase;

import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;
import task2_66.com.fruitbase.fruits.Fruit;
import java.util.ArrayList;


public class Simulation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(1);
        } else {
            FruitBase fruitBase = new FruitBase();
            FreshCustomer freshCustomer = new FreshCustomer("Свежие");
            UniqueCustomer uniqueCustomer = new UniqueCustomer("Уникальные");
            Customer[] customers = new Customer[]{freshCustomer, uniqueCustomer};
            Cargo cargo = fruitBase.takeOrder(args);
            ArrayList<Fruit> purchases;
            System.out.println("Информация о сформированном грузе: \n" + cargo);
            for (Customer customer: customers) {
                purchases = customer.takeFruits(cargo.getFruits());
                System.out.printf("Покупатель %s выбрал из груза: %s \n", customer.getName(), customer.printPurchases(purchases));
                for (Fruit fruit : purchases) {
                    purchases = cargo.removeFruit(fruit);
                }
                String arr = "";
                for (int i = 0; i < purchases.size(); i++) {
                    arr += purchases.get(i).getName() + " ";
                }
                System.out.println("Оставшийся груз: \n" + fruitBase.takeOrder(arr.split(" ")));
            }
        }
    }
}
