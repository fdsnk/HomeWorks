package pro.sky.course2.lesson13.junitcalculator.service;

import pro.sky.course2.lesson13.junitcalculator.exceptions.DivisionByZeroException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        }
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String subtraction(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        }
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }


    public String multiply(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        }
        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    public String divide(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            return "Ошибка";
        } else if (num2 == 0) {
            throw new DivisionByZeroException();
        }
        double sum = (double)num1 / (double)num2;
        return num1 + " / " + num2 + " = " + sum;
    }

    public boolean checkNull(Integer num1, Integer num2) {
        return (Objects.isNull(num1) || Objects.isNull(num2));
    }


}
