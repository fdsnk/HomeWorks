package pro.sky.course2.lesson14.mockito.controller;


import pro.sky.course2.lesson14.mockito.domain.Employee;
import pro.sky.course2.lesson14.mockito.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collection;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName,
                                @RequestParam String lastName,
                                @RequestParam Integer salary,
                                @RequestParam Integer depart) {
        return employeeService.add(firstName, lastName, salary, depart);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName,
                                   @RequestParam String lastName,
                                   @RequestParam Integer salary,
                                   @RequestParam Integer depart) {
        return employeeService.remove(firstName, lastName, salary, depart);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam Integer salary,
                                 @RequestParam Integer depart) {
        return employeeService.find(firstName, lastName, salary, depart);
    }

    @GetMapping("/all")
    public Collection<Employee> findEmployeeAll() {
        return employeeService.showAll();
    }

    @GetMapping("/setSalary")
    public Employee changeSalary(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam Integer newSalary) {
        return employeeService.changeEmployeeSalary(firstName, lastName, newSalary);
    }

    @GetMapping("/setDepart")
    public Employee changeDepart(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam Integer newDepart) {
        return employeeService.changeEmployeeDepart(firstName, lastName, newDepart);
    }

    @GetMapping("/depart")
    public List<Employee> employeeByDepart(@RequestParam Integer dep) {
        return employeeService.employeesByDepartment(dep);
    }

    @GetMapping("/allSalary")
    public String allSalary() {
        return "зарплата всех сотрудников : " + employeeService.getAllSalary();
    }

    @GetMapping("/minSalary")
    public Employee min() {
        return employeeService.getEmployeeMinSalary();
    }

    @GetMapping("/maxSalary")
    public Employee max() {
        return employeeService.getEmployeeMaxSalary();
    }

    @GetMapping("/average")
    public String averageSalary() {
        return "средняя зарплата сотрудников : " + employeeService.getAverageSalary();
    }

}
