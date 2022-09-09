package home.task.spring.services;

import home.task.spring.model.Customer;
import home.task.spring.model.Employee;
import home.task.spring.model.Position;
import home.task.spring.model.Project;

import java.util.List;

public interface TaskService {
    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);

    void addCustomer(Customer customer);

    void deleteCustomer(Long id);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(Long id);

    void addEmployee(Employee employee);

    void deleteEmployee(Long id);

    List<Position> getAllPosition();

    Position getPositionById(Long id);

    void addPosition(Position position);

    void deletePosition(Long id);

    List<Project> getAllProject();

    Project getProjectById(Long id);

    void addProject(Project project);

    void deleteProject(Long id);

    List<Employee> getAllEmployeeDesc();

    List<Employee> getNameOfAll();
}