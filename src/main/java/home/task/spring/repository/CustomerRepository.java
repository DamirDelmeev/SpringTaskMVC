package home.task.spring.repository;

import home.task.spring.model.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    public List<Customer> getAllCustomer() {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.createQuery("from Customer ", Customer.class).getResultList();
    }

    public Customer getCustomerById(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.get(Customer.class, id);
    }

    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.saveOrUpdate(customer);
    }

    public void deleteCustomer(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.delete(session.get(Customer.class, id));
    }
}