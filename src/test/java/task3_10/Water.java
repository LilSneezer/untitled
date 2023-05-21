package task3_10;

public class Water extends NatureElement {

    Water() {
        this.name = "Water";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            Rain rain = new Rain();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + rain);
            return rain;
        }
        if (otherElemName instanceof Earth) {
            Mud mud = new Mud();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + mud);
            return mud;
        }
        if (otherElemName instanceof Fire) {
            Steam steam = new Steam();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + steam);
            return steam;
        }
        if (otherElemName instanceof Water) {
            Sea sea = new Sea();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + sea);
            return sea;
        }
        if (otherElemName instanceof Energy) {
            Steam steam = new Steam();
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + steam);
            return steam;
        }
        System.out.println("Нет нового элемента");
        throw new UnsupportedOperationException();
    }
}
