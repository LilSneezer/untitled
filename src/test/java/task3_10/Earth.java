package task3_10;

public class Earth extends NatureElement {

    Earth() {
        this.name = "Earth";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            Dust dust = new Dust();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + dust);
            return new Dust();
        }
        if (otherElemName instanceof Earth) {
            Pressure pressure = new Pressure();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + pressure);
            return pressure;
        }
        if (otherElemName instanceof Fire) {
            Lava lava = new Lava();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + lava);
            return lava;
        }
        if (otherElemName instanceof Water) {
            Mud mud = new Mud();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + mud);
            return mud;
        }
        System.out.println("Нет нового элемента");
        throw new UnsupportedOperationException();
    }
}
