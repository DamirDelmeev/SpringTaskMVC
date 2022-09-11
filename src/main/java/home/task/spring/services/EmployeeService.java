package home.task.spring.services;

import home.task.spring.model.Employee;

import java.util.List;


public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee getEmployeeById(Long id);

    void addEmployee(Employee employee);

    void deleteEmployee(Long id);

    List<Employee> getAllEmployeeDesc();

    List<Employee> getNameOfAll();
}
