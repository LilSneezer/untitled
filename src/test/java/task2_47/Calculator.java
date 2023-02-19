package task2_47;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int sub(int x, int y) {
        return x - y;
    }
    public static int mult(int x, int y) {
        return x * y;

    }
    public static int divide(int x, int y) {
        if (y == 0)
            System.out.println("Операция не может быть выполнена");
        return x / y;
    }
}
