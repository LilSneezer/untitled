package task4_4;

import java.util.ArrayList;

public class MathOperation {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < args.length; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }

        if (numbers.size() == 0) {
            System.out.println("Не переданы числа для операции.");
        }

        String operationName = checkOperationName(args);
        Function operationObject = createOperationObject(operationName);

        if (operationObject != null) {
            System.out.println(numbers);
            System.out.println(applyFunction(numbers, operationObject));
        }
    }

    static ArrayList<Integer> applyFunction(ArrayList<Integer> numbs, Function func) {
        ArrayList<Integer> functionResult = new ArrayList<>();
        for (int el: numbs) {
            functionResult.add(func.evaluate(el));
        }
        return functionResult;
    }

    static String checkOperationName(String[] args) {
        if (args.length == 0 || args[0].matches("[0-9]")) {
            System.out.println("Не передано название операции.");
            System.exit(1);
        }
        if (!(args[0].equals("Half") || args[0].equals("Double")
                || args[0].equals("Exact") || args[0].equals("Square"))) {
            System.out.printf("Операция %s не поддерживается.", args[0]);
            System.exit(1);
        }
        return args[0];
    }

    static Function createOperationObject(String operationName) {
        if (operationName.equals("Half")) {
            return new Half();
        }
        if (operationName.equals("Double")) {
            return new Double();
        }
        if (operationName.equals("Exact")) {
            return new Exact();
        }
        if (operationName.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
