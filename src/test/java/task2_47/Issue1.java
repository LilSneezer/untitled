package task2_47;

public class Issue1 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        for (int i = m; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
        }
    }
}
