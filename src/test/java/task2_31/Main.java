package task2_31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int a = 4;
        int b = 5;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("a = %s \n" + "b = %s \n", a, b);

        //Задание 2
        int a2 = 4;
        int b2 = 5;
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.printf("a = %s \n" + "b = %s \n", a2, b2);

//        //Задание 3
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println("Числа делятся нацело - " + DivisionNumbers.divideNumbers(first, second));

        //Задание 4
        System.out.println("Введите два числа для расчета суммы");
        Scanner scanner1 = new Scanner(System.in);
        int p = scanner1.nextInt();
        float r = scanner1.nextFloat();
        int t = scanner1.nextInt();
        System.out.printf("Через %s лет вы получите %s рублей", t, CountSum.countSum(p, r, t));
    }

}
