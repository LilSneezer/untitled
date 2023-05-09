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

        String operationName = checkOperationName(args);
        Function operationObject = createOperationObject(operationName);

        if (operationName.equals("Wave")) {
            NewOperation wave = new NewOperation() {
                ArrayList<Integer> sum = new ArrayList<>();
                @Override
                public ArrayList<Integer> wave(ArrayList<Integer> n) {
                    sum.add(n.get(0));
                    for (int i = 1; i < n.size(); i++) {
                        sum.add(n.get(i-1) + n.get(i));
                    }
                    return sum;
                }
            };
            System.out.println(numbers);
            System.out.println(wave.wave(numbers));
        }

        if (operationName.equals("SquareEven")) {
            ArrayList<Integer> squaredArr = new ArrayList<>();
            SquareEven squareEven = (numbArr) -> {
                for (int num: numbArr) {
                    if (num % 2 == 0) {
                        squaredArr.add(num*num);
                    } else {
                        squaredArr.add(num);
                    }
                }
                return squaredArr;
            };
            System.out.println(numbers);
            System.out.println(squareEven.squareEven(numbers));
        }


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
                || args[0].equals("Exact") || args[0].equals("Square") || args[0].equals("Wave") || args[0].equals("SquareEven"))) {
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
