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
        String strOfNumbers = "";
        for (int i = 1; i <= maxNumber; i++) {              //в этом блоке (до 23 строки)
            strOfNumbers = strOfNumbers + i + " ";          //заполняю строку числами по порядку
            countPerLine++;                                 //и вывожу последовательно, учитывая кол-во элементов в строке
            if (countPerLine == col) {
                strOfNumbers = strOfNumbers + "\n";
                countPerLine = 0;
            }
        }
        String[] arr = strOfNumbers.split("\n");        //разбиваю целую строку на массив строк (рядов)
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 1) {                                 //далее проверяю, если номер строк нечетный,
                String[] numbersInRowArr = arr[i].split(" ");  //то разбиваю строку на отдельные элементы и
                String reverseStr = "";
                for (int j = numbersInRowArr.length-1; j >= 0; j--) {  //иду по элементам строки в обратном порядке и
                    reverseStr = reverseStr + numbersInRowArr[j] + " "; //записываю их в строку
                }
                arr[i] = reverseStr;  //меняю начальную строку в массиве строк (рядов) на перевернутую
            }
        }
        for (String row: arr) {
            System.out.println(row.trim());
        }
        return "";
    }
}
