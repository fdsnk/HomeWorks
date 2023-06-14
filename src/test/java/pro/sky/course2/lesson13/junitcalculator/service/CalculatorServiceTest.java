package pro.sky.course2.lesson13.junitcalculator.service;

import pro.sky.course2.lesson13.junitcalculator.exceptions.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        String actual = calculatorService.plus(1,2);
        String expected = "1 + 2 = 3";
        assertEquals(expected,actual);

        actual = calculatorService.plus(1,null);
        expected = "Ошибка";
        assertEquals(expected,actual);
    }
    @Test
    public void subtractionTest() {
        String actual = calculatorService.subtraction(2,1);
        String expected = "2 - 1 = 1";
        assertEquals(expected,actual);

        actual = calculatorService.plus(2,null);
        expected = "Ошибка";
        assertEquals(expected,actual);
    }
    @Test
    public void multiplyTest() {
        String actual = calculatorService.multiply(2,2);
        String expected = "2 * 2 = 4";
        assertEquals(expected,actual);

        actual = calculatorService.plus(2,null);
        expected = "Ошибка";
        assertEquals(expected,actual);
    }
    @Test
    public void divideTest() {
        String actual = calculatorService.divide(4,2);
        String expected = "4 / 2 = 2.0";
        assertEquals(expected,actual);

        actual = calculatorService.plus(4,null);
        expected = "Ошибка";
        assertEquals(expected,actual);
    }
    @Test
    public void divideNegativeTest(){
        assertThrows(DivisionByZeroException.class,()->calculatorService.divide(1,0));
        assertThrows(DivisionByZeroException.class,()->calculatorService.divide(4,0));
    }
    @Test
    public void checkNullFalseTest(){
        Boolean actual = calculatorService.checkNull(1,2);
        assertFalse(actual);

    }

    @Test
    public void checkNullTrueTest(){
        Boolean actual = calculatorService.checkNull(1,null);
        assertTrue(actual);

    }
    @Test
    public void helloTest(){
        String actual = calculatorService.hello();
        String expected = "Добро пожаловать в калькулятор";
        assertEquals(expected,actual);
    }
}
