package task2_47;


public class Issue4 {
    public static void main(String[] args) {
        int n = 50;
        int random;
        do {
            random = nextInt(n);
            System.out.println("Поиск простого числа: " + random);
        } while (!isPrime(random));
        System.out.println("Простое число найдено " + random);
    }

    public static int nextInt(int x) {
        return 2 + (int) (Math.random() * x);
    }

    public static boolean isPrime(int random) {
        int mod;
        int i = 2;
        while (i >= 2 && i <= random / 2) {
            mod = random % i;
            if (mod == 0)
                return false;
            else
                i++;
        }
        return true;
    }
}
