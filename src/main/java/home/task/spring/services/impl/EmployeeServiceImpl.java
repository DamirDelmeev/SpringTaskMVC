package home.task.spring.services.impl;

import home.task.spring.model.Employee;
import home.task.spring.repository.EmployeeRepository;
import home.task.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getEmployeeById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployee(id);
    }

    @Override
    public List<Employee> getAllEmployeeDesc() {
        return employeeRepository.getAllEmployeeDesc();
    }

    @Override
    public List<Employee> getNameOfAll() {
        return employeeRepository.getNameOfAllSortedById();
    }
}
