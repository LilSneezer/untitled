package task3_10;


public class Air extends NatureElement {

    Air() {
        this.name = "Air";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName.getName().equals("Air")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Pressure().toString());
            return new Pressure();
        }
        if (otherElemName.getName().equals("Earth")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Dust().toString());
            return new Dust();
        }
        if (otherElemName.getName().equals("Fire")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Energy().toString());
            return new Energy();
        }
        if (otherElemName.getName().equals("Water")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Rain().toString());
            return new Rain();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
