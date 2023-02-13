package task2_47;


import java.util.Date;


public class Timer {
    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public static void waitSecond() {

        long startTime = new Date().getTime();
        while (new Date().getTime() - startTime < 1000L){}
    }

    public String printTime() {
        int minutes = seconds / 60;
        int sec = seconds % 60;
        return minutes / 10 + "" + minutes % 10 + ":" + sec / 10 + "" + sec % 10;
    }

    public String start() {
        String s;
        while (seconds > 0) {
            s = printTime();
            System.out.println(s);
            waitSecond();
            seconds--;
        }
        return "00:00";
    }
}
