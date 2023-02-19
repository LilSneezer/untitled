package task2_58;

public class Issue5 {
    public static void main(String[] args) {

        int rowsCount = (int) (Math.random() * (6 - 1)) + 1; //генерим кол-во строк
        int[][] arr;

        for (int i = 0; i < rowsCount; i++) {
            int columnCount = (int) (Math.random() * (8 - 1)) + 1; //для каждой строки генерим кол-во столбцов
            arr = new int[rowsCount][columnCount]; //инициализируем массив
            System.out.println();
            for (int j = 0; j < columnCount; j++) { //в цикле заполняем массив рандомными числами
                arr[i][j] = (int) (Math.random() * (-10 - 9)) + 9;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" || columnCount: " + columnCount); //вывод кол-ва столбцов каждой строки для удобства
        }
        System.out.println("\n" + "rowsCount: " + rowsCount); //вывод кол-ва строк для удобства
    }
}
