package task2_58;


public class Issue2 {
    public static void main(String[] args) {
        String reg = "[a-z0-9]+";
        String maxStr = "";
        int nextIndex = 0;
        int j;

        if (args.length == 0) {
            System.out.println("Аргументы не переданы");
        }

        for (j = 0; j < args.length; j++) {
            if (args[j].matches(reg) && args[j].equals(args[j].toLowerCase())) {
                maxStr = args[j];
                nextIndex = j + 1;
                break;
            }
        }

        for (int i = nextIndex; i < args.length; i++) {
            if (args[i].matches(reg) && args[i].equals(args[i].toLowerCase())) {
                if (args[i].length() > maxStr.split(" ")[0].length()) {
                    maxStr = args[i];
                } else if (args[i].length() == maxStr.split(" ")[0].length()) {
                    maxStr = maxStr + " " + args[i];
                }
            }
        }

        if (maxStr.length() == 0) {
            System.out.println("Переданы невалидные слова");
        }
            System.out.println(maxStr);
    }
}

