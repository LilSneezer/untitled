package task2_54;

public class Issue2 {
    public static void main(String[] args) {
        String filePath = args[0];
        System.out.println("Путь из аргументов командной строки: " + filePath);
        if (filePath.endsWith("/")
                || filePath.endsWith("\\")
                || filePath.substring(0, filePath.length() - 1).endsWith("\\")) {
            System.out.println("Введен некорректный путь до файла.");
        } else if (filePath.contains("/")) {
            System.out.println("Путь: " + filePath.substring(0, filePath.lastIndexOf("/") + 1));
            System.out.println("Имя файла: " + filePath.substring(filePath.lastIndexOf("/") + 1));
        } else if (filePath.contains("\\")) {
            System.out.println("Путь: " + filePath.substring(0, filePath.lastIndexOf("\\") + 1));
            System.out.println("Имя файла: " + filePath.substring(filePath.lastIndexOf("\\") + 1).replace("\"", ""));
        }
    }
}
