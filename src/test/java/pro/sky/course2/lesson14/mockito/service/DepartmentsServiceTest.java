package pro.sky.course2.lesson14.mockito.service;

import pro.sky.course2.lesson14.mockito.domain.Employee;
import pro.sky.course2.lesson14.mockito.exceptions.EmployeeNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static pro.sky.course2.lesson14.mockito.constant.Constant.*;
import static java.util.Collections.*;
import static java.util.Collections.emptyMap;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DepartmentsServiceTest {
    @Mock
    private EmployeeService employeeServiceMock;
    @InjectMocks
    private DepartmentsService out;

    @Test
    void getMinSalaryByDep() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        assertEquals(EMPLOYEE_MIN, out.getMinSalaryByDep(CORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();

    }

    @Test
    void getMaxSalaryByDep() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        assertEquals(EMPLOYEE_MAX, out.getMaxSalaryByDep(CORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();
    }

    @Test
    void getMinMaxSalaryByDepException() {
        when(employeeServiceMock.getEmployees()).thenThrow(EmployeeNotFoundException.class);

        assertThrows(EmployeeNotFoundException.class, () -> out.getMinSalaryByDep(INCORRECT_DEPARTMENT));
        assertThrows(EmployeeNotFoundException.class, () -> out.getMaxSalaryByDep(INCORRECT_DEPARTMENT));
    }


    @Test
    void getSumSalaryByCorrectDep() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        assertEquals(EMPLOYEE_SUM,out.getSumSalaryByDep(CORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();
    }
    @Test
    void getSumSalaryByIncorrectDep() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        assertEquals(0,out.getSumSalaryByDep(INCORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();
    }

    @Test
    void getSumSalaryByDepNotExist() {
        when(employeeServiceMock.getEmployees()).thenReturn(emptyMap());

        assertEquals(0,out.getSumSalaryByDep(CORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();
    }

    @Test
    void employeesByCorrectDepartment() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        List<Employee> expected = EMPLOYEE_LIST.values().stream().toList();

        assertEquals(expected,out.employeesByDepartment(CORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();
    }
    @Test
    void employeesByIncorrectDepartment() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        assertEquals(emptyList(),out.employeesByDepartment(INCORRECT_DEPARTMENT));

        verify(employeeServiceMock, times(1)).getEmployees();
    }
    @Test
    void employeesByDepartmentNotExist() {
        when(employeeServiceMock.getEmployees()).thenReturn(emptyMap());

        assertTrue(out.employeesByDepartment(CORRECT_DEPARTMENT).isEmpty());

        verify(employeeServiceMock, times(1)).getEmployees();
    }

    @Test
    void employeesByDepartments() {
        when(employeeServiceMock.getEmployees()).thenReturn(EMPLOYEE_LIST);

        Map<Integer,List<Employee>> expected = EMPLOYEE_LIST.values().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        assertEquals(expected, out.employeesByDepartments());

        verify(employeeServiceMock, times(1)).getEmployees();
    }

    @Test
    void employeesByDepartmentsNotExist() {
        when(employeeServiceMock.getEmployees()).thenReturn(emptyMap());

        assertTrue(out.employeesByDepartments().isEmpty());

        verify(employeeServiceMock, times(1)).getEmployees();
    }
}