package task2_54;

public class Issue1 {
    public static String str = "Циклом называется многократное выполнение одних и тех же действий.";
    public static int subStrLength;
    public static void main(String[] args) {
        subStrLength = str.substring(0, str.indexOf(args[0])).replaceAll("\\s", "").length();
        System.out.println(subStrLength);
    }
}
