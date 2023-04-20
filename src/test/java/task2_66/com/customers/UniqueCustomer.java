package task2_66.com.customers;


import task2_66.com.fruitbase.Delivery;

public class UniqueCustomer extends Customer {

    public UniqueCustomer(String name) {
        super(name);
    }

    public void takeFruits(Delivery cargo) {
        int i = 0;
        while (i < cargo.getFruits().size()) {
            if (!purchases.contains(cargo.getFruits().get(i))) {
                purchases.add(cargo.getFruits().get(i));
            }
            i++;
        }

        actualizeCargo(purchases, cargo);
    }
}
