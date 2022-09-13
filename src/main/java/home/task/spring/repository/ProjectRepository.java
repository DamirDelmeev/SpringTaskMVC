package home.task.spring.repository;

import home.task.spring.model.Project;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    public List<Project> getAllProject() {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.createQuery("from Project ", Project.class).getResultList();
    }

    public Project getProjectById(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.get(Project.class, id);
    }

    public void addProject(Project project) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.saveOrUpdate(project);
    }

    public void deleteProject(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.delete(session.get(Project.class, id));
    }
}
