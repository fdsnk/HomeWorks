package skypro.java.course1.coursework;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String fullName;
    private int department;
    private float salary;
    private static int counter;
    private final int id;

    public Employee(String lastName, String firstName, String middleName, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return '\n' + "Сотрудник №" + id + '\n' +
                "ФИО: " + fullName + '\n' +
                "Отдел: " + department + '\n' +
                "Зарплата: " + salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
