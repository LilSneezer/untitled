package task3_10;

public class Fire extends NatureElement {

    Fire() {
        this.name = "Fire";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            Energy energy = new Energy();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + energy);
            return energy;
        }
        if (otherElemName instanceof Earth) {
            Lava lava = new Lava();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + lava);
            return lava;
        }
        if (otherElemName instanceof Fire) {
            System.out.println(this.name + " + " + otherElemName.getName() + " не производит новый элемент");
            return null;
        }
        if (otherElemName instanceof Water) {
            Steam steam = new Steam();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + steam);
            return steam;
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
