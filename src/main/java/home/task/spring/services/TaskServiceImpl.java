package home.task.spring.services;

import home.task.spring.model.Customer;
import home.task.spring.model.Employee;
import home.task.spring.model.Position;
import home.task.spring.model.Project;
import home.task.spring.repository.CustomerRepository;
import home.task.spring.repository.EmployeeRepository;
import home.task.spring.repository.PositionRepository;
import home.task.spring.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    PositionRepository positionRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Transactional
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Transactional
    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerById(id);
    }

    @Transactional
    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Transactional
    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomer(id);
    }

    @Transactional
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Transactional
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getEmployeeById(id);
    }

    @Transactional
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Transactional
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployee(id);
    }

    @Transactional
    @Override
    public List<Position> getAllPosition() {
        return positionRepository.getAllPosition();
    }

    @Transactional
    @Override
    public Position getPositionById(Long id) {
        return positionRepository.getPositionById(id);
    }

    @Transactional
    @Override
    public void addPosition(Position position) {
        positionRepository.addPosition(position);
    }

    @Transactional
    @Override
    public void deletePosition(Long id) {
        positionRepository.deletePosition(id);
    }

    @Transactional
    @Override
    public List<Project> getAllProject() {
        return projectRepository.getAllProject();
    }

    @Transactional
    @Override
    public Project getProjectById(Long id) {
        return projectRepository.getProjectById(id);
    }

    @Transactional
    @Override
    public void addProject(Project project) {
        projectRepository.addProject(project);
    }

    @Transactional
    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteProject(id);
    }

    @Transactional
    @Override
    public List<Employee> getAllEmployeeDesc() {
        return employeeRepository.getAllEmployeeDesc();
    }

    @Transactional
    @Override
    public List<Employee> getNameOfAll() {
        return employeeRepository.getNameOfAllSortedById();
    }
}