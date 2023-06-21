package task2_66.com.fruitbase;


import task2_66.com.customers.Customer;
import task2_66.com.customers.FreshCustomer;
import task2_66.com.customers.UniqueCustomer;
import task2_66.com.fruitbase.fruits.Apple;
import task2_66.com.fruitbase.fruits.Orange;
import task2_66.com.fruitbase.vegetables.Cucumber;
import task2_66.com.interfaces.Fruit;
import task2_66.com.interfaces.Plant;
import task2_66.com.interfaces.Vegetable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        Delivery cargo = fruitBase.takeOrder(args);
        Customer expensiveFruitCustomer = new Customer("Дорогие Фрукты") {
            final BigDecimal maxPrice = findMaxPrice(cargo);
            final BigDecimal percentOfMaxPrice = maxPrice.multiply(new BigDecimal(75)).divide(new BigDecimal(100), RoundingMode.CEILING);

            @Override
            public void takeFruits(Delivery cargo) {

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
        for (Customer customer : customers) {
            customer.takeFruits(cargo);
            System.out.printf("Покупатель %s выбрал из груза: ", customer.getName());
            customer.printPurchases();
            System.out.println(cargo.toString());
        }

        ////////////// task 7.6.1 ////////////////
        Apple apple = new Apple(30.0, new BigDecimal("500"), "Голден");
        Apple apple = new Apple(30.0, new BigDecimal("500"), "Apple");
        Orange orange = new Orange(30.0, new BigDecimal("550"), "Orange");
        Cucumber cucumber = new Cucumber("Огурец");
        System.out.println("cucumber name: " + cucumber.getName());
        System.out.println("apple name: " + apple.getName());
        Basket<Fruit> fruitBasket = new Basket<>();
        Basket<Vegetable> vegetableBasket = new Basket<>();
        fruitBasket.addItem(apple);
        vegetableBasket.addItem(cucumber);

        //////////// task 7.6.2 ///////////////
        BasketWithHashMap basketWithHashMap = new BasketWithHashMap();
        basketWithHashMap.addItem(apple.getName());
        basketWithHashMap.addItem(cucumber.getName());
        System.out.println("Вызов makeSalad");
        makeSalad(basketWithHashMap);

        /////////// task 7.6.3 ////////////////
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(apple);
        plants.add(cucumber);
        HashMap<String, Plant> plantsMap = new HashMap<>();
        for (Plant plant: plants) {
            plantsMap.put(plant.getName(), plant);
        }
        System.out.println("Задание 3");
        for (Map.Entry<String, Plant> entry: plantsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getClass().getSimpleName());
        }
        BasketWithHashMap<Fruit> fruitBasketWithHashMap = new BasketWithHashMap<>();
        BasketWithHashMap<Vegetable> vegetableBasketWithHashMap = new BasketWithHashMap<>();
        fruitBasketWithHashMap.addItem(apple);
        fruitBasketWithHashMap.addItem(orange);
        vegetableBasketWithHashMap.addItem(cucumber);
        makeSalad(fruitBasketWithHashMap);
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

    public static BigDecimal findMaxPrice(Delivery cargo) {
        BigDecimal maxPrice = BigDecimal.ZERO;
        for (int i = 0; i < cargo.getFruits().size(); i++) {
            if (cargo.getFruits().get(i).getPrice().compareTo(maxPrice) > 0) {
                maxPrice = cargo.getFruits().get(i).getPrice();
            }
        }
        return maxPrice;
    }

    public static void makeSalad(BasketWithHashMap basketWithHashMap) {
        System.out.printf("```Готовим салатик:\n" +
                " Режем - %s \n" +
                " Угощайся!```\n", basketWithHashMap.iterator());
      
    public static <T extends Plant> void makeSalad(BasketWithHashMap<T> basketWithHashMap) {
        StringBuilder plants = new StringBuilder();
        for (T key: basketWithHashMap) {
            plants.append(key.getName()).append(" ");
        }
        System.out.printf("```Готовим салатик: \n" +
                        "Режем - %s\n" +
                        "Угощайся!```", plants);
    }
}
