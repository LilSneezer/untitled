package task3_10;

public class Water extends NatureElement {

    Water() {
        this.name = "Water";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName instanceof Air) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Rain());
            return new Rain();
        }
        if (otherElemName instanceof Earth) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Mud());
            return new Mud();
        }
        if (otherElemName instanceof Fire) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Steam());
            return new Steam();
        }
        if (otherElemName instanceof Water) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Sea());
            return new Sea();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
