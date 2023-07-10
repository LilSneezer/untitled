package tests.task2_54;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task2_54.Issue2;

import java.util.stream.Stream;

public class SecondTaskTest {

    @ParameterizedTest
    @MethodSource("provideTestDataForCheckingFilePath")
    @Description("Тест для задание 2.54(2)")
    public void checkFilePath(String input, String expected) {
        Assertions.assertEquals(Issue2.checkIncorrectPath(input), expected);
    }

    private static Stream<Arguments> provideTestDataForCheckingFilePath() {
        return Stream.of(
                Arguments.of("/", "Введен некорректный путь до файла."),
                Arguments.of("\\", "Введен некорректный путь до файла."),
                Arguments.of("/bin/java", "Путь: /bin/\n" + "Имя файла: java"),
                Arguments.of("C:\\Program Files\\Java\\bin\\java",
                        "Путь: C:\\Program Files\\Java\\bin\\\n" +
                        "Имя файла: java")
        );
    }
}
