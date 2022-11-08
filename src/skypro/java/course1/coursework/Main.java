package skypro.java.course1.coursework;

import java.util.Arrays;

public class Main {
    public static Employee[] employees() {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Петров", "Петр", "Петрович", 1, 32000);
        employee[1] = new Employee("Смирнов", "Семен", "Семенович", 2, 42000);
        return employee;
    }

    static Employee[] employee = employees();

    public static void listOfAllEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee list : employee) {
            if (list == null) {
                break;
            }
            System.out.println(list);
        }
    }

    public static void salaryExpensesPerMonth() {
        float sum = 0;
        for (Employee i : employee) {
            if (i == null) {
                break;
            }
            sum += i.salary;
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
    }

    public static void minimumSalaryEmployee() {
        float minSalary = 1_000_000;
        String fullName = null;
        int department = 0;
        int id = 0;
        for (Employee i : employee) {
            if (i == null) {
                break;
            } else if (i.salary < minSalary) {
                minSalary = i.salary;
                fullName = i.fullName;
                department = i.department;
                id = i.id;
            }
        }
        System.out.println('\n' + "Минимальная зарплата у сотрудника №" + id + '\n' + "ФИО: " +
                fullName + '\n' + "Отдел: " + department + '\n' + "Зарплата: " + minSalary);

    }

    public static void main(String[] args) {
        listOfAllEmployees();
        salaryExpensesPerMonth();
        minimumSalaryEmployee();
    }
}
