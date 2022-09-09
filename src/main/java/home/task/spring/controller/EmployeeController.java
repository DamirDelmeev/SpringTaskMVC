package home.task.spring.controller;

import home.task.spring.model.Employee;
import home.task.spring.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping()
public class EmployeeController {
    @Autowired
    TaskService taskService;

    @GetMapping("employees")
    public List<Employee> getAllEmployee() {
        return taskService.getAllEmployee();
    }

    @GetMapping("employees/desc")
    public List<Employee> getAllEmployeeDesc() {
        return taskService.getAllEmployeeDesc();
    }

    @GetMapping("employees/name")
    public List<Employee> getNameOfAll() {
        return taskService.getNameOfAll();
    }

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return taskService.getEmployeeById(id);
    }

    @PostMapping("employee")
    public void addEmployee(@RequestBody Employee employee) {
        taskService.addEmployee(employee);
    }

    @DeleteMapping("employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        taskService.deleteEmployee(id);
    }
}
