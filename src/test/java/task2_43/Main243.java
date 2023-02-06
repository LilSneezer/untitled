package task2_43;

public class Main243 {
    public static void main(String[] args) {
        //Задание 1
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a > b && a > c) {
            System.out.println("Максимальное число " + a);
        } else if (b > a && b > c) {
            System.out.println("Максимальное число " + b);
        } else {
            System.out.println("Максимальное число " + c);
        }

        System.out.println("--------------------------------------------------------");

        //Заданиие 2
        int dayOfWeek = Integer.parseInt(args[3]);
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Введен некорретный день недели");
        }

        System.out.println("--------------------------------------------------------");

        //Задание 3
        int year = Integer.parseInt(args[4]);
        String leapYear = year > 0 && year <= 30000 ? checkLeapYear(year) : "Введено некорректное значение";
        System.out.println(leapYear);

        System.out.println("--------------------------------------------------------");

        //Задание 4
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Impossible");
        } else
        if (c*c == a*a + b*b) {
            System.out.println("right");
        } else if (c*c > a*a + b*b) {
            System.out.println("obtuse");
        } else if (c*c < a*a + b*b) {
            System.out.println("acute");
        }

        System.out.println("--------------------------------------------------------");

        //Задание 5
        int itemPriceRub = Integer.parseInt(args[5]);
        int itemPriceKop = Integer.parseInt(args[6]);
        int payRub = Integer.parseInt(args[7]);
        int payKop = Integer.parseInt(args[8]);
        String exchange = itemPriceRub >= 0 && itemPriceKop >= 0 && payRub >= 0 && payKop >= 0 ?
                getExchange(itemPriceRub, itemPriceKop, payRub, payKop) : "Числа должны быть больше 0";
        System.out.println(exchange);
    }

    public static String checkLeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static String getExchange(int itemPriceRub, int itemPriceKop, int payRub, int payKop) {
        int exchangeRub;
        int exchangeKop;
        if (itemPriceRub <= payRub && itemPriceKop <= payKop) {
            exchangeRub = payRub - itemPriceRub;
            exchangeKop = payKop - itemPriceKop;
            return "Сдача: " + exchangeRub + " руб. " + exchangeKop + " коп.";
        }
        if (itemPriceKop > payKop) {
            exchangeRub = payRub - itemPriceRub;
            exchangeKop = payKop + 100 - itemPriceKop;
            exchangeRub = exchangeRub - 1;
            return "Сдача: " + exchangeRub + " руб. " + exchangeKop + " коп.";
        }
        return "Недостаточно средств";
    }
}
