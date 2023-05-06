package task2_66.com.fruitbase;


import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;

public class Simulation {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.exit(1);
        }

        String flag = getFlag(args);
        String path = getPath(args);
        FruitBase fruitBase = new FruitBase();

        selectMethodByFlag(flag, fruitBase, path);

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

    public static String getFlag(String[] args) {
        if (args[args.length-1].startsWith("-e")) {
            return "-e";
        }
        if (args[args.length-1].startsWith("--export")) {
            return "--export";
        }
        if (args[args.length-1].startsWith("-i")) {
            return "-i";
        }
        if (args[args.length-1].startsWith("--import")) {
            return "--import";
        }
        return "";
    }

    public static String getPath(String[] args) {
        final String DEFAULT_PATH = "defaultFruitCatalogExport.ser";
        int equalSignIndex = args[args.length-1].indexOf("=");
        if (equalSignIndex != -1 && !args[args.length-1].substring(equalSignIndex + 1).equals("")) {
            return args[args.length-1].substring(equalSignIndex + 1);
        }
        return DEFAULT_PATH;
    }

    public static void selectMethodByFlag(String flag, FruitBase fruitBase, String path) {
        if (flag.equals("-e") || flag.equals("--export")) {
            fruitBase.exportCatalogue(path);
        } else if (flag.equals("-i") || flag.equals("--import")) {
            fruitBase.importCatalogue(path);
        }
    }
}
