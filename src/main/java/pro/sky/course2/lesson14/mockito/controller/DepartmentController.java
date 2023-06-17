package pro.sky.course2.lesson14.mockito.controller;

import pro.sky.course2.lesson14.mockito.domain.Employee;
import pro.sky.course2.lesson14.mockito.service.DepartmentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentsService departmentsService;

    public DepartmentController(DepartmentsService departmentsService) {
        this.departmentsService = departmentsService;
    }

    @GetMapping("/{id}/employees")
    public List<Employee> showEmployeeByDepartment(@PathVariable int id){
        return departmentsService.employeesByDepartment(id);
    }
    @GetMapping("/{id}/salary/sum")
    public Integer showSalarySumByDepartment(@PathVariable int id){
        return departmentsService.getSumSalaryByDep(id);
    }
    @GetMapping("/{id}/salary/max")
    public Employee showSalaryMaxByDepartment(@PathVariable int id){
        return departmentsService.getMaxSalaryByDep(id);
    }
    @GetMapping("/{id}/salary/min")
    public Employee showSalaryMinByDepartment(@PathVariable int id){
        return departmentsService.getMinSalaryByDep(id);
    }
    @GetMapping("/employees")
    public Map<Integer, List<Employee>> showSalaryMinByDepartment(){
        return departmentsService.employeesByDepartments();
    }
}