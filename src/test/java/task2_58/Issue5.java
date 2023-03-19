package task2_58;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Issue5 {
    public static void main(String[] args) {
        int rowsCount = generateRowsCount();             //генерим кол-во строк
        int[][] arr = fillArray(rowsCount);              //заполняем массив

        System.out.println("Raw array:");
        for (int[] elem: arr) {
            System.out.println(Arrays.toString(elem));
        }

        int[][] sortedArr = sortArray(arr);
        System.out.println("Sort array:");
        for (int[] elem: sortedArr) {
            System.out.println(Arrays.toString(elem));
        }
    }

    public static int generateRowsCount() {
        return (int) (Math.random() * (6 - 1)) + 1;
    }

    public static int generateColumnCount() {
        return (int) (Math.random() * (8 - 1)) + 1;
    }

    public static int[][] fillArray(int rows) {                         //заполняем массив и для каждой строки
        int[][] arr = new int[rows][];                                  //генерим кол-во элементов
        for (int i = 0; i < rows; i++) {
            int columnCount = generateColumnCount();
            arr[i] = new int[columnCount];
            for (int j = 0; j < columnCount; j++) {
                arr[i][j] = (int) (Math.random() * (-10 - 9)) + 9;
            }
        }
        return arr;
    }

    public static int[][] sortArray(int[][] arr) {
        int[] forChange;
        int sum;
        int nextSum;
        int i;
        for (int k = 0; k < arr.length; k++) {
            i = 0;
            while (i < arr.length - 1) {
                sum = IntStream.of(arr[i]).sum();
                nextSum = IntStream.of(arr[i + 1]).sum();
                if (sum < nextSum) {
                    forChange = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = forChange;
                }
                i++;
            }
        }
        return arr;
    }
}
