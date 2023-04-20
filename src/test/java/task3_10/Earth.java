package task3_10;

public class Earth extends NatureElement {

    Earth() {
        this.name = "Earth";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Dust());
            return new Dust();
        }
        if (otherElemName instanceof Earth) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Pressure());
            return new Pressure();
        }
        if (otherElemName instanceof Fire) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Lava());
            return new Lava();
        }
        if (otherElemName instanceof Water) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Mud());
            return new Mud();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
