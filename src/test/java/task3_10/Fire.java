package task3_10;

public class Fire extends NatureElement {

    Fire() {
        this.name = "Fire";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Energy());
            return new Energy();
        }
        if (otherElemName instanceof Earth) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Lava());
            return new Lava();
        }
        if (otherElemName instanceof Fire) {
            System.out.println(this.name + " + " + otherElemName.getName() + " не производит новый элемент");
            return null;
        }
        if (otherElemName instanceof Water) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Steam());
            return new Steam();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
