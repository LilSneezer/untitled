package task2_47;

public class Timer {
    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public static void waitSecond() {
        for (int i = 1; i != 0; i--) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
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
