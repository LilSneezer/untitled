package task2_54;


public class Issue3 {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            switch (String.valueOf(str.charAt(i))) {
                case "0":
                    stringBuilder.append(1);
                    break;
                case "1":
                    stringBuilder.append(0);
                    break;
                default:
                    stringBuilder.append(str.charAt(i));
                    break;
            }
        }
        System.out.println(stringBuilder);
    }
}
