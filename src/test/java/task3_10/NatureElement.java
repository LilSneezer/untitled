package task3_10;


import java.util.NoSuchElementException;

public class NatureElement {
    protected String name;

    public String getName() {
        return this.name;
    }

    public NatureElement connect(NatureElement otherNatureElement) {
        throw new UnsupportedOperationException();
    }

    public static NatureElement create(String baseElemName) {
        switch (baseElemName) {
            case "Fire":
                return new Fire();
            case "Air":
                return new Air();
            case "Earth":
                return new Earth();
            case "Water":
                return new Water();
            case "Energy":
                return new Energy();
            default:
                throw new NoSuchElementException("Неизвестный элемент");
        }
    }

    public String toString() {
        return name;
    }
}
