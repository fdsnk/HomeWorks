package pro.sky.course2.lesson13.junitcalculator.service;

import pro.sky.course2.lesson13.junitcalculator.exceptions.DivisionByZeroException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {
    CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusTestParam() {
        return Stream.of(
                Arguments.of(1, 3, "1 + 3 = 4"),
                Arguments.of(1, 3, "1 + 3 = 4"),
                Arguments.of(1, null, "Ошибка")
        );
    }

    @ParameterizedTest
    @MethodSource("plusTestParam")
    public void plusTest(Integer a, Integer b, String expected) {
        assertEquals(expected, calculatorService.plus(a, b));
    }

    public static Stream<Arguments> subtractionTestParam() {
        return Stream.of(
                Arguments.of(4, 3, "4 - 3 = 1"),
                Arguments.of(2, 1, "2 - 1 = 1"),
                Arguments.of(1, null, "Ошибка")
        );
    }

    @ParameterizedTest
    @MethodSource("subtractionTestParam")
    public void subtractionTest(Integer a, Integer b, String expected) {
        assertEquals(expected, calculatorService.subtraction(a, b));
    }

    public static Stream<Arguments> multiplyTestParam() {
        return Stream.of(
                Arguments.of(4, 3, "4 * 3 = 12"),
                Arguments.of(2, 1, "2 * 1 = 2"),
                Arguments.of(1, null, "Ошибка")
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyTestParam")
    public void multiplyTest(Integer a, Integer b, String expected) {
        assertEquals(expected, calculatorService.multiply(a, b));
    }

    public static Stream<Arguments> divideTestParam() {
        return Stream.of(
                Arguments.of(4, 2, "4 / 2 = 2.0"),
                Arguments.of(3, 3, "3 / 3 = 1.0"),
                Arguments.of(1, null, "Ошибка")
        );
    }

    @ParameterizedTest
    @MethodSource("divideTestParam")
    public void divideTest(Integer a, Integer b, String expected) {
        assertEquals(expected, calculatorService.divide(a, b));
    }

    public static Stream<Arguments> divideTestNegativeParam() {
        return Stream.of(
                Arguments.of(4, 0),
                Arguments.of(3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("divideTestNegativeParam")
    public void divideTestNegative(Integer a, Integer b) {
        assertThrows(DivisionByZeroException.class,()->calculatorService.divide(a,b));
    }

    public static Stream<Arguments> checkNullTestParam() {
        return Stream.of(
                Arguments.of(1,1,false),
                Arguments.of(1,null,true)
        );
    }
    @ParameterizedTest
    @MethodSource("checkNullTestParam")
    public void checkNullTest(Integer a, Integer b, Boolean expected){
        assertEquals(expected,calculatorService.checkNull(a,b));
    }
}
