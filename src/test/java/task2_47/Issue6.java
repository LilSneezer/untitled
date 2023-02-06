package task2_47;


public class Issue6 {
    public static void main(String[] args) {
        Timer timer = new Timer(3600);
        if (timer.getSeconds() >= 0)
            System.out.println(timer.start());
        else
            System.out.println("Введеное некорректное значение секунд");

    }
}
