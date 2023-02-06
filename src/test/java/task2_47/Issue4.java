package task2_47;

import java.util.Random;

public class Issue4 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i < n; i++) {
            int randInt = nextInt(i);
            if (randInt < 2)
                System.out.printf("Число %s не может быть простым, т.к. минимальное просто число 2 \n", randInt);
            else
            if (isPrime(randInt)) {
                System.out.printf("%s простое число \n", randInt);
                break;
            }
        }
    }

    public static int nextInt(int x) {
        Random random = new Random();
        return random.nextInt(x);
    }

    public static boolean isPrime(int randInt) {
        int mod;
        int i = 2;
        while (i >= 2 && i <= randInt / 2) {
            mod = randInt % i;
            if (mod == 0)
                return false;
            else
                i++;
        }
        return true;
    }
}
