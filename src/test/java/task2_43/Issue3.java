package task2_43;

public class Issue3 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        String leapYear = year > 0 && year <= 30000 ? checkLeapYear(year) : "Введено некорректное значение";
        System.out.println(leapYear);
    }

    public static String checkLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
