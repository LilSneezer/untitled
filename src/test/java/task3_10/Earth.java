package task3_10;

public class Earth extends NatureElement {

    Earth() {
        this.name = "Earth";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName.getName().equals("Air")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Dust().toString());
            return new Dust();
        }
        if (otherElemName.getName().equals("Earth")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Pressure().toString());
            return new Pressure();
        }
        if (otherElemName.getName().equals("Fire")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Lava().toString());
            return new Lava();
        }
        if (otherElemName.getName().equals("Water")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Mud().toString());
            return new Mud();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
