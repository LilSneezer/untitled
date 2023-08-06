package task2_54;


public class Issue2 {
    public static void main(String[] args) {
        String filePath = args[0];
        System.out.println("Путь из аргументов командной строки: " + filePath);
        System.out.println(checkIncorrectPath(filePath));
    }

    public static String checkIncorrectPath(String filePath) {
        if (filePath.endsWith("/")
                || filePath.endsWith("\\")
                || filePath.substring(0, filePath.length() - 1).endsWith("\\")) {
            return "Введен некорректный путь до файла.";
        } else if (filePath.contains("/")) {
            return "Путь: " + filePath.substring(0, filePath.lastIndexOf("/") + 1) + "\n" +
            "Имя файла: " + filePath.substring(filePath.lastIndexOf("/") + 1);
        } else if (filePath.contains("\\")) {
            return "Путь: " + filePath.substring(0, filePath.lastIndexOf("\\") + 1) + "\n" +
            "Имя файла: " + filePath.substring(filePath.lastIndexOf("\\") + 1).replace("\"", "");
        }
        return "Ввведенное значение не похоже на путь к файлу";
    }
}
