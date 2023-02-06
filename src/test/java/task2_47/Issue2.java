package task2_47;

public class Issue2 {
    public static void main(String[] args) {
        int machineCount = Integer.parseInt(args[0]); //кол-во сенокосилок
        int firstMachineWorkTime = Integer.parseInt(args[1]) * 60; //время работы первой сенокосилки в минутах
        int totalMachineWorkTime = firstMachineWorkTime; //общее время работы сенокосилок, когда известно только время первой косилки
        if (machineCount > 0 && firstMachineWorkTime > 0) {
            while (machineCount != 1) {
                firstMachineWorkTime += 10;
                totalMachineWorkTime += firstMachineWorkTime;
                machineCount--;
            }
            System.out.printf("Бригада работала %s час(-а/-ов) %s минут \n", totalMachineWorkTime / 60, totalMachineWorkTime % 60);
        } else
            System.out.println("Введите корректные значения \n");
    }
}
