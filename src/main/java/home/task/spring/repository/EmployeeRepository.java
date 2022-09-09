package home.task.spring.repository;

import home.task.spring.model.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    public List<Employee> getAllEmployee() {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.createQuery("from Employee ", Employee.class).getResultList();
    }

    public Employee getEmployeeById(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.get(Employee.class, id);
    }

    public void addEmployee(Employee employee) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.saveOrUpdate(employee);
    }

    public void deleteEmployee(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.delete(session.get(Employee.class, id));
    }

    public List<Employee> getAllEmployeeDesc() {
        Session session = sessionFactory.getObject().getCurrentSession();
        List<Employee> resultList =
                session.createQuery("select e from Employee e order by e.name desc ", Employee.class).getResultList();
        return resultList;
    }

//    public List<Employee> getNameOfAll() {
//        Session session = sessionFactory.getObject().getCurrentSession();
//        List<Employee> resultList = session.createQuery
//                ("select Employee from Employee inner join Project on Employee .project=Project .id," +
//                        "Employee .class").getResultList();
//        return null;
//    }
}
