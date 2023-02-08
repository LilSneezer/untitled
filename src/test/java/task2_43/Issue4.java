package task2_43;

public class Issue4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Impossible");
        } else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Impossible");
        } else if (c*c == a*a + b*b || a*a == c*c + b*b || b*b == a*a + c*c) {
            System.out.println("right");
        } else if (c*c > a*a + b*b || a*a > c*c + b*b || b*b > a*a + c*c) {
            System.out.println("obtuse");
        } else if (c*c < a*a + b*b || a*a < c*c + b*b || b*b < a*a + c*c) {
            System.out.println("acute");
        }
    }
}
