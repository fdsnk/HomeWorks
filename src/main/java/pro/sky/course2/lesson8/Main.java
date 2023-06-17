package pro.sky.course2.lesson8;

public class Main {
    public static Employee[] employees() {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Петров", "Петр", "Петрович", 1, 32000);
        employee[1] = new Employee("Смирнов", "Семен", "Семенович", 2, 42000);
        employee[2] = new Employee("Иванов", "Иван", "Иванович", 3, 52000);
        employee[3] = new Employee("Сидорова", "Зинаида", "Федоровна", 4, 62000);
        employee[4] = new Employee("Сергеев", "Сергей", "Сергеевич", 5, 72000);

        return employee;
    }

    static Employee[] employee = employees();

    public static void listOfAllEmployees() {
        System.out.println("Список сотрудников:");
        for (Employee list : employee) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    public static void salaryExpensesPerMonth() {
        float sum = 0;
        for (Employee i : employee) {
            if (i != null) {
                sum += i.getSalary();
            }
        }
        System.out.printf('\n' + "Сумма затрат на зарплаты в месяц: %.2f" + '\n', sum);
    }


    public static void minSalaryEmployee() {
        Employee employeeWithMinSalary = null;
        for (Employee i : employee) {
            if (i != null) {
                if (employeeWithMinSalary == null || i.getSalary() < employeeWithMinSalary.getSalary()) {
                    employeeWithMinSalary = i;
                }
            }
        }
        System.out.println('\n' + "Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
    }

    public static void maxSalaryEmployee() {
        Employee employeeWithMaxSalary = null;
        for (Employee i : employee) {
            if (i != null) {
                if (employeeWithMaxSalary == null || i.getSalary() > employeeWithMaxSalary.getSalary()) {
                    employeeWithMaxSalary = i;
                }
            }
        }
        System.out.println('\n' + "Сотрудник с максимальной ЗП: " + employeeWithMaxSalary);
    }

    public static void averageValueOfSalaries() {
        float sum = 0;
        int department = 0;
        for (Employee i : employee) {
            if (i != null) {
                sum += i.getSalary();
                department = i.getDepartment();
            }
        }
        System.out.printf('\n' + "Среднее значение зарплат: %.2f" + '\n', sum / department);
    }

    public static void listOfEmployees() {
        System.out.println("\nСписок сотрудников:");
        String fullName;
        for (Employee i : employee) {
            if (i != null) {
                fullName = i.getFullName();
                System.out.println(fullName);
            }
        }
    }

    public static void main(String[] args) {
        listOfAllEmployees();
        salaryExpensesPerMonth();
        minSalaryEmployee();
        maxSalaryEmployee();
        averageValueOfSalaries();
        listOfEmployees();
    }
}
