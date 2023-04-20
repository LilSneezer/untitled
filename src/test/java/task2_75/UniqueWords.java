package task2_75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        System.out.println("Полученная последовательность: " + Arrays.toString(args));
        System.out.println("Уникальные слова: " + getUniqueWords(args));
    }

    public static Set getUniqueWords(String[] words) {
        return new HashSet<>(Arrays.asList(words));
    }
}
