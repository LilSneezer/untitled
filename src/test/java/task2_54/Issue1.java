package task2_54;

public class Issue1 {
    public static String str = "Циклом называется многократное выполнение одних и тех же действий.";
    public static int subStrLength;
    public static void main(String[] args) {
        System.out.println(getSubStrLength(args[0]));
    }

    public static int getSubStrLength(String latter) {
        subStrLength = str.substring(0, str.indexOf(latter)).replaceAll("\\s", "").length();
        return subStrLength;
    }
}
