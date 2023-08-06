package tests.task2_54;


import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import task4_4.*;
import task4_4.Double;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FourthTaskTest {

    @ParameterizedTest
    @MethodSource("provideOperationObjectsTestData")
    @Description("Позитивный тест для метода CreateOperationObject задания 4.4")
    public void checkCreateOperationObjectPos(String input, Function expected) {
        Assertions.assertEquals(Objects.requireNonNull(MathOperation.createOperationObject(input)).getClass(), expected.getClass());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Triple"})
    @Description("Негативный тест для метода CreateOperationObject задания 4.4")
    public void checkCreateOperationObjectNeg(String strings) {
        Assertions.assertNull(MathOperation.createOperationObject(strings));
    }

    @Test
    @Description("Позитивные тесты для метода applyFunction задания 4.4")
    public void checkApplyFunctionPos() {
        Assertions.assertEquals(MathOperation.applyFunction(getInputTestData(), new Half()),
                getInputTestData().stream().map(el -> el / 2).collect(Collectors.toList()));
        Assertions.assertEquals(MathOperation.applyFunction(getInputTestData(), new Exact()), getInputTestData());
        Assertions.assertEquals(MathOperation.applyFunction(getInputTestData(), new Double()),
                getInputTestData().stream().map(el -> el*2).collect(Collectors.toList()));
        Assertions.assertEquals(MathOperation.applyFunction(getInputTestData(), new Square()),
                getInputTestData().stream().map(el -> el*el).collect(Collectors.toList()));
    }

    @Test
    @Description("Тест для метода checkOperationName задания 4.4. Не поддерживается название операции")
    public void checkOperationNameDoesNotSupport() {
        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class,
                () -> MathOperation.checkOperationName("Triple")
        );
        Assertions.assertEquals("Операция %s не поддерживается.", runtimeException.getMessage());
    }

    @Test
    @Description("Тест для метода checkOperationName задания 4.4. Передано пустое название операции")
    public void passEmptyOperationName() {
        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class,
                () -> MathOperation.checkOperationName("")
        );
        Assertions.assertEquals("Не передано название операции.", runtimeException.getMessage());
    }

    @Test
    @Description("Тест для метода checkOperationName задания 4.4. Передано числовое название операции")
    public void passNumericOperationName() {
        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class,
                () -> MathOperation.checkOperationName("1")
        );
        Assertions.assertEquals("Не передано название операции.", runtimeException.getMessage());
    }

    @Test
    @Description("Тест для метода checkOperationName задания 4.4. Передано допустимое название операции")
    public void passCorrectOperationName() {
        Assertions.assertEquals(MathOperation.checkOperationName("Half"), "Half");
    }

    private static ArrayList<Integer> getInputTestData() {
        ArrayList<Integer> testInputData = new ArrayList<>();
        testInputData.add(1);
        testInputData.add(2);
        testInputData.add(4);
        testInputData.add(8);
        return testInputData;
    }

    private static Stream<Arguments> provideOperationObjectsTestData() {
        return Stream.of(
                Arguments.of("Half", new Half()),
                Arguments.of("Double", new Double()),
                Arguments.of("Exact", new Exact()),
                Arguments.of("Square", new Square())
        );
    }
}
