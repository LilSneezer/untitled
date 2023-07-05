package task2_54;

public class Issue6 {
    static String reg = "^?[-\\d]+";
    public static void main(String[] args) {
        String str = args[0];
        if (toInt(str) == 0) {
            System.out.println("Ошибочка вышла");
        } else {
            System.out.printf("%s * 2 = %s", toInt(str), toInt(str) * 2);
        }
    }

    static int toInt(String str) {
        if (str.length() > String.valueOf(Integer.MAX_VALUE).length() & !str.startsWith("-"))
            return 0;
        if (str.length() > String.valueOf(Integer.MIN_VALUE).length() & str.startsWith("-"))
            return 0;
        return str.matches(reg) ? new Integer(str) : 0;
    }
}
