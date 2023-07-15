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
            System.exit(1);
        }

        Function operationObject = null;

        try {
            String operationName = checkOperationName(args[0]);
            operationObject = createOperationObject(operationName);
        } catch (Exception ex) {
            System.exit(1);
        }

        if (operationObject != null) {
            System.out.println("operation" + operationObject);
            System.out.println(numbers);
            System.out.println(applyFunction(numbers, operationObject));
        }
    }

    public static ArrayList<Integer> applyFunction(ArrayList<Integer> numbs, Function func) {
        ArrayList<Integer> functionResult = new ArrayList<>();
        for (int el: numbs) {
            functionResult.add(func.evaluate(el));
        }
        return functionResult;
    }

    public static String checkOperationName(String operation) throws RuntimeException {
        if (operation.equals("") || operation.matches("[0-9]")) {
            System.out.println("Не передано название операции.");
            throw new RuntimeException("Не передано название операции.");
        }
        if (!(operation.equals("Half") || operation.equals("Double")
                || operation.equals("Exact") || operation.equals("Square") || operation.equals("Wave") || operation.equals("SquareEven"))) {
            System.out.printf("Операция %s не поддерживается.", operation);
            throw new RuntimeException("Операция %s не поддерживается.");
        }
        return operation;
    }

    public static Function createOperationObject(String operationName) {
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
        if (operationName.equals("Wave")) {
            return new Function() {
                int temp = 0;
                @Override
                public int evaluate(int p) {
                    int sum = p + temp;
                    temp = p;
                    return sum;
                }
            };
        }
        if (operationName.equals("SquareEven")) {
            return (p) -> {
                if (p % 2 == 0) {
                    return p*p;
                }
                return p;
            };
        }
        return null;
    }
}
