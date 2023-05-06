package task3_10;


public class Air extends NatureElement {

    Air() {
        this.name = "Air";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            Pressure pressure = new Pressure();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + pressure);
            return pressure;
        }
        if (otherElemName instanceof Earth) {
            Dust dust = new Dust();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + dust);
            return dust;
        }
        if (otherElemName instanceof Fire) {
            Energy energy = new Energy();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + energy);
            return energy;
        }
        if (otherElemName instanceof Water) {
            Rain rain = new Rain();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + rain);
            return rain;
        }
        System.out.println("Нет нового элемента");
        throw new UnsupportedOperationException();
    }
}
