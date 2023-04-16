package task3_10;

public class Fire extends NatureElement {

    Fire() {
        this.name = "Fire";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName.getName().equals("Air")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Energy().toString());
            return new Energy();
        }
        if (otherElemName.getName().equals("Earth")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Lava().toString());
            return new Lava();
        }
        if (otherElemName.getName().equals("Fire")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " не производит новый элемент");
            return null;
        }
        if (otherElemName.getName().equals("Water")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Steam().toString());
            return new Steam();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
