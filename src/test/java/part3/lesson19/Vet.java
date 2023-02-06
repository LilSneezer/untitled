package part3.lesson19;

public class Vet {
    private String name;

    public void treatAnimal(Animal animal) {
        if (animal.getHealth().equals("UNHEALTHY")) {
            animal.setHealth(HealthState.HEALTHY);
            System.out.println("Животное вылечено");
        } else {
            System.out.println("Животное здорово");
        }
    }
}
