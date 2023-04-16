package task3_10;

public class Water extends NatureElement {

    Water() {
        this.name = "Water";
    }

    @Override
    public NatureElement connect(NatureElement otherElemName) {
        if (otherElemName.getName().equals("Air")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Rain().toString());
            return new Rain();
        }
        if (otherElemName.getName().equals("Earth")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Mud().toString());
            return new Mud();
        }
        if (otherElemName.getName().equals("Fire")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Steam().toString());
            return new Steam();
        }
        if (otherElemName.getName().equals("Water")) {
            System.out.println(this.name + " + " + otherElemName.getName() + " = " + new Sea().toString());
            return new Sea();
        }
        System.out.println("Нет нового элемента");
        return null;
    }
}
