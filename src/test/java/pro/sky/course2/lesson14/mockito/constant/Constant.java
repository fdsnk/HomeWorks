package pro.sky.course2.lesson14.mockito.constant;

import pro.sky.course2.lesson14.mockito.domain.Employee;

import java.util.Map;

public class Constant {
    public final static Employee EMPLOYEE = new Employee("Ivan","Ivanov", 10,1);
    public final static Employee EMPLOYEE_MIN = new Employee("Ivan","Ivanov", 10,1);
    public final static Employee EMPLOYEE_MAX = new Employee("Dima","Ivanov", 20,1);
    public final static String GOOD_NAME = "Ivan";
    public final static String BAD_NAME = "Ivan12";
    public final static int EMPLOYEE_SUM = 30;
    public final static double EMPLOYEE_AVERAGE = 15.0;
    public final static int EMPLOYEE_NEW_SALARY = 5;
    public final static int EMPLOYEE_NEW_DEPARTMENT = 2;
    public final static int CORRECT_DEPARTMENT = 1;
    public final static int INCORRECT_DEPARTMENT = 2;

    public final static Map<String,Employee> EMPLOYEE_LIST = Map.of(
            EMPLOYEE_MIN.getFullName(),
            EMPLOYEE_MIN,
            EMPLOYEE_MAX.getFullName(),
            EMPLOYEE_MAX
    );


}
