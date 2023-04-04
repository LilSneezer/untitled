package task3_10;

public class Air extends NatureElement {

    @Override
    public void connect(NatureElement otherElemName) {
        NatureElement currentElement = create("Air");
        if (currentElement != null && otherElemName.getName() == "Air") {
            System.out.println("Pressure");
        }
    }
}
