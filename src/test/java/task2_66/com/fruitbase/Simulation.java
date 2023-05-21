package task2_66.com.fruitbase;


import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;
import java.io.IOException;

public class Simulation {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.exit(1);
        }

        String flag = getFlag(args);
        String path = getPath(args);
        FruitBase fruitBase = new FruitBase();

        selectMethodByFlag(flag, fruitBase, path);

        Cargo cargo = fruitBase.takeOrder(args);
        FreshCustomer freshCustomer = new FreshCustomer("Свежие");
        UniqueCustomer uniqueCustomer = new UniqueCustomer("Уникальные");
        Customer[] customers = new Customer[]{freshCustomer, uniqueCustomer};
        Delivery cargo = fruitBase.takeOrder(args);
        Customer expensiveFruitCustomer = new Customer("Дорогие Фрукты") {
            final BigDecimal maxPrice = findMaxPrice(cargo);
            final BigDecimal percentOfMaxPrice = maxPrice.multiply(new BigDecimal(75)).divide(new BigDecimal(100), RoundingMode.CEILING);
            @Override
            public void takeFruits(Cargo cargo) {

                for (int i = 0; i < cargo.getFruits().size(); i++) {
                    if (cargo.getFruits().get(i).getPrice().compareTo(percentOfMaxPrice) >= 0) {
                        purchases.add(cargo.getFruits().get(i));
                    }
                }
                actualizeCargo(purchases, cargo);
            }
        };
        Customer[] customers = new Customer[]{freshCustomer, uniqueCustomer, expensiveFruitCustomer};
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

    public static BigDecimal findMaxPrice(Cargo cargo) {
        BigDecimal maxPrice = BigDecimal.ZERO;
        for (int i = 0; i < cargo.getFruits().size(); i++) {
            if (cargo.getFruits().get(i).getPrice().compareTo(maxPrice) > 0) {
                maxPrice = cargo.getFruits().get(i).getPrice();
            }
        }
        return maxPrice;
    }
}
