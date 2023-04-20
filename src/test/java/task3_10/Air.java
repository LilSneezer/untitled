package task3_10;


public class Air extends NatureElement {

    Air() {
        this.name = "Air";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Pressure());
            return new Pressure();
        }
        if (otherElemName instanceof Earth) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Dust());
            return new Dust();
        }
        if (otherElemName instanceof Fire) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Energy());
            return new Energy();
        }
        if (otherElemName instanceof Water) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Rain());
            return new Rain();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
