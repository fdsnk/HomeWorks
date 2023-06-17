package pro.sky.course2.lesson14.mockito.service;

import pro.sky.course2.lesson14.mockito.domain.Employee;
import pro.sky.course2.lesson14.mockito.exceptions.EmployeeAlreadyAddedException;
import pro.sky.course2.lesson14.mockito.exceptions.EmployeeNotFoundException;
import pro.sky.course2.lesson14.mockito.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static pro.sky.course2.lesson14.mockito.constant.Constant.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;


class EmployeeServiceTest {
    private EmployeeService out;

    @BeforeEach
    void setUp() {
        out = new EmployeeService();
    }

    @Test
    void getEmployees() {
        out.add("Ivan", "Ivanov", 10, 1);

        Map<String, Employee> extend = Map.of(EMPLOYEE.getFullName(), EMPLOYEE);

        assertEquals(extend, out.getEmployees());
    }

    @Test
    void getEmployeesNotExist() {
        assertTrue(out.getEmployees().isEmpty());
    }

    @Test
    void addCorrectName() {
        Employee result = out.add("Ivan", "Ivanov", 10, 1);

        assertEquals(EMPLOYEE, result);

    }

    @Test
    void addUpperCaseName() {
        Employee result = out.add("IVAN", "Ivanov", 10, 1);

        assertEquals(GOOD_NAME, result.getFirstName());

    }

    @Test
    void addWhenKeyEqual() {
        out.add("Ivan", "Ivanov", 10, 1);

        assertThrows(EmployeeAlreadyAddedException.class, () -> out.add(
                "Ivan",
                "Ivanov",
                10,
                1));

    }

    @Test
    void removeCorrectName() {
        out.add("Ivan", "Ivanov", 10, 1);

        Employee result = out.remove("Ivan", "Ivanov", 10, 1);

        assertEquals(EMPLOYEE, result);
    }

    @Test
    void removeNotExist() {
        assertThrows(EmployeeNotFoundException.class, () -> out.remove(
                "Ivan",
                "Ivanov",
                10,
                1));
    }

    @Test
    void findCorrectName() {
        out.add("Ivan", "Ivanov", 10, 1);

        Employee result = out.find("Ivan", "Ivanov", 10, 1);

        assertEquals(EMPLOYEE,result);
    }

    @Test
    void findNotExist() {
        assertThrows(EmployeeNotFoundException.class, () -> out.find(
                "Ivan",
                "Ivanov",
                10,
                1));
    }

    @Test
    void changeEmployeeSalaryCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);

        Employee result = out.changeEmployeeSalary("Ivan", "Ivanov", 5);

        assertEquals(EMPLOYEE, result);
        assertEquals(EMPLOYEE_NEW_SALARY, result.getSalary());
    }

    @Test
    void changeEmployeeSalaryNotExist() {
        assertThrows(EmployeeNotFoundException.class, ()->out.changeEmployeeSalary(
                "Ivan",
                "Ivanov",
                5));
    }

    @Test
    void changeEmployeeDepartCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);

        Employee result = out.changeEmployeeDepart("Ivan", "Ivanov", 2);

        assertEquals(EMPLOYEE, result);
        assertEquals(EMPLOYEE_NEW_DEPARTMENT, result.getDepartment());
    }

    @Test
    void changeEmployeeDepartNotExist() {
        assertThrows(EmployeeNotFoundException.class, ()->out.changeEmployeeDepart(
                "Ivan",
                "Ivanov",
                2));
    }

    @Test
    void employeesByDepartmentCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);

        List<Employee> extend = List.of(EMPLOYEE);
        List<Employee> result = out.employeesByDepartment(CORRECT_DEPARTMENT);

        assertEquals(extend,result);
    }

    @Test
    void employeesByDepartmentNotExist() {

        assertTrue(out.employeesByDepartment(anyInt()).isEmpty());
    }

    @Test
    void getAllSalaryCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);
        out.add("Dima", "Ivanov", 20, 1);

        assertEquals(EMPLOYEE_SUM, out.getAllSalary());
    }

    @Test
    void getAllSalaryCorrectNotExist() {

        assertEquals(0, out.getAllSalary());
    }

    @Test
    void getEmployeeMinSalaryCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);
        out.add("Dima", "Ivanov", 20, 1);

        assertEquals(EMPLOYEE_MIN, out.getEmployeeMinSalary());
    }

    @Test
    void getEmployeeMaxSalaryCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);
        out.add("Dima", "Ivanov", 20, 1);

        assertEquals(EMPLOYEE_MAX, out.getEmployeeMaxSalary());
    }

    @Test
    void getEmployeeMaxMinSalaryNotExist() {

        assertThrows(EmployeeNotFoundException.class, ()->out.getEmployeeMaxSalary());
        assertThrows(EmployeeNotFoundException.class, ()->out.getEmployeeMinSalary());
    }

    @Test
    void getAverageSalaryCorrect() {
        out.add("Ivan", "Ivanov", 10, 1);
        out.add("Dima", "Ivanov", 20, 1);

        assertEquals(EMPLOYEE_AVERAGE, out.getAverageSalary());
    }

    @Test
    void getAverageSalaryNotExist() {

        assertEquals(0, out.getAverageSalary());
    }

    @Test
    void showAll() {
        out.add("Ivan", "Ivanov", 10, 1);
        out.add("Dima", "Ivanov", 20, 1);

        Collection<Employee> expected = Collections.unmodifiableCollection(EMPLOYEE_LIST.values());
        Collection<Employee> result = out.showAll();

        assertIterableEquals(expected,result);
    }

    @Test
    void validateCorrect(){
        try {
            Method method = EmployeeService.class.getDeclaredMethod("validate", String.class, String.class);
            method.setAccessible(true);
            assertNull((method.invoke(out, GOOD_NAME, GOOD_NAME)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void validateIncorrectNameException(){

        assertThrows(InvalidInputException.class, ()-> out.add(
                "Ivan123",
                "Ivanov",
                10,
                1));
    }


}