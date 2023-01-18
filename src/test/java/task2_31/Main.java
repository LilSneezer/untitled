package task2_31;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int a = 4;
        int b = 5;
        int temp;
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

//      Задание 3
        boolean bool = Integer.parseInt(args[0]) % Integer.parseInt(args[1]) == 0;
        System.out.println("Числа делятся нацело - " + bool);

        //Задание 4
        int p = Integer.parseInt(args[2]);
        float r = Integer.parseInt(args[3]);
        int t = Integer.parseInt(args[4]);
        double sum = p * Math.exp(r * t);
        System.out.printf("Через %s лет вы получите %s рублей \n", t, sum);
    }

}
