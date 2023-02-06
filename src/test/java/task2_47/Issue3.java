package task2_47;

public class Issue3 {
    public static void main(String[] args) {
        int maxNumber = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        String snake = maxNumber > 0 && col >= 1 ? snakePrint(maxNumber, col) : "Введите корректные данные";
        System.out.println(snake);
    }

    public static String snakePrint(int maxNumber, int col) {
        int countPerLine = 0; //кол-во чисел в строке
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i + " ");
            countPerLine++;
            if (countPerLine == col) {
                System.out.print("\n");
                countPerLine = 0;
            }
        }
        return "";
    }
}
