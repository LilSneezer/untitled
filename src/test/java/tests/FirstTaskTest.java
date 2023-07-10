package tests;


import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task2_54.Issue1;

import java.util.stream.Stream;

public class FirstTaskTest {

    @ParameterizedTest
    @MethodSource("provideStringsForCheckingSubstrLength")
    @Description("Тест к заданию 2.54(1)")
    public void checkSubStrLength(String input, int expected) {
        Assertions.assertEquals(Issue1.getSubStrLength(input), expected);
    }

    private static Stream<Arguments> provideStringsForCheckingSubstrLength() {
        return Stream.of(
                Arguments.of("Ц", 0),
                Arguments.of("а", 7),
                Arguments.of(".", 57)
        );
    }
}
