package home.task.spring.repository;

import home.task.spring.model.Position;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    public List<Position> getAllPosition() {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.createQuery("from Position ", Position.class).getResultList();
    }

    public Position getPositionById(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.get(Position.class, id);
    }

    public void addPosition(Position position) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.saveOrUpdate(position);
    }

    public void deletePosition(Long id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.delete(session.get(Position.class, id));
    }
}