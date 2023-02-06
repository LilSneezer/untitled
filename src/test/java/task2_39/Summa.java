package task2_39;

public class Summa {
    private int a;
    private int b;
    private int c;
    private double x;
    private double y;
    private double z;

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public double sum(double x, double y, double z) {
        return x + y + z;
    }

    public double sum(int a, double y, double z) {
        return a + y + z;
    }

//    public double sum(int a, int b) {  //будет ошибка компиляции, т.к. возвращаемый тип метода не является условием перегрузки
//        return a + b;
//    }

    public double sum(Integer i, Integer j) { //тут ок, т.к. тип параметров метода отличается
        return i + j;
    }
}
