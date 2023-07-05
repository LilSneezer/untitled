package task2_54;

public class Issue4 {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder stringBuilder = new StringBuilder();
        String reg = "\\d";

        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (ch.matches(reg)) {
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder);
    }
}
