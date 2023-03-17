package task2_47;

public class Issue5 {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        String mathSign = args[1];
        int number2 = Integer.parseInt(args[2]);

        switch (mathSign) {
            case "+":
                System.out.println(Calculator.add(number1, number2));
                break;
            case "-":
                System.out.println(Calculator.sub(number1, number2));
                break;
            case "*":
                System.out.println(Calculator.mult(number1, number2));
                break;
            case "/":
                System.out.println(Calculator.divide(number1, number2));
                break;
            default:
                System.out.println("Список поддерживаемых операций: +, -, *, /");
                break;
        }
    }
}
