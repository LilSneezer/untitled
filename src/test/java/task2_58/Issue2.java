package task2_58;


public class Issue2 {
    public static void main(String[] args) {
        String reg = "[a-z0-9]+";
        if (args.length == 0) {
            System.out.println("Аргументы не переданы");
        } else {
            String maxStr = args[0];
            for (int i = 1; i < args.length; i++) {
                if (args[i].matches(reg)) {
                    if (args[i].length() > maxStr.split(" ")[0].length()) {
                        maxStr = args[i];
                    } else if (args[i].length() == maxStr.split(" ")[0].length()) {
                        maxStr = maxStr + " " + args[i];
                    }
                }
            }
            System.out.println(maxStr);
        }
    }
}
