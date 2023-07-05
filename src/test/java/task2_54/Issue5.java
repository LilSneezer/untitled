package task2_54;

public class Issue5 {
    static String reg = "[\\d]+";
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(isInteger(str) ? "Строка является целым числом" : "Строка не является целым числом");
    }

    static boolean isInteger(String str) {
        return str.matches(reg);
    }
}
