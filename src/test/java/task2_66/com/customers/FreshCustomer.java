package task2_66.com.customers;


import task2_66.com.fruitbase.Delivery;

public class FreshCustomer extends Customer {

    public FreshCustomer(String name) {
        super(name);
    }

    public void takeFruits(Delivery cargo) {
        for (int i = 0; i < cargo.getFruits().size(); i++) {
            if (cargo.getFruits().get(i).isFresh()) {
                purchases.add(cargo.getFruits().get(i));
            }
        }

        actualizeCargo(purchases, cargo);
    }
}
