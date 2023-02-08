package task2_43;

public class Issue5 {
    public static void main(String[] args) {
        int itemPriceRub = Integer.parseInt(args[0]);
        int itemPriceKop = Integer.parseInt(args[1]);
        int payRub = Integer.parseInt(args[2]);
        int payKop = Integer.parseInt(args[3]);
        String exchange = itemPriceRub >= 0 && itemPriceKop >= 0 && payRub >= 0 && payKop >= 0 ?
                getExchange(itemPriceRub, itemPriceKop, payRub, payKop) : "Числа должны быть больше 0";
        System.out.println(exchange);
    }


    public static String getExchange(int itemPriceRub, int itemPriceKop, int payRub, int payKop) {
        int exchangeRub;
        int exchangeKop;
        if (itemPriceRub <= payRub && itemPriceKop <= payKop) {
            exchangeRub = payRub - itemPriceRub;
            exchangeKop = payKop - itemPriceKop;
            return "Сдача: " + exchangeRub + " руб. " + exchangeKop + " коп.";
        }
        if (itemPriceRub < payRub & itemPriceKop > payKop) {
            exchangeRub = payRub - itemPriceRub;
            exchangeKop = payKop + 100 - itemPriceKop;
            exchangeRub = exchangeRub - 1;
            return "Сдача: " + exchangeRub + " руб. " + exchangeKop + " коп.";
        }
        return "Недостаточно средств";
    }
}
