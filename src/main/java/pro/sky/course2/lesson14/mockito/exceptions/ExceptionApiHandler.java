package pro.sky.course2.lesson14.mockito.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionApiHandler {
    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Список сотрудников переполнен")
    @ExceptionHandler(EmployeeStorageIsFullException.class)
    public String handelExceptionAdd(EmployeeStorageIsFullException exception) {
        return exception.getMessage();
    }

    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Такой сотрудник уже есть в списке")
    @ExceptionHandler(EmployeeAlreadyAddedException.class)
    public String handelExceptionAdd(EmployeeAlreadyAddedException exception) {
        return exception.getMessage();
    }

    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Такой сотрудник не найден")
    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handelExceptionAdd(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Недопустимые символы")
    @ExceptionHandler(InvalidInputException.class)
    public String handelExceptionAdd(InvalidInputException exception) {
        return exception.getMessage();
    }


}
