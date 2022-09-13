package home.task.spring.services;

import home.task.spring.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);

    void addCustomer(Customer customer);

    void deleteCustomer(Long id);
}
