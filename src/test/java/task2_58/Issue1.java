package task2_58;

public class Issue1 {
    public static void main(String[] args) {
        int[] a = new int[20];
        fillArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

   static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (-10 - 9)) + 9;
        }
   }
}
