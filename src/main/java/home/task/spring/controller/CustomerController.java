package home.task.spring.controller;

import home.task.spring.model.Customer;
import home.task.spring.services.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("customers")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @ApiOperation(value = "Find customer by id.",
            notes = "Find one of the customer from db .",
            response = Customer.class)
    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @ApiOperation(value = "Add new customer",
            notes = "Add new customer in db .",
            response = HttpStatus.class)
    @PostMapping("customer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @ApiOperation(value = "Delete  customer",
            notes = "Delete  customer from db .",
            response = HttpStatus.class)
    @DeleteMapping("customer/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
