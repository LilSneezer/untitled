package task3_10;


public class NatureElement {
    private String name;

    public String getName() {
        return name;
    }

    public void connect(NatureElement natureElement) {
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
}
