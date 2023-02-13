package task2_54;


public class Issue3 {
    public static void main(String[] args) {
        String[] str = args[0].split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String ch: str) {
            switch (ch) {
                case "0":
                    stringBuilder.append(1);
                    break;
                case "1":
                    stringBuilder.append(0);
                    break;
                default:
                    stringBuilder.append(ch);
                    break;
            }
        }
        System.out.println(stringBuilder);
    }
}
