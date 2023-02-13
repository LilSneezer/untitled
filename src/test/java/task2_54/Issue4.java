package task2_54;

public class Issue4 {
    public static void main(String[] args) {
        String[] str = args[0].split("");
        StringBuilder stringBuilder = new StringBuilder();
        String reg = "\\d";

        for (String ch: str) {
            if (ch.matches(reg)) {
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder);
    }
}
