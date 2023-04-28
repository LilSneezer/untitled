package task3_10;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Alchemy {
    public static void main(String[] args) {
        ArrayList<NatureElement> natureElements = new ArrayList<>();
        try {
            for (String el : args) {
                NatureElement baseElem = NatureElement.create(el);
                natureElements.add(baseElem);
            }
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }

        for (int i = 0; i < natureElements.size(); i+= 2) {
            try {
                if (i == natureElements.size() - 1) {
                    System.out.printf("Для %s с индексом %s нет пары", natureElements.get(i), i);
                } else {
                    natureElements.get(i).connect(natureElements.get(i+1));
                }
            } catch (UnsupportedOperationException ex) {
                System.out.printf("Объект %s не подошел под условия", natureElements.get(i));
            }
        }
    }
}
