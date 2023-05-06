package task3_10;

public class Energy extends NatureElement {

    Energy() {
        this.name = "Energy";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Water) {
            Steam steam = new Steam();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + steam);
            return steam;
        }
        System.out.println("Нет нового элемента");
        throw new UnsupportedOperationException();
    }
}
