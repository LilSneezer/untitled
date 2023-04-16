package task3_10;


public class NatureElement {
    protected String name;

    public String getName() {
        return this.name;
    }

    public NatureElement connect(NatureElement otherNatureElement) {
        return null;
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
            default:
                System.out.println("Неизвестный элемент");
                return null;
        }
    }

    public String toString() {
        return name;
    }
}