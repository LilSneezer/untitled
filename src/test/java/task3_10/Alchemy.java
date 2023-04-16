package task3_10;

import java.util.ArrayList;

public class Alchemy {
    public static void main(String[] args) {
        ArrayList<NatureElement> natureElements = new ArrayList<>();
        for (String el: args) {
            NatureElement baseElem = NatureElement.create(el);
            if (baseElem != null) {
                natureElements.add(baseElem);
            } else {
                System.exit(0);
            }
        }

        for (int i = 0; i < natureElements.size(); i+= 2) {
            if (i == natureElements.size() - 1) {
                System.out.printf("Для %s с индексом %s нет пары", natureElements.get(i), i);
            } else {
                natureElements.get(i).connect(natureElements.get(i+1));
            }
        }
    }
}
